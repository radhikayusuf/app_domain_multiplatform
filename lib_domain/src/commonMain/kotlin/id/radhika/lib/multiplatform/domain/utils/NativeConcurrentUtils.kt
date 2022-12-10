package id.radhika.lib.multiplatform.domain.utils

import kotlinx.coroutines.CoroutineDispatcher

/**
 * Created by Radhika Yusuf Alifiansyah
 * on 14/Jul/2021
 **/
expect object NativeConcurrentUtils {
    internal val Main: CoroutineDispatcher
    internal val Background: CoroutineDispatcher

    fun <T> T.freezeValue(): T
    fun <T> T.isFrozenValue(): Boolean
}