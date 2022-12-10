package id.radhika.lib.multiplatform.domain.mock

import id.radhika.lib.multiplatform.domain.entity.MovieResponseEntity
import id.radhika.lib.multiplatform.domain.repository.MovieRepository

/**
 * @author radhikayusuf
 * Created 10/12/22
 */

class FakeMovieRepository : MovieRepository {
    override fun getMovies(callback: (List<MovieResponseEntity>) -> Unit) {
        callback.invoke(CREATE_MOCK_MOVIES)
    }

    companion object {
        val CREATE_MOCK_MOVIES = listOf(
            MovieResponseEntity.create(
                mapOf(
                    "poster_path" to "/image.png",
                    "video" to true,
                    "adult" to true,
                    "release_date" to "2022-10-19"
                )
            ),
            MovieResponseEntity.create(
                mapOf(
                    "poster_path" to "/image.png",
                    "video" to true,
                    "adult" to true,
                    "release_date" to "2022-10-19"
                )
            ),
            MovieResponseEntity.create(
                mapOf(
                    "poster_path" to "/image.png",
                    "video" to false,
                    "adult" to true,
                    "release_date" to "2022-10-19"
                )
            ),
            MovieResponseEntity.create(
                mapOf(
                    "poster_path" to "/image.png",
                    "video" to false,
                    "adult" to false,
                    "release_date" to "2022-10-19"
                )
            ),
        )
    }
}