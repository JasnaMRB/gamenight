package me.jasna.gamenight.users.models
import me.jasna.gamenight.games.models.Game

case class GameCollection(
    own: Vector[Game],
    wish: Vector[Game]
)
