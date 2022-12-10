package id.radhika.lib.multiplatform.domain.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * Created by Radhika Yusuf Alifiansyah
 * on 14/Jul/2021
 **/
actual object NativeConcurrentUtils {

    internal actual val Main: CoroutineDispatcher = Dispatchers.Main
    internal actual val Background: CoroutineDispatcher = Dispatchers.Default

    actual fun <T> T.freezeValue(): T = this // Do nothing for JVM
    actual fun <T> T.isFrozenValue(): Boolean = false
}