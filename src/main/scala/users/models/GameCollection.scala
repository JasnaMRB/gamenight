package me.jasna.gamenight
package users.models

case class GameCollection(
    own: Vector[Game],
    wish: Vector[Game]
)
