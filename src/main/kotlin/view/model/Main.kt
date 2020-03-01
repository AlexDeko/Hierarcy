package view.model

fun main() {
    val text = TextView("Some Text")
    text.setClick()
    println(text.text)

    val button = Button("Click me")
    button.setClick()
    println(button.text)

    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)


    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)


}