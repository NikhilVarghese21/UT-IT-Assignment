package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class EmailTest extends AnyFlatSpec {

  "the email" should "be valid" in {
    val email = new Email(email = "nikhil.varghese@knoldus.com")
    assert(email.isValidEmail)
  }
  "the email" should "not be valid" in {
    val email = new Email(email = "nikhil.vargheseknoldus.in")
    assert(!email.isValidEmail)
  }


}
