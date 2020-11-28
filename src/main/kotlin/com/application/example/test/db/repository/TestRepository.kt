package com.application.example.test.db.repository

import com.application.example.test.db.entity.Test
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository: JpaRepository<Test, Int> {
}