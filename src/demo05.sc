//--声明定长Set
val s1=Set(1,1,2,2,3)
//--声明变长Set
val s2=scala.collection.mutable.Set(1,1,1,2,2,3)


val s3=Set(1,2,3)
val s4=Set(3,4,5)
//--取交集
s3.intersect(s4)
val res2=s3&s4

//--取差集,注意调用方法的顺序，一般用于比较文件数据的不同
s3.diff(s4)
s4.diff(s3)
s3&~s4
s4&~s3
//--合并Set,并返回新Set
val s5=s3++s4
//--根据指定的匿名函数返回个数
s3.count{x=>x%2!=0}


val s6=Set(1,2,3,4,5,6,7)
//--把一个Set拆成2个子Set
//--并封装到一个Tuple中。
val result = 22
s6.splitAt(4)._2