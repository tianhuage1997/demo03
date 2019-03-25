//--声明一个元组(Tuple)
//--是最常用，最重要的数据结构


val t1=(1,2,3,4)

val t2=(Array(1,2,3),List(1,2),"hello",100)

val t3=((1,2,3),"hello",(1,2,(3,4)))

t1._1

t2._1(2)

t3._1._3
t3._3._3._1


val a1=Array(("hello",1),("world",1),("hadoop",1))
//--要求，操作a1,返回一个新数组a2("hello","world","hadoop")
val a2=a1.map{x=>x._1}
val a22=a1.map{x=>x._2}

//--要求，操作a2，返回一个新数组a3(("hello",1),("world",1),("hadoop",1))

val a3=a2.map{x=>(x,1)}

val a4=Array("tom,23,m","rose,25,f","jary,30,m")
//--要求操作a4,返回a5(("tom",23,"m"),("rose",25,"f"),("jary",30,"m"))
val a5=a4.map{x=>
  val arr=x.split(",")
  val name=arr(0)
  val age=arr(1).toInt
  val gender=arr(2)
  (name,age,gender)
}
