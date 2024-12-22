package com.libraryapp.repository

import com.libraryapp.model.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface CategoryRepository extends JpaRepository<Category, Long> {
}