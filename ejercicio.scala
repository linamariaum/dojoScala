object HolaScala {

    def dobleArray(array:List):List= {
        val doubles = array.map{ x => 2*x}
    }

    def imprimir():Unit={
        val numeros = List(4, 8, 15, 16, 23, 42);
        println(dobleArray(numeros))
        //Esta sería la salida
        //val numeros = List(8, 16, 30 , 32, 46, 84);
    }
}