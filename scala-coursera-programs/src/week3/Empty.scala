package week3

/**
 * Empty is a child class of Parent class Inset
 */
object Empty extends Inset { // Using "object" keyword creates singleton object

  /**
   * contains method is implemented here
   */
  override def contains(x: Int): Boolean = false

  /**
   * include method is implemented here
   */
  override def include(x: Int): Inset = new NonEmpty(x, Empty, Empty); // Singleton objects are values no need to use the new operator

  /**
   * union method is implemented here
   */
  override def union(other: Inset): Inset = other

  /**
   * toString method is overridden here
   */
  override def toString = "."
}