package test

class Some {
    inner class SomeInner {
        class object: Other {
        }
    }

    open inner class Other
}