package com.group.libraryapp.domain.user.loanhistory;

import com.group.libraryapp.domain.user.User;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class JavaUserLoanHistory {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  @ManyToOne
  private User user;

  private String bookName;

  private boolean isReturn;

  public JavaUserLoanHistory() {

  }

  public JavaUserLoanHistory(User user, String bookName, boolean isReturn) {
    this.user = user;
    this.bookName = bookName;
    this.isReturn = isReturn;
  }

  @NotNull
  public String getBookName() {
    return this.bookName;
  }

  public void doReturn() {
    this.isReturn = true;
  }

  public Long getId() {
    return id;
  }

  @NotNull
  public User getUser() {
    return user;
  }

  public boolean isReturn() {
    return isReturn;
  }
}
