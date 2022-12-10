package id.radhika.lib.multiplatform.domain.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * @author radhikayusuf
 * Created 09/12/22
 */

actual object DateConverter {

    actual fun reformatDate(
        dateTime: String,
        formatInput: String,
        formatOutput: String
    ): String {
        val format = SimpleDateFormat(formatInput, Locale.ROOT)
        val date: Date? = try {
            format.parse(dateTime)
        } catch (e: Exception) { null }
        return if (date != null) {
            val outputFormat = SimpleDateFormat(formatOutput, Locale.ROOT)
            outputFormat.format(date)
        } else {
            ""
        }
    }
}