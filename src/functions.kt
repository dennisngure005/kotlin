fun main() {
    //Predefined functions
    println("Hello Kotlin")

    var x = Math.min(45,89)
    println(x)

    var y = Math.max(90,124)
    println("The maximum value is $y")

    var z = Math.round(45.98)
    println(z)

    name()
    product(12,30)
    product(7,9)
    details("Joe",56)
    details("Dennis",18)
}
//User-defined Function
fun name(){
    println("Dennis")
}

fun product(num1:Int,num2:Int){
    println(num1 * num2)
}
//parameters and arguments
fun details (name:String,age:Int){
    println("$name is $age years old")

}