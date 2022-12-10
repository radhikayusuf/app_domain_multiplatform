package id.radhika.lib.multiplatform.domain.usecase

import id.radhika.lib.multiplatform.domain.mock.FakeMovieRepository
import id.radhika.lib.multiplatform.domain.repository.MovieRepository
import id.radhika.lib.multiplatform.domain.usecase.MovieUseCase.Companion.POSTER_HOST
import id.radhika.lib.multiplatform.domain.utils.DateConverter
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * @author radhikayusuf
 * Created 09/12/22
 */

class MovieUseCaseTest {

    private lateinit var sut: MovieUseCase
    private val mockRepository: MovieRepository = FakeMovieRepository()

    @BeforeTest
    fun setup() {
        sut = MovieUseCase(mockRepository, DateConverter)
    }

    @Test
    fun `test filtering movies by adult conditions`() {
        sut.getListMovies(isAdultBlacklisted = true) {
            assertEquals(it.size, 1)
            it.forEach { movie ->
                assertEquals(movie.posterUrl, "$POSTER_HOST/image.png")
                assertEquals(movie.releaseDate, "19 Oct 2022")
            }
        }
    }

    @Test
    fun `test filtering movies by content video availability`() {
        sut.getListMovies(isHasVideo = true) {
            assertEquals(it.size, 2)
            it.forEach { movie ->
                assertEquals(movie.posterUrl, "$POSTER_HOST/image.png")
                assertEquals(movie.posterUrl, "$POSTER_HOST/image.png")
                assertEquals(movie.releaseDate, "19 Oct 2022")
            }
        }
    }
}