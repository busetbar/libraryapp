package com.libraryapp.model

import javax.persistence.*;
import lombok.*

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    String title
    String author

    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category
}