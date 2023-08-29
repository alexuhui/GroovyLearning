// list中内置了很多迭代方法，如，find,findAll,collect 等等
def list = ['foo', 'bar']
def newList = []
list.collect(newList){
    it.toUpperCase()
}
println newList

//或者
list = ['foo', 'bar']
newList = []
list.collect(newList, {
    it.toUpperCase()
})
println newList


// 这个有点像函数?
def a = {
    println "a this:" + this
    println "a owner:" + owner // ower指向b

    def b = {
        def c = 10 + 1
        println "ccc : ${c}"
        println "b this:" + this
        println "b owner:" + owner // ower指向b
    }
    b.call()
}
a.call()