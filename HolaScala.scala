/*
Para compilar:
  scalac HolaScala.scala

Para correr: [Recordar que es el nombre del .class]
  scala -cp . HolaScala
*/

object HolaScala {

  def main(args: Array[String]): Unit = {
    println("Hola mundoski!")
    var n = 5
    if (n == 5) {
      print("Si, n vale 5 \n")
    } else if (n == 6) {
      println("Vale 6")
    } else {
      println("Tiene otro valor")
    }

    //val k = 10
    //println(if(k == 10) "k vale 10" else "k no vale 10")

    val valor = 6    
    println(valor match {
      case 1 => "Uno"
      case 2 => "Dos"
      case 3 => "Tres"
      case 4 => "Cuatro"
      case 5 => "Cinco"
      case 6 => "Seis"
      //El case _ funciona como un default
      case _ => "Ninguno"
    })

    var k = 0;
    while (k < 5) {
    
      println("k vale " + k) //Igual que en java
      println(s"k vale $k") //Interpolación de cadenas
      
      /*Las llaves no son necesarias, pero podemos 
      utilizarlas para evaluar cadenas*/
      println(s"El siguiente es ${k + 1}")
      k = k + 1      
    }

    val frutas = Array("Pera", "Manzana", "Naranja")
    println(frutas.length)   //Tamaño => 3
    println(frutas.apply(1)) //Posición => Manzana
    println(frutas(1))       // Otra forma de escribir la posición => Manzana
    println(frutas.isEmpty)  //Si esta vacio => false
    println(frutas.nonEmpty)  //Si no esta vacio => true
    println(frutas.indexOf("Pera"))  //Posición de un objeto => 0
    
    //Persona.imprimir()  Se debe averiguar lo del import de esta clase

    //Factorial recursivo
    var fact = 8
    println("El factorial de "+ fact + " es: ")
    println(factorial(fact))

  }

  def factorial(i: Int):Int={
    if (i==0) 1 else i*factorial(i-1)
  }

}