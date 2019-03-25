import scala.collection.mutable.ArrayBuffer

/**
  * scala的集合collection)是一个大的概念
*包含了：Array,List,Set,Map,Tuple
 **
 本节学习Array的声明、使用和常用的方法
  **/

val a1 = Array(1,2,3,4)
//--声明一个变长数组并赋值，
//--变长数组的长度可变，比如实现追加元素等操作
//--mutable:可变
//--immutable:不可变
val a2 = ArrayBuffer(1,2,3,4)

val a3 = ArrayBuffer(1,2,3,4)

//声明定长数组，并指定长度
val a4 = new Array[Int](5)

a4(4)

for(i<- 0 to a1.length-1)println(a1(i))

for(i<- 0  until  a1.length)println(a1(i))

//--要求用for循环，为a4数组赋值，0,1,2,3
for (i <- 0 until a4.length)a4(i)=i

//--变长数组，可以通过append追加元素
for (i<- 0 until 8){
  a2.append(i)
}

a2

val a5=Array(1,2,3)
val a6=Array(3,4,5)


val a7 = Array.concat(a5,a6)


//--既能拼定长也能拼变长

val a8 =ArrayBuffer.concat(a1,a2)
//--生成区间数组，一般用于生成测试数据集

val a9 =Array.range(0,10,2)
//--生成指定长度的数组,并将匿名函数应用到初始值
//--一般用于生成具有某种函数关系的数列

val a10 =Array.iterate(2,5)(x=>x*2)

//--生成指定长度的数组，并且将匿名函数应用于数组下标
val a11 =Array.tabulate(5)(x=>x*2)


//--求数组所有元素和
val a12=Array(1,2,3,4)
val sum = a12.sum
//--求数组中最大元素
val max=a12.max
//--求数组中最小元素
val min=a12.min


val a13=Array(2,1,4,3,5)
//--通过scala提供的快速排序工具类实现升序
scala.util.Sorting.quickSort(a13)
a13.reverse

//--取出前n个元素，并返回一个新数组
val a14 = a12.take(2)

//--取出尾部个元素，并返回一个新数组
val a15=a12.takeRight(2)


//--去除头n个元素，并将剩余元素返回成一个新数组
val a16 =a12.drop(1)

//--去除尾n个元素，并将剩余元素返回成一个新数组
val a17=a12.dropRight(2)


//--把数组的头元素返回
a12.head
a12.take(1)

//--取出数组的尾元素
a12.last


//--根据指定的匿名函数过滤，并返回新数组
val a18=a12.filter{x=>x%2==0}

//--过滤出a19中男性数据

val a19=Array("tom,m,23","rose,f,30","jary,m,35")

val a20=a19.filter{x=>x.split(",")(1).equals("m")}


//--过滤出a19中年龄>25岁的数据
val a21 =a19.filter{x=>x.split(",")(2).toInt>25}

//--map 映射方法，作用:将数组中每个元素根据匿名函数
//--映射到另外一个形式
//--特定:数据形式发生变化，但元素个数不变
val a22 = Array(1,2,3,4)
val a23=a22.map{x=>x*2}

//--操作a24,将元素类型由String->Int
val a24=Array("20","25","30")
val a25=a24.map{x=>x.toInt}



//--操作a19,生成的新数组，每个元素是姓名

val a26=a19.map{x=>x.split(",")(0)}

val a27=Array(1,2,3,4)
val s1=a27.mkString
println(s1)
val s2=a27.mkString(",")



//--操作a28,生成的新数组，a29("tom,m,24","rose,f,31","jary,m,36")
val a28=Array("tom,m,23","rose,f,30","jary,m,35")
val a29=a28.map{(x:String)=>
  val arr=x.split(",")
  val age=arr(2).toInt+1
  arr(2)=age.toString()
  arr.mkString(",")
}




//--扁平化map方法
//--特点:映射方法，而且会改变元素个数
val a30=Array("hello,world","hello,hadoop","hello,spark")


val a31=a30.map{x=>x.split(",")}

//--扁平化map方法
//--特点:映射方法，而且会改变元素个数
val a32=a30.flatMap{x=>x.split(",")}


