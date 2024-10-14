package com.example.myapplication

//Lambda Function
//Lambda function adalah fungsi yang tidak memiliki nama
//Lambda function biasanya digunakan untuk membuat fungsi yang sederhana
//Lambda function menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String):String {
    return string.uppercase()
}

//Dapat ditulis dalam ekspresi lambda sbb :
fun main() {
    uppercaseString("hello")
    println({ string: String -> string.uppercase()} ("hello"))
    //HELLO
}