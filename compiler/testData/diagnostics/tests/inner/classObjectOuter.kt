open class SomeClass<T>
class TestSome<P> {
    class object : SomeClass<<!INACCESSIBLE_OUTER_CLASS_EXPRESSION!>P<!>>() {
    }
}