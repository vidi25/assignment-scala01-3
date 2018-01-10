package com.knoldus

class Operations {


  def addTwoLists(inputList1: List[Int], inputList2: List[Int]): List[Int] = {
    if(inputList1.lengthCompare(inputList2.length) == 0) {
      inputList1.zip(inputList2).map { case (element1, element2) => element1 + element2 }
    }
    else
      {
        throw new Exception("Lists are not of equal size")
      }

  }

  def printFibonacciSeries(number: Int, fibonacciSeries: List[Int] = List(1, 0)): List[Int] = {
    number match {
      case 1 | 2 => fibonacciSeries.reverse
      case _ => printFibonacciSeries(number - 1, fibonacciSeries(0) + fibonacciSeries(1) :: fibonacciSeries)

    }
  }


   def calculateArea(shape: String, firstSide: Int, secondSide: Int): String =  {
   def shapeArea(shape: String, firstSide: Int, secondSide: Int, area:(Int,Int) => Int) = {
     area(firstSide,secondSide)
   }
   shape.toLowerCase match {
       case "rectangle" | "parallelogram" => s"${shapeArea(shape,firstSide,secondSide,(firstSide,secondSide) => firstSide * secondSide)}"
       case "rhombus" => s"${shapeArea(shape,firstSide,secondSide,(firstSide,secondSide) => (firstSide * secondSide)/2)}"
       case _ =>    s"Area not defined for $shape"
       }
   }

  def doubleListElements(inputList: List[Int]): List[Int] = {
    inputList match {
      case Nil => throw new Exception("list is empty")
      case _ => inputList.map (element => element * 2)
    }
  }

  def findKthElement(index: Int, inputList: List[Int]): Int = {
    (index, inputList) match {

      case (0, head :: tail) => head
      case (index, head :: tail) => findKthElement(index-1, tail)
      case (_, Nil) => throw new Exception("list is empty")
    }
  }

  def findLengthOfList(inputList: List[Int]): Int = {
    def findLengthOfListRecursive(inputList: List[Int], listLength: Int): Int = {
      inputList match {
        case first :: second :: rest => findLengthOfListRecursive(second :: rest, listLength + 1)
        case first :: Nil => listLength
        case Nil => 0
      }
    }

    findLengthOfListRecursive(inputList, 1)
  }

  def reverseList(inputList: List[Int]): List[Int] = {
    inputList match {
      case Nil => inputList
      case first :: restList => reverseList(restList) ::: List(first)

    }
  }
}
