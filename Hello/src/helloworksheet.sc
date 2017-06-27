object helloworksheet {
	def add = (x:Int) => x+1                  //> add: => Int => Int
	print(add(10))                            //> 11
	
	List(1,2,5).foreach((x)=>print(x))        //> 125
	Array(0,2,8).foreach(println)             //> 0
                                                  //| 2
                                                  //| 8
	
	val list = 1 :: 2 :: 3 :: Nil             //> list  : List[Int] = List(1, 2, 3)
	print(list)                               //> List(1, 2, 3)
	list.foreach(x=>println(x))               //> 1
                                                  //| 2
                                                  //| 3
	
	var list1 = List.range(0,5)               //> list1  : List[Int] = List(0, 1, 2, 3, 4)
	list1.foreach(print)                      //> 01234
	
	val x = List.fill(3)("foo")               //> x  : List[String] = List(foo, foo, foo)
	x.foreach(println)                        //> foo
                                                  //| foo
                                                  //| foo

	var list2 =  List(-11, -10, -5, 0, 5, 10) //> list2  : List[Int] = List(-11, -10, -5, 0, 5, 10)
	list2 = list2.filter(_>0)
	list2.foreach(println)                    //> 5
                                                  //| 10
	
	def echo(args:String*) = {
	  for(arg <- args) println(arg)
	}                                         //> echo: (args: String*)Unit
	echo("abc")                               //> abc
	echo("abc","bded")                        //> abc
                                                  //| bded
	val arr = Array("What's", "up", "doc?")   //> arr  : Array[String] = Array(What's, up, doc?)
	echo(arr:_*)                              //> What's
                                                  //| up
                                                  //| doc?
	
	//currying
	def fun(x:Int)(y:Int) = x+y               //> fun: (x: Int)(y: Int)Int
	def fun1(x:Int) = (y:Int) => x+y          //> fun1: (x: Int)Int => Int
	
	print(fun(1)(2))                          //> 3
	print(fun1(2)(3))                         //> 5

	var s1 = new student(10, "Eric")          //> s1  : student = student@f6c48ac
	s1.age                                    //> res0: Int = 10
	s1.name                                   //> res1: String = Eric


}
class student(_age:Int, _name:String){
	def age = _age
	def name = _name

}