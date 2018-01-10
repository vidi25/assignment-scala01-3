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

  print(s"${app.addTwoLists(inputList1,inputList2)}\n")

  print(s"${app.printFibonacciSeries(inputNumber)}\n")


  print(s"Area of $shape = ${app.calculateArea(shape,inputSide1,inputSide2)}\n")

  print(s"${app.doubleListElements(inputList1)}\n")

  print(s"kth element is  ${app.findKthElement(2,inputList1)}\n")

  print(s"Length of list ${app.findLengthOfList(inputList2)}\n")

  print(s"Reverse of list ${app.reverseList(inputList2)}\n")

}
