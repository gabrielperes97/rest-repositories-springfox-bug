package com.application.example.test.controller

import com.application.example.test.db.entity.Test
import com.application.example.test.db.repository.TestRepository
import org.springframework.web.bind.annotation.*

@RestController
class TestRestController(
        private val testRepository: TestRepository
) {

    @GetMapping("/hello")
    suspend fun hello(): String {
        return "Hello"
    }

    @PostMapping("/test")
    suspend fun save(@RequestParam("dsTest") dsTest: String): Test {
        return testRepository.save(Test(dsTest = dsTest))
    }

    @GetMapping("/test/{id}")
    suspend fun get(@PathVariable("id") id: Int): Test {
        return testRepository.findById(id).orElseThrow { RuntimeException("Test $id not found") }
    }
}