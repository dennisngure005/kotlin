class person{
    //Attributes/Properties
    var name = "John"
    var age = 67
    var gender = "Male"

    //Methods/Functions
    fun walk(){
        println("Person is walking")
    }

}

fun main() {
    var accountant = person()
    accountant.walk()

    println(accountant.gender)
}