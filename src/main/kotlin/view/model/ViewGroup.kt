package view.model

class ViewGroup() : View() {
    private var viewGroup: View
        get() {
            TODO()
        }
        set(value) {}

    fun addView(view: View) {
        viewGroup = view
    }

}