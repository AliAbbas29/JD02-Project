package by.itacademy.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"course", "grades"})
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "phonenumber", nullable = true)
    private long phonenumber;

    private Address address;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Student(String name, long phonenumber, Address address, Course course) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.course = course;
    }

    @OneToMany(mappedBy = "student")
    private Set<Grade> grades = new HashSet<>();
}
