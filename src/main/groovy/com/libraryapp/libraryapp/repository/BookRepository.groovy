package com.libraryapp.repository

import com.libraryapp.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface BookRepository extends JpaRepository<Book, Long> {
}