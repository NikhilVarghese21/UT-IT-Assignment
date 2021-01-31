package com.knoldus.validator

class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean = if(
    """^[0-9a-zA-Z]+([0-9a-zA-Z]*[-._+])*[0-9a-zA-Z]+@[0-9a-zA-Z]+([-.]
      |[0-9a-zA-Z]+)*([0-9a-zA-Z]*[.])(com|net|org)$""".r
      .findFirstIn(emailId) == None) false
  else true

}
