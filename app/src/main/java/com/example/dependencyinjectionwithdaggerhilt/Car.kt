package com.example.dependencyinjectionwithdaggerhilt

//The code demonstrates a simple example of Constructor dependency injection in Kotlin.
class Car(private val engine: Engine) {

    //Dependency Created inside the class
    //problem:The car class creates its on engine instance.
    //  private val engine= Engine()
    fun drive() {
        engine.start()
        println("Car started")
    }
}

fun main() {
    val engine = Engine() // Dependency created outside the class
    val car = Car(engine) // Injecting dependency
    car.drive() // Using the car with the injected engine
}