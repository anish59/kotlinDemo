class InitOrderDemo(name: String) {

    //Kotlin classes allow printing properties in the declaration itself by using the also function as shown below
    var value1: String = "first property $name".also(::println)

    init {
        println("first init block $name")
    }

    var value2: String = "second property ${value1}".also(::println)

    init {
        println("Second init block $name")
    }
}