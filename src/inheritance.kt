//Parent class/Super class/Base class
open class Animal{
    var age = 2
    var gender = "Female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}
//child class/sub class/Derived class
open class Duck:Animal(){
    var colour="white"
    fun sound(){
        println("Duck is quacking")
    }
}
class Fish:Duck(){
    var hasScales= true
    var hasFins=true

    fun eat(){
        println("Fish is eating")
    }
}

fun main() {
    var a = Animal()

    var d = Duck()
    println(d.gender)
    d.move("swim")

    var nileperch=Fish()
}