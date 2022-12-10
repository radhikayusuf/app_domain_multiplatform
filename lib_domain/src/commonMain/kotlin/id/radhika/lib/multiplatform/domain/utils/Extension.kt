package id.radhika.lib.multiplatform.domain.utils

/**
 * @author radhikayusuf
 * Created 09/12/22
 */

fun Map<String, Any>.getString(key: String, default: String): String {
    val result = (get(key) as? String) ?: default
    return result
}
fun Map<String, Any>.getBoolean(key: String, default: Boolean): Boolean {
    val result = (get(key) as? Boolean) ?: default
    return result
}
fun Map<String, Any>.getInt(key: String, default: Int): Int {
    val result = (get(key) as? Int) ?: default
    return result
}
fun Map<String, Any>.getLong(key: String, default: Long): Long {
    val result = (get(key) as? Long) ?: default
    return result
}
fun Map<String, Any>.getDouble(key: String, default: Double): Double {
    val result = (get(key) as? Double) ?: default
    return result
}

fun Map<String, Any>.getListOfInt(key: String, default: List<Int>): List<Int> {
    val result = (get(key) as? List<Int>) ?: default
    return result
}