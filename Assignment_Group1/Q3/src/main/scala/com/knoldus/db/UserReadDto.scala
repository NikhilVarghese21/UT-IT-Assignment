package com.knoldus.db

import com.knoldus.models.User

import scala.collection.immutable.HashMap

class UserReadDto {
  val steve : User = User("Steve Smith", 41,  "stevesmith@gmail.com", "Knoldus")
  val joe : User = User("Joe Root", 57,  "joeroot@gmail.com", "Philips")

  val users: HashMap[String, User] = HashMap("Steve" -> steve, "Joe" -> joe)

  def getUserByName(name: String): Option[User] = users.get(name)


}
