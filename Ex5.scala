object Ex5 extends App {

   var total=0
  def sumEven(n:Int): Unit = {
     if(n>0){
       if(n%2 == 0) {
            total+=n
         sumEven(n-1)
       }
       else{
         sumEven(n-1)
       }
     }
    else {
       println("Total of Even numbers:" + total)
     }
  }

  print("Enter a number:")
  var a=scala.io.StdIn.readInt()
  sumEven(a)
}
