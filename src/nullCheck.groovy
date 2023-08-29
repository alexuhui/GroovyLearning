def a = null;
def b = a?:"bbb";//在定义b变量时，先判断a是否有值，如果有，就取a的值作为b的值，否则就取值"bbb"

println(b)


class Person{
    def getName()
    {
        return "person"
    }
}

def person 
String name = person?.getName() //先判断person是否为不为null,然后，再调用getName方法
println(name)
person = new Person()
name = person?.getName()
println(name)