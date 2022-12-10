package id.radhika.lib.multiplatform.domain.utils

import platform.Foundation.NSDate
import platform.Foundation.NSDateFormatter
import platform.Foundation.NSLocale
import platform.Foundation.NSTimeZone
import platform.Foundation.autoupdatingCurrentLocale
import platform.Foundation.localTimeZone

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
        val date = getDateFromString(dateTime, formatInput)
        val dateFormatter = NSDateFormatter()
        dateFormatter.timeZone = NSTimeZone.localTimeZone
        dateFormatter.locale = NSLocale.autoupdatingCurrentLocale
        dateFormatter.dateFormat = formatOutput
        return if (date != null) {
            dateFormatter.stringFromDate(date)
        } else ""
    }

    private fun getDateFromString(
        dateString: String,
        formatInput: String
    ): NSDate? {
        val formatter = NSDateFormatter()
        formatter.setDateFormat(formatInput)
        return formatter.dateFromString(dateString)
    }
}