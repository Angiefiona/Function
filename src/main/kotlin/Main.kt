fun main(){
 greeting("Angela")
division(3, 4)
    addition(5, 6, 1, 2)
    whoAmI("i am very funny")

}
fun greeting(name: String){
    println("Hello $name")
}
fun division(num3: Int, num4: Int): Int {
    var answer = num3+num4
    println(answer)
    return(answer)


}
fun addition(num1: Int, num2: Int, num5: Int, num6: Int):Int{
    var result = num1+num2+num5+num6
    println(result)
    return(result)



}fun whoAmI(sentence: String){
    println("$sentence")
}
