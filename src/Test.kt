import api.A

class Test(val a: A) {
    fun main(): String {
        val b = a.foo(null);
        return b
    }
}