package id.radhika.lib.multiplatform.domain.utils

/**
 * @author radhikayusuf
 * Created 09/12/22
 */

expect object DateConverter {
    fun reformatDate(dateTime: String, formatInput: String, formatOutput: String): String
}