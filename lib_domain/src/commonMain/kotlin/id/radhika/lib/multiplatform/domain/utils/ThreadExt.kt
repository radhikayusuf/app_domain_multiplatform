package id.radhika.lib.multiplatform.domain.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * @Author by Radhika Yusuf
 * Bandung, on 4/28/21
 */

fun CoroutineScope.runOnMain(block: suspend () -> Unit) {
    launch(this.coroutineContext + NativeConcurrentUtils.Main) { block.invoke() }
}

fun CoroutineScope.runOnBackground(block: suspend () -> Unit) {
    launch(this.coroutineContext + NativeConcurrentUtils.Background) { block.invoke() }
}