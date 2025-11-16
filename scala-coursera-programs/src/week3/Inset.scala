package week3

/**
 *  Abstract Base class, may contain abstract methods<br>
 *  The following are the three abstract methods
 */
abstract class Inset {
  def include(x: Int): Inset
  def contains(x: Int): Boolean
  def union(other: Inset): Inset
}