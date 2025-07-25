package com.bookstudio.shared.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Faculties")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FacultyID")
    private Long facultyId;

    @Column(name = "Name", nullable = false, unique = true)
    private String name;
}
