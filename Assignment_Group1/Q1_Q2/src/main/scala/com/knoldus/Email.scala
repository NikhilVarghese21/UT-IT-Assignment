package com.knoldus

class Email(email: String) {

  def isValidEmail: Boolean = if(
    """^[0-9a-zA-Z]+([0-9a-zA-Z]*[-._+])*[0-9a-zA-Z]+@[0-9a-zA-Z]+([-.]
      |[0-9a-zA-Z]+)*([0-9a-zA-Z]*[.])(com|net|org)$""".r
    .findFirstIn(email) == None) false
  else true

}
