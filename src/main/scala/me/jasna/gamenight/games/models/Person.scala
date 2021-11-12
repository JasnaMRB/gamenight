package me.jasna.gamenight.games.models
import me.jasna.gamenight.StringNonEmpty

case class Person(
    name: StringNonEmpty,
    websites: Vector[StringNonEmpty]
)
