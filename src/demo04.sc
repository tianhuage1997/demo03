import scala.collection.mutable.ListBuffer
//--声明一个定长List,并赋值
val l1=List(1,2,3,4)
//--声明变长List
val l2=ListBuffer(1,2,3,4)

//--声明一个定长List
val l4=1::2::3::4::Nil

//--声明一个空List
val l5=Nil
//--等价于L5
val l6=List[Nothing]()

//--List是通过下标来取值和赋值，同Array
l1(0)

//--基于一个定长List,在左侧添加元素，并返回新List
0+:l1

//--在右侧加元素，并返回新List
l1:+5
l1.head
l1.take(1)
l1.takeRight(5)

l1.last
l1.drop(1)
l1.dropRight(1)

val l7=List(1,2,3)
val l8=List(4,5,6)

//--拼接多个定长List,也可以拼变长
List.concat(l7,l8)

//--等价于concat,区别只能同类型定长拼接
l7:::l8

//--生成指定重复元素的List,一般用于生成测试集
val  l9=List.fill(5)("a")

val l10=List.tabulate(5)(x=>x+3)

//--反转
val l11=l7.reverse


//--通过下标取值，apply可以省略
l7(0)
l7.apply(0)
l7.contains(2)
val a1=new Array[Int](3)
//--将List从指定下标位置，拷贝指定数量的元素到数组中
l7.copyToArray(a1,0,a1.length)

//--List->Array
val a2=l7.toArray



val l12=List(1,2,3,4,5)
//--去重
val l13=l12.distinct
val a3=Array(1,1,2,2,3)
//--建议掌握这种类型转换的技巧
//--比如某些方法，List有但是Array没有，可以想到做类型转换
val a4=a3.toList.distinct.toArray
//--根据指定的匿名函数，判断元素是否存在
l12.exists{x=>x%2==0}

//--遍历方法，一般用于打印测试
//--此方法要求，传入的匿名函数的返回值类型是Unit
l12.foreach{x=>println(x)}

l12.indexOf(3,0)
//--取交集,一般用于比较文件数据的相同数据

val l14=List(1,2,3)
val l15=List(3,4,5)
val l16=l14.intersect(l15)

//> l17  : List[String] = List(hello,world, hello,hadoop, hello,1807)
val l17=List("hello,world","hello,hadoop","hello,1807")

//> l18  : List[String] = List(hello,spark, hello,hadoop, hello,1807)
val l18=List("hello,spark","hello,hadoop","hello,1807")

val l19=List("hello,world","hello,hadoop","hello,scala")


//> l19  : List[String] = List(hello,world, hello,hadoop, hello,scala)

//--取出l17,l18,l19共同元素的个数

val l20=l17.intersect(l18).intersect(l19)

//--按指定元素做升序排序

val l21=List(2,1,4,3,5)
//--降序排序，注意前缀操作符需要加空格
val l22=l21.sortBy{_=>_}

//> l24  : List[Array[Int]] = List(Array(1, 23), Array(2, 25), Array(3, 18))
//--sortBy排序时，指定的元素类型不能是Any类型
val l24=List(Array(1,23),Array(2,25),Array(3,18))
val l25=l24.sortBy{arr=>arr(1)}

val l26=List(1,2,3,4)
//--此方法是一个迭代方法
//--①a=1,b=2 a+b=3
//--②a=3,b=3 a+b=6
//--③a=6,b=4 a+b=10
l26.reduceLeft{(a:Int,b:Int)=>a+b}

//--操作l26,得到阶乘的结果
l26.reduceLeft{(a:Int,b:Int)=>a*b}

//--计算1~10的阶乘结果
1 to 10 reduceLeft{_*_}