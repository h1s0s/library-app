package com.group.libraryapp.service.user

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class User(
    private val name : String,
    private val age : Int,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id : Long? = null,
) {
}