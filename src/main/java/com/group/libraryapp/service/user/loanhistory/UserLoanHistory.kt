package com.group.libraryapp.service.user.loanhistory

import com.group.libraryapp.domain.user.JavaUser
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class UserLoanHistory(
        @ManyToOne
    private val user : JavaUser,
        private val bookName : String,
        private var isReturn : Boolean,
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id : Long? = null,
) {
    fun doReturn(){
        this.isReturn = true
    }
}