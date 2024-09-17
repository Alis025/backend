package facade

class Facade {
    private val liquidos: ComprobarLiquidos
    private val asiento: ComprobarAsiento
    private val espejos: ComprobarEspejos
    private val arrancar: Arrancar

    // --------------------------------
    init {
        liquidos = ComprobarLiquidos()
        asiento = ComprobarAsiento()
        espejos = ComprobarEspejos()
        arrancar = Arrancar()
    }

    // --------------------------------
    fun arrancarCoche() {
        liquidos.comprobar()
        asiento.comprobar()
        espejos.comprobar()
        arrancar.encenderContacto()
    }
}


