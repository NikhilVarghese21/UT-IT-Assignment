package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec


class EmailValidatorTest extends AnyFlatSpec {

  "the email" should "be valid" in {
    val email = new EmailValidator()
    assert(email.emailIdIsValid(emailId = "nikhil.varghese@knoldus.com"))
  }

  "the email" should "not be valid" in {
    val email = new EmailValidator()
    assert(!email.emailIdIsValid(emailId = "nikhil.vargheseknoldus.in"))
  }

}
