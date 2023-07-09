object Ex3 extends App{

   var total:Int=0
    def Sum(n:Int):Unit={
      total+=n
      if(n>0) Sum(n-1)
      else  println(total)
    }

  println("Enter a Number");
  var num=scala.io.StdIn.readInt()
  Sum(num)

}
