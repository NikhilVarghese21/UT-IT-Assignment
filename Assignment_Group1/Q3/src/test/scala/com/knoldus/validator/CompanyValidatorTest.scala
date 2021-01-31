package com.knoldus.validator

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec


class CompanyValidatorTest extends AnyFlatSpec {
   val existingcompany = new Company(name = "Knoldus", emailId = "knoldus@gmail.com", city = "Noida")
   val newcompany = new Company(name = "TCS", emailId = "tcs@gmail.com", city = "Noida")

  "the company" should "not be valid" in {
    val companies = new CompanyValidator()
    assert((!companies.companyIsValid(existingcompany)) && (companies.emailIsValid(existingcompany)))
  }

  "the company" should "be valid" in {
    val companies = new CompanyValidator()
    assert((companies.companyIsValid(newcompany)) && (companies.emailIsValid(newcompany)))
  }

}
