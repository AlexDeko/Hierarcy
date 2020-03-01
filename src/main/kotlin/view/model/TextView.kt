package view.model

open class TextView(open val text: String): View() {

//    fun getText(){
//        println(text)
//    }

    override fun setClick(){
        println("TextView clicked")
    }

}