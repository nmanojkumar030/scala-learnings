package week3

/**
 * NonEmpty is a child class of Parent class Inset
 */
class NonEmpty(element: Int, left: Inset, right: Inset) extends Inset {

  /**
   * contains method is implemented here
   */
  override def contains(x: Int): Boolean =
    if (x < element) left contains x // Recursion call
    else if (x > element) right contains x // Recursion call
    else true;

  /**
   * include method is implemented here
   */
  override def include(x: Int): Inset =
    if (x < element) new NonEmpty(element, left include x, right) // Recursion call - "left include x"
    else if (x > element) new NonEmpty(element, left, right include x) // Recursion call - " right include x"
    else this

  /**
   * union is implemented here
   */
  override def union(other: Inset): Inset = ((left union right) union other) include element // Recursion call

  /**
   * toString method is overridden here
   */
  override def toString = "{" + this.left + element + right + "}" // We could also refer the member variables through this keyword
}