fun main(){
    //While loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }

    //Decrement
    var x = 100
    while (x >= 95){
        println("counter is $x")
        x--
    }

    //Do...while loop
    var num = 20
    do{
        println(num)
        num++
    }while (num <= 25)

    //For loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }
    var marks = arrayOf(95,76,54,32,11)
    for (m in marks){
        println("mark is $marks")
    }
    //
    for (number in 20..25){
        println(number)

    }
    for (char in 'a'..'d')
        println(char)

}