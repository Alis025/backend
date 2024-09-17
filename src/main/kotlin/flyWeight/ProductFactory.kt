package flyWeight

import javax.swing.text.html.HTML.Tag.OL

class ProductFactory {
    companion object{
        private val products = hashMapOf<String,Product>()
        private var idSequence =0L

        fun createProduct(descriptionProduct: String, price:Double, brand: String):Product?{
            return if (products.containsKey(descriptionProduct)){
                products[descriptionProduct]
            } else{
                val product = Product(id=++idSequence,descriptionProduct= descriptionProduct,
                    price=price, brand=brand)
                products[descriptionProduct] = product
                product
            }
        }
    }
}


