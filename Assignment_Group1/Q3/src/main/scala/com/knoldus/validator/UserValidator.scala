package com.knoldus.validator

import com.knoldus.models.{Company, User}
import com.knoldus.db.{UserReadDto, CompanyReadDto}


class UserValidator {
  val users: UserReadDto= new UserReadDto()
  val email: EmailValidator= new EmailValidator()
  val companies: CompanyReadDto= new CompanyReadDto()

  /* Checks if company is not in the database*/
  def companyIsValid(company: Company): Boolean = if (companies.getCompanyByName(company.name)== None) true
  else false

  def userIsValid(user: User): Boolean = if (companies.getCompanyByName(user.company) != None) true
  else false

  /*Checks if email is valid */
  def  emailIsValid(user: User): Boolean = if (email.emailIdIsValid(user.emailId) == true) true
  else false
}
