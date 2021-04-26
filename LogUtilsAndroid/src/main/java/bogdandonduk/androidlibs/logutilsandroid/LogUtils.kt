package bogdandonduk.androidlibs.logutilsandroid

import android.util.Log

object LogUtils {

    fun logd(host: Any, message: String, tag: String = host::class.java.simpleName) {
        Log.d(tag, message)
    }

    fun loge(host: Any, message: String, tag: String = host::class.java.simpleName) {
        Log.e(tag, message)
    }

    fun logv(host: Any, message: String, tag: String = host::class.java.simpleName) {
        Log.v(tag, message)
    }

    fun logi(host: Any, message: String, tag: String = host::class.java.simpleName) {
        Log.i(tag, message)
    }

    fun logw(host: Any, message: String, tag: String = host::class.java.simpleName) {
        Log.w(tag, message)
    }

    fun logwtf(host: Any, message: String, tag: String = host::class.java.simpleName) {
        Log.wtf(tag, message)
    }

}