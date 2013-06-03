class Test {
    class object : <!INACCESSIBLE_OUTER_CLASS_EXPRESSION!>InnerClass()<!> {
        val a = object: <!INACCESSIBLE_OUTER_CLASS_EXPRESSION!>InnerClass()<!> {
        }

        fun more(): InnerClass {
            val b = <!INACCESSIBLE_OUTER_CLASS_EXPRESSION!>InnerClass()<!>
            return b
        }
    }

    open inner class InnerClass
}



