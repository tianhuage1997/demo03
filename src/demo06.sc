val m1=Map("tom"->23,"rose"->23)

val m2=scala.collection.mutable.Map("tom"->25,"rose"->50)

//--变长map追加kv对

m2+=("zzk"->111)

//--通过get(key),获取对应的value
m1.get("tom").getOrElse("error")

//--直接通过key取值
m1("tom")

//--获取map所有key

val i1=m1.keys
i1.foreach{println(_)}
//--获取map所有value
val i2=m1.values

i2.foreach{println(_)}


//遍历map
for(i<-i1){
  println(i)
}

for((k,v)<- m1){
  println(k)
}

for((k,v)<- m1)println(v)
//--此方法只有Map类型有,只针对Map的value操作
val m4=m1.mapValues{x=>x+1}
val m5=m1.map{case(k,v)=>(k,v+1)}
val m6=Map("tom"->18,"rose"->20,"jary"->25,"jim"->30)


//--要求利用filter,操作m6,过滤出年龄>20的数据
val m7=m6.filter{case(k,v)=> v>20}
//--操作m6,把jary和jim的数据过滤掉
//--注意 !前缀操作符，布尔取反，需要加空格

val m8=m6.filter{case(k,v)=> !k.startsWith("j")}
//--通过key取值
m6.contains("tom")
m6("tom")
m6.size
m6.toArray
