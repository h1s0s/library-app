package com.group.libraryapp.domain.user

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

interface UserRepository : JpaRepository<User, Long>, UserRepositoryCustom{

    fun findByName(name: String): User?

    //조인쿼리, query dsl
    //JOIN FETCH라고 명시를 해주어야, User안에 넣어짐
//    @Query("SELECT DISTINCT u FROM User u LEFT JOIN FETCH u.userLoanHistories")
//    fun findAllWithHistories(): List<User>
}