// Overloading/OverloadedVsDefaultArg.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package overloadingvsdefaultargs

fun foo(n: Int = 99) = print("foo-1-$n")

fun foo() {
  println("foo-2")
  foo(14)
}

fun main() {
  foo()
}
/* Output:
foo-2
foo-1-14
*/
