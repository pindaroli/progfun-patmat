import common._

object week5 {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(195); 
  def insert(x: Int, l: List[Int]): List[Int] = l match {
    case List() => List(x)
    case y :: ys => if (x > y) y :: insert(x, ys) else x :: insert(y, ys)
  };System.out.println("""insert: (x: Int, l: List[Int])List[Int]""");$skip(120); 
  def iSort(l: List[Int]): List[Int] = l match {
    case List() => List()
    case y :: ys => insert(y, iSort(ys))
  };System.out.println("""iSort: (l: List[Int])List[Int]""");$skip(39); 
  val b = List(1, 2, 3) ::: List(4, 5);System.out.println("""b  : List[Int] = """ + $show(b ));$skip(147); 

  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("Nil.last")
    case List(x) => x
    case x :: xs => last(xs)
  };System.out.println("""last: [T](xs: List[T])T""");$skip(161); 
  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("Nil.init")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  };System.out.println("""init: [T](xs: List[T])List[T]""");$skip(225); 
  def merge(xs: List[Int], ys: List[Int]): List[Int] =
	xs match {
	case Nil => ys
	case x :: xs1 => ys match {
	   case Nil => xs
	   case y :: ys1 => if (x<y) x :: merge (xs1,ys)
	   									else y :: merge(xs,ys1)
		}
	};System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(175); 

  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (r, l) = xs splitAt n;
      merge(msort(r), msort(l))
    }
  };System.out.println("""msort: (xs: List[Int])List[Int]""");$skip(170); 
  def pack[T](xs:List[T]): List[List[T]] = xs match {
     case Nil => Nil
     case y :: ys => {
       val (s,n)=xs.partition(x=> x==y);
       s :: pack(n)
     }
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(42); 
  val a = List(23, -4, 5, 1,23, -4,12,-4);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(11); val res$0 = 
  iSort(a);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(10); val res$1 = 
  last(a);System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  init(a);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(12); val res$3 = 
  a.drop(4);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(14); val res$4 = 
  a splitAt 3;System.out.println("""res4: (List[Int], List[Int]) = """ + $show(res$4));$skip(11); val res$5 = 
  msort(a);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(10); val res$6 = 
  pack(a);System.out.println("""res6: List[List[Int]] = """ + $show(res$6))}
}
