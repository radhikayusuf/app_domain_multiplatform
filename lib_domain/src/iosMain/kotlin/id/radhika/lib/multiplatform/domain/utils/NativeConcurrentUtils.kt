package id.radhika.lib.multiplatform.domain.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue
import platform.darwin.dispatch_queue_t
import kotlin.coroutines.CoroutineContext
import kotlin.native.concurrent.freeze
import kotlin.native.concurrent.isFrozen

/**
 * Created by Radhika Yusuf Alifiansyah
 * on 14/Jul/2021
 **/
actual object NativeConcurrentUtils {

    internal actual val Main: CoroutineDispatcher = NsQueueDispatcher(dispatch_get_main_queue())
    internal actual val Background: CoroutineDispatcher = Main

    actual fun <T> T.freezeValue(): T = this.freeze()

    actual fun <T> T.isFrozenValue(): Boolean = this.isFrozen

    internal class NsQueueDispatcher(
        private val dispatchQueue: dispatch_queue_t
    ) : CoroutineDispatcher() {
        override fun dispatch(context: CoroutineContext, block: Runnable) {
            dispatch_async(dispatchQueue) {
                block.run()
            }
        }
    }
}