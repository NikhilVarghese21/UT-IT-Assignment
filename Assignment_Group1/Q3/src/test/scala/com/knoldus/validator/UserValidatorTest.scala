package com.knoldus.validator

import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec


class UserValidatorTest extends AnyFlatSpec {
  val user = new User(name = "Steve Smith", age = 41, emailId = "stevesmith@gmail.com", company = "Knoldus")
  val wronguser = new User(name = "Steve Smith", age = 41, emailId = "stevesmithgmailcom", company = "Knoldus")

  "the user" should "be valid" in {
    val users = new UserValidator()
    assert((users.userIsValid(user)) && (users.emailIsValid(user)))
  }

  "the user" should "not be valid" in {
    val users = new UserValidator()
    assert(!(users.userIsValid(wronguser) && (users.emailIsValid(wronguser))))
  }

}