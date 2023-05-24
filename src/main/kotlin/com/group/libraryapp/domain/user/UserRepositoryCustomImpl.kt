package com.group.libraryapp.domain.user

import com.group.libraryapp.domain.user.QUser.user
import com.group.libraryapp.domain.user.loanhistory.QUserLoanHistory.userLoanHistory
import com.querydsl.jpa.impl.JPAQueryFactory

class UserRepositoryCustomImpl(
    private val queryFactory: JPAQueryFactory,
)
    : UserRepositoryCustom
{

    override fun findAllWithHistories(): List<User> {
        return queryFactory.select(user).distinct() //select distinct *
        .from(user) //from user
        .leftJoin(userLoanHistory)//left join userLoanHistory
        .on(userLoanHistory.user.id.eq(user.id))//on userLoanHistory.userId = userId
        .fetchJoin() //fetchJoin
        .fetch() //쿼리를 실행한다는 의미
    }
}