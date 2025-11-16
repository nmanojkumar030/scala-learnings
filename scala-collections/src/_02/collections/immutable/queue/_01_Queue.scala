package _02.collections.immutable.queue

import scala.collection.immutable.Queue

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

    // add elements to Queue using :+
    println(queue01 :+ 5)
    println(queue01)

    //to add elements to Queue using enqueue
    queue01 enqueue (10, 12, 11)
    println(queue01)

    // first element or head from the Queue
    // Calling dequeue returns a Tuple2 with the last element that was
    // inserted to the Queue and the remaining elements of the queue.
    println(queue01.dequeue)

    // add two Queues together using ++
    val queue02 = Queue(12, 13, 14, 15)
    println(queue01 ++ queue02)
  }

}