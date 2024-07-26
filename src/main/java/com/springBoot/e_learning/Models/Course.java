package com.springBoot.e_learning.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Course extends BaseEntity {
    private String title;
    private String description;
    @ManyToMany(mappedBy = "courses")
    private List<Author> authors;
    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
