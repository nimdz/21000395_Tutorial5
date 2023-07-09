import scala.io.StdIn._


object Ex1 extends App{

  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a =>GCD(x,a)
    case x => GCD(x,a%x)

  }
  def Prime(i:Int,n:Int=2):Boolean=n match {
    case x if (x==i) => true
    case x if GCD(i,x)>1 => false
    case x  =>Prime(i,x+1)
  }
  println("Enter a Number: ")
  val a=readInt()
  println(Prime(a))

}
