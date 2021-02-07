//fun main() {
//
//    val output = operation(4,3, { a, b ->
//        print("adding both number ")
//        val temp = a*a          // using temp variable because variable a is immutable
//        temp + b
//    })
//
//    print(output)
//
//}
//
//fun operation(a: Int, b: Int, operate: (Int, Int) -> Int): Int {
//    return operate(a, b)
//}


//      ---->>>>>       second main function  ------>>>>>>>


fun main() {

    val output = add(3,2, {c ->
        c * c
    })

    print(output)
}



fun add(a: Int, b: Int, square: (Int) -> Int) : Int {

    return square(a) + square(b)

}








