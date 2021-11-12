package me.jasna.gamenight
package me.jasna.gamenight.games.models

case class Game(
    name: String,
    credits: Credits,
    playDetails: PlayDetails
)

case class Credits(
    designers: Vector[Person],
    publishers: Vector[String]
)

case class PlayDetails(
    categories: Vector[Category],
    mechanisms: Vector[Mechanism],
    numPlayers: NumberOfPlayers,
    playTime: Option[Int]
)

case class NumberOfPlayers(
    max: Int,
    min: Int,
    best: Option[Int]
)
