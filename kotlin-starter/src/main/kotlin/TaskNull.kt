fun main(){
    val text: String? = null

    //val textLength = text.length // compile time error

    if (text != null){
        val textLength = text.length
    }
    val textLength1 = text?.length //Safe calls operator

    val textLength2 = if (text != null) text.length else 7
    val textLength3 = text?.length ?: 7 //Elvis Operator, penulisan ini sama dgn bentuk diatas
}