// 元编程的 MetaClass
// 在groovy中，可以使用 metaClass类来，对元对象添加属性和方法
// 类似C#扩展方法？
String.metaClass.uppers = { -> toUpperCase() }; 
println "aaa".uppers()

Integer.metaClass.say = { -> "I am Interger" }
def i = new Integer(100);

println i.say()

class testMeta{
    int a = 10
    int b = 20
}
// testMeta.metaClass.sum = { -> a + b}
testMeta.metaClass.sum = { -> delegate.a + delegate.b} // 和上一行等价  delegate 表示代理对象，可省略
testMeta test = new testMeta()
println("${test.a} + ${test.b} = ${test.sum()}")
test.a = 666
test.b = 666
println("${test.a} + ${test.b} = ${test.sum()}")