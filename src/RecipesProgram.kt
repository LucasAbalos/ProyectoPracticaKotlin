fun main(args: Array<String>) {

    println("\n:: Bienvenido a Recipe Maker ::\n")
    println("Selecciona la opción deseada\n" +
            "1. Hacer una receta\n" +
            "2. Ver mis recetas\n" +
            "3. Salir")

    val ingredientes: List<String> = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

    do {
        val entrada: String? = readLine()
        elijaOpcion(entrada)
    }while (entrada != "3")
}

fun elijaOpcion (opcion: String?) {
    when(opcion.toString()){
        in "1" -> println("Opcion hacer una receta")
        in "2" -> println("Opcion ver mis recetas")
        in "3" -> println("Hasta luego, vuelva pronto")
        else -> println("Eliga una opcion correcta")
    }
}
