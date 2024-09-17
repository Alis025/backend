package flyWeight

fun main(){
    val productsElectrodomesticos = ProductList( "Electrodomesticos")
    productsElectrodomesticos.addItem("Celular samsung", 23500.0,"samsung")
    productsElectrodomesticos.addItem("Televisor 50 Pulgadas", 30000.0, "LG")
    productsElectrodomesticos.addItem("Celular Hawei",18000.0,"Hawei")
    productsElectrodomesticos.addItem("Celular Samsung", 23500.0, "Samsung")
    productsElectrodomesticos.printList()
}