fun main(args: Array<String>) {


    fun endingMinutes (countSecond : Int) : String{
        val countMinutes = countSecond / 60
        val minutes = when (countMinutes){
            1, 21, 31, 41, 51 -> "минуту"
            2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "минуты"
            else -> "минут"
        }
        return minutes
    }

    fun endingHour (coundSecond : Int) : String{
        val countHour = coundSecond / 3600
        val hours = when (countHour){
            1, 21 -> "час"
            2, 3, 4, 22, 23, 24 -> "часа"
            else -> "часов"
        }
        return hours
    }
    fun agoToText (countSecond : Int) : String{
        val visitTime = when (countSecond){
            in 0..60 -> "только что"
            in 61..3600 -> {
                val minutes = countSecond / 60
                val ending = endingMinutes(countSecond)
                    return "$minutes $ending назад"
            }
            in 3601..86400 -> {
                val hours =countSecond / 3600
                val ending  = endingHour(countSecond)
                return "$hours $ending назад"
            }
            in 86401..172800 -> "вчера"
            in 172801..259200 -> "позавчера"
            else -> "давно"

        }
        return visitTime
    }
    println(agoToText(120))
}