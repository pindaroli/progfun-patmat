

object test {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(180); 
  def insert(x: Int, l: List[Int]): List[Int] = l match {
    case List() => List(x)
    case y :: ys => if (x > y) y :: insert(x, ys) else x :: insert(y, ys)
  };System.out.println("""insert: (x: Int, l: List[Int])List[Int]""");$skip(120); 
  def iSort(l: List[Int]): List[Int] = l match {
    case List() => List()
    case y :: ys => insert(y, iSort(ys))
  };System.out.println("""iSort: (l: List[Int])List[Int]""");$skip(35); 

  val a = List(23, -4, 5, 1, 12);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(11); val res$0 = 
  iSort(a);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(39); 
  val b = List(1, 2, 3) ::: List(4, 5);System.out.println("""b  : List[Int] = """ + $show(b ));$skip(147); 

  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("Nil.last")
    case List(x) => x
    case x :: xs => last(xs)
  };System.out.println("""last: [T](xs: List[T])T""");$skip(155); 
  def init[T](xs:List[T]):List[T] = xs match {
   case List() => throw new Error("Nil.init")
   case List (x) => List()
   case y::ys => y :: init(ys)
  };System.out.println("""init: [T](xs: List[T])List[T]""");$skip(14); val res$1 = 
  
  last(a);System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  init(a);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(12); val res$3 = 
  a.drop(4);System.out.println("""res3: List[Int] = """ + $show(res$3))}
}
