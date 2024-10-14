package com.example







fun contohList(){
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square","Triangle")
    println(shape)
    
    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)
    
    // Menghapus data dari List Mutable
    shape.remove(element = "Triangle")
    println(shape)
    
    println(shape.first())
    println(shape.last())
    println(shape.count())
    
    shape.removeAt( index = 1)
    println(shape)
    
    // Mengubah data di dalam list Mutable
    shape[0] = "Oval"
    println(shape)
    
    // List Read-only
    val shapesLocked: List<String> = shape
    println(shapesLocked)

}

fun main(){
    contohList()
}
