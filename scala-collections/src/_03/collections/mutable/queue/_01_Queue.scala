package _03.collections.mutable.queue

import scala.collection.mutable.Queue

object _01_Queue {
  def main(args: Array[String]): Unit = {

    // Initialize the queue
    val queue01 = Queue(1, 5, 3, 2, 4)
    println(queue01)

    println(s"Element at index 0 = ${queue01(0)}")
    println(s"Element at index 0 = ${queue01(1)}")
    println(s"Element at index 0 = ${queue01(2)}")
    println(s"Element at index 0 = ${queue01(3)}")
    println(s"Element at index 0 = ${queue01(4)}")
    
    //initialize an empty Queue
    val emptyQueue: Queue[String] = Queue.empty[String]

    // add elements to Queue using +=
    queue01 += (6, 8, 9)
    println(queue01)

    //to add elements to Queue using enqueue
    queue01 enqueue (10, 12, 11)
    println(queue01)

    // first element or head from the Queue
    println(queue01.dequeue())
  }
}