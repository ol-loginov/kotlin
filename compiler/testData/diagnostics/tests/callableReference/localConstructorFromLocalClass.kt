fun main() {
    class A
    
    class B {
        val x = ::A
        val f: KFunction0<A> = x
    }
}