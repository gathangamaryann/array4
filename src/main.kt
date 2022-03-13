import kotlin.collections.forEach as forEach1

fun  main(){

    var a = numproduct(arrayOf(6,7,8,9))
println(a)
    var medly= mixed(arrayOf(6.9,7.6,8,9,"mary",5))
    println(medly)
    var word = charArray(arrayOf('a','e','i','c','y'))
    println(word)

}
fun numproduct(score:Array<Int>):Int{
var product = 1
    score.forEach1 { num->
        product*=num
    }
     return product





}
fun mixed(medly:Array<Any>):Double {
    var double = 0.0
    medly.forEach1 { element ->

        if (element is Double || element is Float) {
            double += element.toString().toDouble()


        }


    }
    return double

}
fun charArray(chars:Array<Char>):Int{
    var k = 0
    chars.forEach1 { vowels->
        if (vowels=='a'||vowels=='e'||vowels=='i'||vowels=='0'||vowels=='u')
            k++
    }
return k
}



