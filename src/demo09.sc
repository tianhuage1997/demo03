val l1=List("hello","world","hello","hello","world","hadoop")

//--按照指定条件做聚合，返回的是Map结构
//--Map的key的指定的条件元素，value是按相同元素聚合后的List
l1.groupBy{x=>x}

val l2=List(("bj",1),("sh",2),("bj",3),("sh",4))
//--要求操作l2,按地区做聚合

l2.groupBy(x=>x._1)




val l3=List("hello,world","hello,hadoop","hello,world")
//--要求利用已学过的高阶函数操作l3,实现单词的频次统计
//--最后的结果：
//--(hello,3) (world,2) (hadoop,1)
//--flatMap,groupBy,mapValues或map
l3.flatMap{x=>x.split(",")}.groupBy{word=>word}.map{case(k,v)=>(k,v.size)}.foreach{
  println
}

//第二种办法
l3.flatMap{line=>line.split(",")}
  .groupBy{word=>word}
  .mapValues{list=>list.size}
  .foreach{println}

//第三种办法
l3.flatMap{
  line=>line.split(",")}
  .groupBy{word=>word}
  .map{x=>(x._1,x._2.size)}
  .foreach{println}

//第四办法
l3.flatMap{line=>line.split(",")}
  .map{word=>(word,1)}
  .groupBy{x=>x._1}
    .mapValues{list=>list.map{x=>x._2}.sum}
      .foreach{println}


//第五种办法
l3.flatMap{
  line=>line.split(",")}
    .map{word=>(word,1)}
        .groupBy{x=>x._1}
          .mapValues{list=>list.map{x=>x._2}.reduce(_+_)}
              .foreach{println}



//第六种办法
l3.flatMap{_.split(",")}
  .map{(_,1)}
  .groupBy{_._1}
  .mapValues{_.map{_._2}.reduce(_+_)}
  .foreach{println}