package com.bookstudio.shared.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "LiteraryGenres")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LiteraryGenre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LiteraryGenreID")
	private Long literaryGenreId;

	@Column(name = "Name", nullable = false, unique = true, length = 255)
	private String name;
}
