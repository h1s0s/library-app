package com.group.libraryapp.repository.book

import com.group.libraryapp.domain.book.QBook.book
import com.group.libraryapp.dto.book.response.BookStatResponse
import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Component

@Component
class BookQuerydslRepository(
        private val queryFactory: JPAQueryFactory,
) {

    fun getStats(): List<BookStatResponse>{
        return queryFactory.select(
                Projections.constructor(//주어진 DTO의 생성자를 사용한다는 의미
                    BookStatResponse::class.java,//이 코드 뒤에 나오는 파라미터들이 생성자로 들어감
                    book.type,
                    book.id.count()
                )
            ).from(book)
            .groupBy(book.type)
            .fetch()
    }
}