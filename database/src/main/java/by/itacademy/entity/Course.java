package by.itacademy.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "course")
@ToString(exclude = {"students", "grades", "reviews"})
public class Course extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "subject", nullable = false)
    private Subject subject;

    @Column(name = "specialization")
    private String specialization;

//    @Column(name = "start_date")
//    private Integer dateStart;
//
//    @Column(name="end_date")
//    private Integer dateEnd;

    @AttributeOverrides(value = {
            @AttributeOverride(name = "city", column = @Column(name = "location_city")),
            @AttributeOverride(name = "street", column = @Column(name = "location_street")),
            @AttributeOverride(name = "flat", column = @Column(name = "location_office")),
    })
    private Address address;

    @OneToOne
    @JoinColumn(name = "instructor_id", nullable = false)
    private Instructor instructor;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>();

    @OneToMany(mappedBy = "course")
    private Set<Grade> grades = new HashSet<>();

    @OneToMany(mappedBy = "course")
    private Set<Review> reviews = new HashSet<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Course(Subject subject, String specialization, Address address, Instructor instructor) {
        this.subject = subject;
        this.specialization = specialization;
        this.address = address;
        this.instructor = instructor;
    }
}
