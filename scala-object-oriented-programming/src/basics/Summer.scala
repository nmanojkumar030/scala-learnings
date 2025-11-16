package basics

object Summer {
  def main(args: Array[String]): Unit = {
    for (arg <- args) {
      ChecksumAccumulator.calculate(arg)
    }
  }
}