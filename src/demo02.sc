val  v1=100

//声明懒值
lazy  val v2 = 100
println(v2)

def f1(a:Int,b:Int):Int={a+b}

//柯里化技术
def f11(a:Int)(b:Int)={a+b}

def f2(a:Int,b:Int,c:Int)={a+b+c}

def f21(a:Int)(b:Int)(c:Int)={a+b+c}

def f22(a:Int,b:Int)(c:Int)={a+b+c}

def f23(a:Int,b:Int)(c:Int)={a+b+c}

def f3(a:Int,b:Int,f:(Int,Int)=>Int)={
  f(a,b)
}

def f31(a:Int)(b:Int)(f:(Int,Int)=>Int)={
  f(a,b)
}

def f32(a:Int,b:Int)(f:(Int,Int)=>Int)={
  f(a,b)
}

def f33(a:Int)(b:Int,f:(Int,Int)=>Int)={
  f(a,b)
}
//下面的结构，两部分，一部分是普通参数
//另外一部分是匿名函数
//称这样的结构为自建控制结构
//所以柯里化数允许用户创建自建控制结构
f32(1,2)((a:Int,b:Int)=>{a+b})
f32(1,2)(_+_)


