import patmat.Huffman._
object test2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 

  val a="eliodoro pinodaro col giummo".toList;System.out.println("""a  : List[Char] = """ + $show(a ));$skip(28); 
  val b=a.groupBy(_.toChar);System.out.println("""b  : scala.collection.immutable.Map[Char,List[Char]] = """ + $show(b ));$skip(17); 
  val s=times(a);System.out.println("""s  : List[(Char, Int)] = """ + $show(s ));$skip(34); val res$0 = 
  s.sortWith( (x,y) => x._2<y._2);System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(31); val res$1 = 
 List('a','b') union List('c');System.out.println("""res1: List[Char] = """ + $show(res$1));$skip(15); val res$2 = 
 decodedSecret;System.out.println("""res2: List[Char] = """ + $show(res$2));$skip(56); val res$3 = 
 decode(frenchCode,encode(frenchCode)("olindo".toList));System.out.println("""res3: List[Char] = """ + $show(res$3));$skip(37); val res$4 = 
 encode(frenchCode)("olindo".toList);System.out.println("""res4: List[patmat.Huffman.Bit] = """ + $show(res$4));$skip(146); val res$5 = 
//List(0) union List(0,0,0,1)
//convert(frenchCode)
//List(1).tail
 quickEncode(frenchCode)("olindo".toList)==encode(frenchCode)("olindo".toList);System.out.println("""res5: Boolean = """ + $show(res$5))}

}