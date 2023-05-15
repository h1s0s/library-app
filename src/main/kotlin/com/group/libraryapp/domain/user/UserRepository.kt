package com.group.libraryapp.domain.user

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

interface UserRepository : JpaRepository<User, Long>{

    fun findByName(name: String): User?
}