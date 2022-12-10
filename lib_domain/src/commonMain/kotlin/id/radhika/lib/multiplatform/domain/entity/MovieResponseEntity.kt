package id.radhika.lib.multiplatform.domain.entity

/**
 * @author radhikayusuf
 * Created 09/12/22
 */

expect class MovieResponseEntity {
    val adult: Boolean
    val backdropPath: String
    val genreIds: List<Int>
    val id: Long
    val originalLanguage: String
    val originalTitle: String
    val overview: String
    val popularity: Double
    val posterPath: String
    val releaseDate: String
    val title: String
    val video: Boolean
    val voteAverage: Double
    val voteCount: Int

    companion object {
        fun create(map: Map<String, Any>): MovieResponseEntity
        fun create(
            adult: Boolean,
            backdropPath: String,
            genreIds: List<Int>,
            id: Long,
            originalLanguage: String,
            originalTitle: String,
            overview: String,
            popularity: Double,
            posterPath: String,
            releaseDate: String,
            title: String,
            video: Boolean,
            voteAverage: Double,
            voteCount: Int,
        ): MovieResponseEntity
    }
}