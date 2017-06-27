object helloworksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(49); 
	def add = (x:Int) => x+1;System.out.println("""add: => Int => Int""");$skip(16); 
	print(add(10));$skip(38); 
	
	List(1,2,5).foreach((x)=>print(x));$skip(31); 
	Array(0,2,8).foreach(println);$skip(33); 
	
	val list = 1 :: 2 :: 3 :: Nil;System.out.println("""list  : List[Int] = """ + $show(list ));$skip(13); 
	print(list);$skip(29); 
	list.foreach(x=>println(x));$skip(31); 
	
	var list1 = List.range(0,5);System.out.println("""list1  : List[Int] = """ + $show(list1 ));$skip(22); 
	list1.foreach(print);$skip(31); 
	
	val x = List.fill(3)("foo");System.out.println("""x  : List[String] = """ + $show(x ));$skip(20); 
	x.foreach(println);$skip(44); 

	var list2 =  List(-11, -10, -5, 0, 5, 10);System.out.println("""list2  : List[Int] = """ + $show(list2 ));$skip(27); 
	list2 = list2.filter(_>0);$skip(24); 
	list2.foreach(println);$skip(66); 
	
	def echo(args:String*) = {
	  for(arg <- args) println(arg)
	};System.out.println("""echo: (args: String*)Unit""");$skip(13); 
	echo("abc");$skip(20); 
	echo("abc","bded");$skip(41); 
	val arr = Array("What's", "up", "doc?");System.out.println("""arr  : Array[String] = """ + $show(arr ));$skip(14); 
	echo(arr:_*);$skip(43); 
	
	//currying
	def fun(x:Int)(y:Int) = x+y;System.out.println("""fun: (x: Int)(y: Int)Int""");$skip(34); 
	def fun1(x:Int) = (y:Int) => x+y;System.out.println("""fun1: (x: Int)Int => Int""");$skip(20); 
	
	print(fun(1)(2));$skip(19); 
	print(fun1(2)(3));$skip(35); 

	var s1 = new student(10, "Eric");System.out.println("""s1  : student = """ + $show(s1 ));$skip(8); val res$0 = 
	s1.age;System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
	s1.name;System.out.println("""res1: String = """ + $show(res$1))}


}
class student(_age:Int, _name:String){
	def age = _age
	def name = _name

}
