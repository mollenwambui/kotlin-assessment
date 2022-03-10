fun main(){
    strings()
   var a= division(20,6)
    println(a)
   var stmt= nameAge("Mollen wambui",21)
    println(stmt)
    var x=length("nairobi")
    println(x)
}
//Given a string “codeHive”. Write a function that prints out a string composed
//of the fifth, sixth, seventh and eighth  characters of the string
fun strings(){
    var school="codehive"
    println(school[4].toString()+school[5]+school[6]+school[7])
}
//Create and invoke a function that given two numbers returns the
//remainder of their division
fun division(num1:Int,num2:Int):Int{
    var remainder=num1%num2
    return remainder

}
//Write a function that takes in two parameters, name and age and returns a
//String with this structure “Hi, my name is p and I am z years old.” Where p
//and  z are your  name and age respectively.
fun nameAge(p:String,z:Int):String{
    var statement="Hi, my name is $p and I am $z years old"
    return statement
}
//write a function that takes in a string and returns its length
fun length(county:String):String{
    var county=county.length
    return county.toString()
}