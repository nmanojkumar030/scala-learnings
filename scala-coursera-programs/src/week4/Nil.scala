package week4

class Nil[T] extends List[T] {
  override def isEmpty = true
  override def head: Nothing = throw new NoSuchElementException("Nil Head")
  override def tail: Nothing = throw new NoSuchElementException("Nil Tail")
}