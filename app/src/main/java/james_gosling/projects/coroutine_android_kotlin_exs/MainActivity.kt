package james_gosling.projects.coroutine_android_kotlin_exs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.internal.functions.Functions
import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext

//------------------Syntax text-----------------

class MainActivity : AppCompatActivity() {

    val b: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun main() = runBlocking<Unit> {
            launch { scopeCheck(this) }
        }


        val Download_Values = CoroutineScope(Dispatchers.IO).launch{

            val job2 = withContext(Dispatchers.IO){

            }

        }

        val parentJob1 = Job()

        val parentJob2 = Job()

        val childJob1 = CoroutineScope(Dispatchers.Main + parentJob1).launch {

            get()
            val childJob2 = launch {

                get()

            }

            val childJob3 = launch {

            }
        }



       val superJob = CoroutineScope(Dispatchers.Main + childJob1).launch {




        }


        superJob.invokeOnCompletion {


        }



    }


    public suspend fun writeToFile(){

    }


    public suspend fun fetchDoc(){

//        val result = get("developer.andorid.com")

    }

    public suspend fun get(): String{
        withContext(Dispatchers.IO){
//            HttpsURLConnection hts = HttpsUrlConnection.donwload
            val al = launch {

                //way to define inline parameter method
                nonInlined {
                    return@nonInlined if (!NN3().equals("")){
                        "hello"
                    }else{
                        ""
                     }

                }
                nonInlined {
                     if (!NN3().equals("")){
                        "hello"
                    }else{
                        ""
                     }

                }

            }
        }
        return ""
    }


    suspend fun scopeCheck(scope: CoroutineScope) {
        println(scope.coroutineContext === coroutineContext)
    }

    fun nonInlined(getString: () -> String?) {
        println("before")
        println("after")
    }
    fun NN3() {
    }

}