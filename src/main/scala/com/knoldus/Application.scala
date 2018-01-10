package com.knoldus

object Application extends App{
  val app = new Operations
  val element1 = 2
  val element2 = 5
  val element3 = 4
  val inputList1 = List(element1,element2,element3)

  val element4 = 10
  val element5 = 3
  val element6 = -1
  val inputList2 = List(element4,element5,element6)

  val inputNumber = 3

  val inputSide1 = 3
  val inputSide2 = 5
  val shape = "rectangle"

  println(app.addTwoLists(inputList1,inputList2))

  println(app.printFibonacciSeries(inputNumber))

  /*if(app.calculateArea(shape,inputSide1,inputSide2)== -1)
    {
      println(s"Area not defined for $shape")
    }
  else
  {
    println(s"Area = ${app.calculateArea(shape,inputSide1,inputSide2)}")
  }*/

  //app.calculateArea(shape,inputSide1,inputSide2)

  println(app.doubleListElements(inputList1))

  println(s"kth element is  ${app.findKthElement(2,inputList1)}")

  println(s"Length of list ${app.findLengthOfList(inputList2)}")

  println(s"Reverse of list ${app.reverseList(inputList2)}")

}
