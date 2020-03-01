package view.model

class Button(override val text: String): TextView(text) {

    override fun setClick() {
        println("Button clicked")
    }
}