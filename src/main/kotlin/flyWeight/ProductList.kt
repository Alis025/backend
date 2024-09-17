package flyWeight

class ProductList(private val categoryProduct: String) {
    private var products=ArrayList<Product?>()

    fun addItem(descriptionProduct: String, price: Double, brad: String){
        products.add(ProductFactory.createProduct(descriptionProduct, price, brad));
    }
    fun printList(){
        var out= "\nProducts > $categoryProduct \n "
        products.forEach{
            out +=it.toString()
        }
        println(out)
    }
}