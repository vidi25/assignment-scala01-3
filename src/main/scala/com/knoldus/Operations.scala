package com.knoldus

class Operations {


  def addTwoLists(inputList1: List[Int], inputList2: List[Int]) = {
    inputList1.zipAll(inputList2,0,0).map{ case (element1,element2) => element1 + element2}
  }

  def printFibonacciSeries(number: Int, series: List[Int] = List(1,0)): List[Int] = {
   number match {
     case 1 | 2 => series
     case _ => printFibonacciSeries(number -1,  (series(0) +series(1) :: series))

   }
    }


  def calculateArea(shape: String, firstSide: Int, secondSide: Int) =  {
  def shapeArea(shape: String, firstSide: Int, secondSide: Int, area:(Int,Int) => Int): String = {
    shape.toLowerCase match {
      case "rectangle" | "parallelogram" => shapeArea(shape,firstSide,secondSide,(firstSide,secondSide) => firstSide * secondSide)
      case "rhombus" => shapeArea(shape,firstSide,secondSide,(firstSide,secondSide) => (firstSide * secondSide)/2)
      case _ =>    s"Area not defined for $shape"
    }
  }
  }

def doubleListElements(inputList: List[Int]): List[Int] = {
  inputList.map( element => element * 2)
}

  def findKthElement(index: Int, inputList: List[Int]): Int = {
    (index,inputList) match {

      case (0,head :: tail) => head
      case (index,head :: tail) => findKthElement(index - 1,tail)
      case (_,Nil) => throw new Exception("list is empty")
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
