fun main(args: Array<String>) {

    println("\n:: Bienvenido a Recipe Maker ::\n")
    println("Selecciona la opción deseada\n1. Hacer una receta\n2. Ver mis recetas\n3. Salir")

    do {
        val entrada: String? = readLine()
        elijaOpcion(entrada)
    }while (entrada != "3")
}

fun elijaOpcion (opcion: String?) {
    when(opcion.toString()){
        in "1" -> makeRecipe()
        in "2" -> viewRecipe()
        in "3" -> println("Hasta luego, vuelva pronto")
        else -> println("Elija una opcion correcta")
    }
}

fun makeRecipe() {
    println("Hacer receta\nSeleccioná por categoría el ingrediente que buscás")

    val ingredientes: List<String> = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")
    for((index,ing) in ingredientes.withIndex()) {
        println("${index+1}.$ing")
    }

}

fun viewRecipe() {
    println("Ver mis recetas")
}