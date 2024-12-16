```scala
class MyClass[T](val value: T) {
  def this(value: Int) = this(value.toString)
  def this(value:String) = this(value)
}

val myInt = new MyClass(5)
val myString = new MyClass("hello")

println(myInt.value) // Output: 5
println(myString.value) // Output: hello
```