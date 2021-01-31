package com.knoldus.validator

import com.knoldus.models.Company
import com.knoldus.db.CompanyReadDto


class CompanyValidator {
  val companies: CompanyReadDto= new CompanyReadDto()
  val email: EmailValidator= new EmailValidator()

  /* Checks if company is not in the database*/
  def companyIsValid(company: Company): Boolean = if (companies.getCompanyByName(company.name)== None) true
  else false

/*Checks if email is valid */
  def  emailIsValid(company: Company): Boolean = if (email.emailIdIsValid(company.emailId) == true) true
  else false
}
