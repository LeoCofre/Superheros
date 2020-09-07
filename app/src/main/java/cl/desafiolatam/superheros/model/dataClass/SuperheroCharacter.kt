package cl.desafiolatam.superheros.model.dataClass

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Superhero(
    @PrimaryKey
    val id: Int,
    val name: String,
    val slug: String,
    val appearance: Appearance,
    val biography: Biography,
    val connections: Connections,
    val images: Images,
    val powerstats: Powerstats,
    val work: Work
)

data class Appearance(
    val eyeColor: String,
    val gender: String,
    val hairColor: String,
    val height: List<String>,
    val race: String,
    val weight: List<String>
)

data class Biography(
    val aliases: List<String>,
    val alignment: String,
    val alterEgos: String,
    val firstAppearance: String,
    val fullName: String,
    val placeOfBirth: String,
    val publisher: String
)

data class Connections(
    val groupAffiliation: String,
    val relatives: String
)

data class Images(
    val lg: String,
    val md: String,
    val sm: String,
    val xs: String
)

data class Powerstats(
    val combat: Int,
    val durability: Int,
    val intelligence: Int,
    val power: Int,
    val speed: Int,
    val strength: Int
)

data class Work(
    val base: String,
    val occupation: String
)