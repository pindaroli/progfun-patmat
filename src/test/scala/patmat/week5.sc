import common._

object week5 {
  def insert(x: Int, l: List[Int]): List[Int] = l match {
    case List() => List(x)
    case y :: ys => if (x > y) y :: insert(x, ys) else x :: insert(y, ys)
  }                                               //> insert: (x: Int, l: List[Int])List[Int]
  def iSort(l: List[Int]): List[Int] = l match {
    case List() => List()
    case y :: ys => insert(y, iSort(ys))
  }                                               //> iSort: (l: List[Int])List[Int]
  val b = List(1, 2, 3) ::: List(4, 5)            //> b  : List[Int] = List(1, 2, 3, 4, 5)

  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("Nil.last")
    case List(x) => x
    case x :: xs => last(xs)
  }                                               //> last: [T](xs: List[T])T
  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("Nil.init")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }                                               //> init: [T](xs: List[T])List[T]
  def merge(xs: List[Int], ys: List[Int]): List[Int] =
	xs match {
	case Nil => ys
	case x :: xs1 => ys match {
	   case Nil => xs
	   case y :: ys1 => if (x<y) x :: merge (xs1,ys)
	   									else y :: merge(xs,ys1)
		}
	}                                         //> merge: (xs: List[Int], ys: List[Int])List[Int]

  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (r, l) = xs splitAt n;
      merge(msort(r), msort(l))
    }
  }                                               //> msort: (xs: List[Int])List[Int]
  def pack[T](xs:List[T]): List[List[T]] = xs match {
     case Nil => Nil
     case y :: ys => {
       val (s,n)=xs.partition(x=> x==y);
       s :: pack(n)
     }
  }                                               //> pack: [T](xs: List[T])List[List[T]]
  val a = List(23, -4, 5, 1,23, -4,12,-4)         //> a  : List[Int] = List(23, -4, 5, 1, 23, -4, 12, -4)
  iSort(a)                                        //> res0: List[Int] = List(-4, -4, -4, 1, 5, 12, 23, 23)
  last(a)                                         //> res1: Int = -4
  init(a)                                         //> res2: List[Int] = List(23, -4, 5, 1, 23, -4, 12)
  a.drop(4)                                       //> res3: List[Int] = List(23, -4, 12, -4)
  a splitAt 3                                     //> res4: (List[Int], List[Int]) = (List(23, -4, 5),List(1, 23, -4, 12, -4))
  msort(a)                                        //> res5: List[Int] = List(-4, -4, -4, 1, 5, 12, 23, 23)
  pack(a)                                         //> res6: List[List[Int]] = List(List(23, 23), List(-4, -4, -4), List(5), List(
                                                  //| 1), List(12))
}
