fun main() {
   var getInfo = information("Annette",20,"Rwanda")
    println(getInfo)

    var stmt = getLength("AkiraChix")
    println(stmt)

    identifyName("Eunice")

    var getWord = "steal"
    println(getWord)



}
//Write a function that takes in 3 parameters, name, age, and country, and returns a String with
//this structure “Hi, my name is x, I am y years old and I am from z.” Where x, y, and z are the
//provided name, age, and country respectively

fun information(name:String,age:Int,country:String):String{
    return "Hi, my name is $name, I am $age years old and I am from $country"
}
//Write a function that takes in a String and returns its length
fun getLength(str:String):Int{
    return str.length

}
//Write a function that takes in a name and prints out “That’s me!” when your name is passed to it,
//otherwise, it prints out “I don’t know who that is”
fun identifyName(name:String){
    if (name == "Annette"){
        println("That's me")
    }
    else{
        println("I don't know who that is")
    }
}
//
//Write a Kotlin function that takes in a string will all the vowels replaces by the character ‘*’. Use
//string interpolation to generate the output.
fun repleceVowels(word:String):String{
    return  word
}