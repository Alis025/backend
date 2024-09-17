package proxy

fun main(){
    val securedFile = SecuredFile()
    securedFile.read("readme.md")

    securedFile.password = "secret"
    securedFile.read("readme.md")
    }