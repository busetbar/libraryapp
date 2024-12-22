package com.libraryapp.controller

import com.libraryapp.model.Book
import com.libraryapp.model.Category
import com.libraryapp.repository.BookRepository
import com.libraryapp.repository.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1")
class LibraryController {

    @Autowired
    CategoryRepository categoryRepository

    @Autowired
    BookRepository bookRepository

    @GetMapping("/categories")
    List<Category> getCategories() {
        return categoryRepository.findAll()
    }

    @PostMapping("/categories")
    Category addCategory(@RequestBody Category category) {
        return categoryRepository.save(category)
    }

    @GetMapping("/books")
    List<Book> getBooks() {
        return bookRepository.findAll()
    }

    @PostMapping("/books")
    Book addBook(@RequestBody Book book) {
        return bookRepository.save(book)
    }
}