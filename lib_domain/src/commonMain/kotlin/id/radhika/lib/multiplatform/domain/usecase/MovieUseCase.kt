package id.radhika.lib.multiplatform.domain.usecase

import id.radhika.lib.multiplatform.domain.entity.MovieResponseEntity
import id.radhika.lib.multiplatform.domain.entity.MovieCardEntity
import id.radhika.lib.multiplatform.domain.repository.MovieRepository
import id.radhika.lib.multiplatform.domain.utils.DateConverter

/**
 * @author radhikayusuf
 * Created 09/12/22
 */

class MovieUseCase(
    private val movieRepository: MovieRepository,
    private val dateConverter: DateConverter
) {

    fun getListMovies(
        isAdultBlacklisted: Boolean? = null,
        isHasVideo: Boolean? = null,
        callback: (List<MovieCardEntity>) -> Unit
    ) {
        movieRepository.getMovies { movies ->
            val result = movies
                .filter { isAdultBlacklisted.takeOrPass(!it.adult) && isHasVideo.takeOrPass(it.video) }
                .map(::responseToEntity)
            callback.invoke(result)
        }
    }

    private fun responseToEntity(responseModel: MovieResponseEntity): MovieCardEntity {
        return MovieCardEntity(
            responseModel.id,
            responseModel.title,
            responseModel.overview,
            POSTER_HOST + responseModel.posterPath,
            reformatDate(responseModel.releaseDate)
        )
    }

    private fun Boolean?.takeOrPass(comparison: Boolean): Boolean {
        val contentValue = this ?: return true
        return contentValue == comparison
    }

    private fun reformatDate(date: String): String {
        return dateConverter.reformatDate(date, "yyyy-MM-dd", "dd MMM yyyy")
    }

    companion object {
        const val POSTER_HOST = "https://image.tmdb.org/t/p/w185_and_h278_bestv2"
    }
}