package com.libraryapp.model

import javax.persistence.*;
import lombok.*

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    String name

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    List<Book> books = []
}