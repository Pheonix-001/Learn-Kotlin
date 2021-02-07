package oops
import java.util.*

    class LuckyDispatcher {
        fun getNum() {
            var objRan = Random()
            println(objRan.nextInt())
        }
    }

fun main() {

    val d1 = LuckyDispatcher()
    val d2 = LuckyDispatcher()

    d1.getNum()
    d2.getNum()

}

