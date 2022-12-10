package id.radhika.lib.multiplatform.domain.repository

import id.radhika.lib.multiplatform.domain.entity.MovieResponseEntity

/**
 * @author radhikayusuf
 * Created 09/12/22
 */

interface MovieRepository {

    fun getMovies(callback: (List<MovieResponseEntity>) -> Unit)
}