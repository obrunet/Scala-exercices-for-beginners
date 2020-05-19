object TermsAndTypes{

  def toHexStringMethod(): String = {
    16.toHexString //invoke the toHexString method here
  }

  def containsMethod(): Boolean = {
    (0 to 10).contains(10) /*invoke the contains method here*/
  }
  def dropMethod(): String = {
    "foo".drop(1) /*invoke the drop method here*/
  }

  def takeMethod(): String = {
    "bar".take(2) /*invoke the take method here*/
  }

  def main(args: Array[String]): Unit = {
    println(toHexStringMethod())
    println(containsMethod())
    println(dropMethod())
    println(takeMethod())
  }
}