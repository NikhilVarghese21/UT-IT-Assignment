package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class NumbersTest extends AnyFlatSpec {

  "the quotient" should "be valid" in {
    val num = new Numbers()
    assert(num.divide(10, 5) === 2)
  }

  "the quotient" should "not be valid" in {
    val num = new Numbers()
    assert(num.divide(20, 5) != 2)
  }

  "the fibonacci number" should " be valid" in {
    val fibonacci = new Numbers()
    assert(fibonacci.fibonacci(9) === 34)
  }

  "the fibonacci number" should "not be valid" in {
    val fibonacci = new Numbers()
    assert(fibonacci.fibonacci(7) != 21)
  }
}

