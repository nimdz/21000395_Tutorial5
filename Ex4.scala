object Ex4 extends App {

  def isEven(n:Int):Boolean=n match {
    case 0 => true
    case _=>isOdd(n-1)
  }
  def isOdd(a:Int):Boolean= !(isEven(a))

  print("Enter a number: ")
   var num=scala.io.StdIn.readInt()
   println(isEven(num))
}
