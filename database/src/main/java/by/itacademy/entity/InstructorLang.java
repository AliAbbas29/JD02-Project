package by.itacademy.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("language")
@ToString(callSuper = true)
public class InstructorLang extends Instructor{

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "specialization", nullable = false)
    private String specialization;

    @Column(name ="experience_years",nullable = true)
    private int experience;

    public InstructorLang(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }
}
