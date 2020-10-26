package james_gosling.projects.coroutine_android_kotlin_exs.dispatchers_ex

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class Dispatcher_Default {
    fun main(){
        CoroutineScope(Dispatchers.Default)
    }
}