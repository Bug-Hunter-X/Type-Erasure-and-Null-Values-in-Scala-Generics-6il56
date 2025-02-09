```scala
class MyClass[T](val value: Option[T]) {
  def this(value: T) = this(Some(value))
  def this() = this(None)
}
```