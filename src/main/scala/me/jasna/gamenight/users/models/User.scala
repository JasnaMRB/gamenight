package me.jasna.gamenight.users.models

import me.jasna.gamenight.StringNonEmpty

import java.util.UUID

sealed trait User {
  def id: UUID
  def name: StringNonEmpty
}

case class UserLogin(
    id: UUID,
    email: StringNonEmpty,
    name: StringNonEmpty,
    password: StringNonEmpty
) extends User

case class UserGamer(
    id: UUID,
    name: StringNonEmpty,
    gameCollection: GameCollection
) extends User
