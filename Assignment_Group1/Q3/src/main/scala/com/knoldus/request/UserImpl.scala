package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator


class UserImpl(userValidator: UserValidator) {

  def createCompany(user: User): Option[String] = {
    if (userValidator.userIsValid(user)) Option(user.name)
    else None
  }
}
