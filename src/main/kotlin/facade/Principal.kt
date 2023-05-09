package facade

class Principal {
    object Main {
        @JvmStatic
        fun main(args: Array<String>) {
            val fachada = Facade()
            fachada.arrancarCoche()
            println("\nProceso finalizado.")
        }

    }
}