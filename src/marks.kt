fun main() {
    println("Enter the student's score:")
    val score = readLine()?.toIntOrNull() ?:
    return

    val grade = when{
        score in  90..100 -> "A"
        score in 81..89 -> "A-"
        score in 71..80-> "B+"
        score in 61..70 -> "B"
        score in 55..60 -> "B-"
        score in 51..54 -> "C+"
        score in 46..50 -> "C"
        score in 41..45 -> "C-"
        score in 36..39 -> "D+"
        score in 30..35 -> "D"
        score in 25..29 -> "D-"
        score in 0..24 -> "E"
        else ->" N/A"
    }
    println("Grade:$grade")
}