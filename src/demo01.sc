
for (i <- 0 to 10 reverse )println(i)


for(i <-10 to 0 by -2)println(i)


for(i <- 10.to(0,-3))println(i)




//不明白
def mi(x:Double,n:Int):Double={
    if (n==0)   return  1
    else  if (n>0 &&n%2==0) return  mi(x,n/2)*mi(x,n/2)
    else if (n>0 && n%2==1)  return  x*mi(x,n-1)
    else  return 1/mi(x,-n)
}

mi(2,1)
mi(2,-3)

def revert(arr:Array[Int])={
    for(i<- 0 until arr.length-1 by 2){
      val t =arr(i)
      arr(i) = arr(i+1)
      arr(i+1) = t
    }
}

val a1=Array(1,2,3,4,5,6)

revert(a1)

val m1=Map("book"->10,"gun"->100,"ipad"->1000)


val m2 = for((k,v)<-m1)yield{(k,v*0.9)}





