import patmat.Huffman._
object test2 {

  val a="eliodoro pinodaro col giummo".toList     //> a  : List[Char] = List(e, l, i, o, d, o, r, o,  , p, i, n, o, d, a, r, o,  , 
                                                  //| c, o, l,  , g, i, u, m, m, o)
  val b=a.groupBy(_.toChar)                       //> b  : scala.collection.immutable.Map[Char,List[Char]] = Map(e -> List(e), n -
                                                  //| > List(n), u -> List(u), a -> List(a), m -> List(m, m), i -> List(i, i, i), 
                                                  //|   -> List( ,  ,  ), g -> List(g), l -> List(l, l), p -> List(p), c -> List(c
                                                  //| ), r -> List(r, r), o -> List(o, o, o, o, o, o, o), d -> List(d, d))
  val s=times(a)                                  //> s  : List[(Char, Int)] = List((e,1), (n,1), (u,1), (a,1), (m,2), (i,3), ( ,3
                                                  //| ), (g,1), (l,2), (p,1), (c,1), (r,2), (o,7), (d,2))
  s.sortWith( (x,y) => x._2<y._2)                 //> res0: List[(Char, Int)] = List((e,1), (n,1), (u,1), (a,1), (g,1), (p,1), (c,
                                                  //| 1), (m,2), (l,2), (r,2), (d,2), (i,3), ( ,3), (o,7))
 List('a','b') union List('c')                    //> res1: List[Char] = List(a, b, c)
 decodedSecret                                    //> res2: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
 decode(frenchCode,encode(frenchCode)("olindo".toList))
                                                  //> res3: List[Char] = List(o, l, i, n, d, o)
 encode(frenchCode)("olindo".toList)              //> res4: List[patmat.Huffman.Bit] = List(0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1,
                                                  //|  0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0)
//List(0) union List(0,0,0,1)
//convert(frenchCode)
//List(1).tail
 quickEncode(frenchCode)("olindo".toList)==encode(frenchCode)("olindo".toList)
                                                  //> res5: Boolean = true

}