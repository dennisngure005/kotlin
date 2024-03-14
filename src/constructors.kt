class Dog (var name:String, var breed:String, var age:Int){

    fun move(movement:String){
        println("The dog is $movement")
    }
}

fun main() {
    var dog1 = Dog("Bob","Bull Dog",6)
    var dog2 = Dog("Tracy","Chiwawa",5)

    println(dog1.breed)
    println(dog1.name)
    println(dog1.move("Walking"))
    println(dog2.move("Running"))
}