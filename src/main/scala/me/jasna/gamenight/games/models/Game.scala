package me.jasna.gamenight.games.models

import me.jasna.gamenight.{ IntPositive, StringNonEmpty }

case class Game(
    name: StringNonEmpty,
    credits: Credits,
    playDetails: PlayDetails
)

case class Credits(
    designers: Vector[Person],
    publishers: Vector[StringNonEmpty]
)

case class PlayDetails(
    categories: Vector[Category],
    mechanisms: Vector[Mechanism],
    numPlayers: NumberOfPlayers,
    playTime: Option[IntPositive]
)

case class NumberOfPlayers(
    max: IntPositive,
    min: IntPositive,
    best: Option[IntPositive]
)
