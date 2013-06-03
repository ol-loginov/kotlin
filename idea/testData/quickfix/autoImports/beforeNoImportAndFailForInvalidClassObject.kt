// "Import Class" "false"

class Some {
    inner class SomeInner {
        class object : <caret>Other() {

        }
    }

    open inner class Other
}