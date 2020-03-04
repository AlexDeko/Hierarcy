package view.model

class ViewGroup() : View() {
    private var view: View = View()

    fun addView(view: View) {
        this.view = view
    }

}