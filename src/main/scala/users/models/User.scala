package me.jasna.gamenight
package users.models

import java.util.UUID

sealed trait User {
  def id: UUID
  def name: String
}

case class UserLogin(
    id: UUID,
    email: String,
    name: String,
    password: String
) extends User

case class UserGamer(
    id: UUID,
    name: String,
    gameCollection: GameCollection
)
