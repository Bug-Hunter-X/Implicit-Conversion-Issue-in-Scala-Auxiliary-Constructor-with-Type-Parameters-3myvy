```scala
class MyClass[T](val value: T) {
  def this(value: Int) = this(value.toString) 
}

val myInt = new MyClass(5)
val myString = new MyClass("hello")
```