def add = (x:Int) => x+1
print(add(10))

List(1,2,5).foreach((x)=>print(x))
Array(0,2,8).foreach(println)

val list = 1 :: 2 :: 3 :: Nil
print(list)
list.foreach(x=>println(x))

var list1 = List.range(0,5)
list1.foreach(print)

val x = List.fill(3)("foo")
x.foreach(println)


var list2 =  List(-11, -10, -5, 0, 5, 10)
list2 = list2.filter(_>0)
list2.foreach(println)

def echo(args:String*) = {
  for(arg <- args) println(arg)
}
echo("abc")
echo("abc","bded")
val arr = Array("What's", "up", "doc?")
echo(arr:_*)

//currying
def fun(x:Int)(y:Int) = x+y
def fun1(x:Int) = (y:Int) => x+y

print(fun(1)(2))
print(fun1(2)(3))
















