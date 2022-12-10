package id.radhika.lib.multiplatform.domain.entity

import id.radhika.lib.multiplatform.domain.utils.getBoolean
import id.radhika.lib.multiplatform.domain.utils.getDouble
import id.radhika.lib.multiplatform.domain.utils.getInt
import id.radhika.lib.multiplatform.domain.utils.getListOfInt
import id.radhika.lib.multiplatform.domain.utils.getLong
import id.radhika.lib.multiplatform.domain.utils.getString

/**
 * @author radhikayusuf
 * Created 09/12/22
 */

actual data class MovieResponseEntity(
    actual val adult: Boolean,
    actual val backdropPath: String,
    actual val genreIds: List<Int>,
    actual val id: Long,
    actual val originalLanguage: String,
    actual val originalTitle: String,
    actual val overview: String,
    actual val popularity: Double,
    actual val posterPath: String,
    actual val releaseDate: String,
    actual val title: String,
    actual val video: Boolean,
    actual val voteAverage: Double,
    actual val voteCount: Int
)  {
    actual companion object {
        actual fun create(map: Map<String, Any>): MovieResponseEntity {
            return MovieResponseEntity(
                adult = map.getBoolean("adult", false),
                backdropPath = map.getString("backdrop_path", ""),
                genreIds = map.getListOfInt("genre_ids", listOf()),
                id = map.getLong("id", 0L),
                originalLanguage = map.getString("original_language", ""),
                originalTitle = map.getString("original_title", ""),
                overview = map.getString("overview", ""),
                popularity = map.getDouble("popularity", 0.0),
                posterPath = map.getString("poster_path", ""),
                releaseDate = map.getString("release_date", ""),
                title = map.getString("title", ""),
                video = map.getBoolean("video", false),
                voteAverage = map.getDouble("vote_average", 0.0),
                voteCount = map.getInt("vote_count", 0)
            )
        }

        actual fun create(
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
            voteCount: Int
        ): MovieResponseEntity {
            return MovieResponseEntity(
                adult = adult,
                backdropPath = backdropPath,
                genreIds = genreIds,
                id = id,
                originalLanguage = originalLanguage,
                originalTitle = originalTitle,
                overview = overview,
                popularity = popularity,
                posterPath = posterPath,
                releaseDate = releaseDate,
                title = title,
                video = video,
                voteAverage = voteAverage,
                voteCount = voteCount
            )
        }
    }
}