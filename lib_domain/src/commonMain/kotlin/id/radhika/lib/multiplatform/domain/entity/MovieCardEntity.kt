package id.radhika.lib.multiplatform.domain.entity

/**
 * @author radhikayusuf
 * Created 09/12/22
 */

data class MovieCardEntity(
    val id: Long,
    val title: String,
    val overview: String,
    val posterUrl: String,
    val releaseDate: String
)