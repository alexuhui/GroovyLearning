//使用"[]"定义list列表，并，对其直接操作
//使用":"分隔key和value来定义map数据，key不需要用引号引起来，并且能使用key对其直接对map进行读写操作

// -------------------------- list
def list = [1, 2]
list.leftShift(3)
list.push(0)

list.add("abc")
//groovy中的<<可以对list数据类型的作用添加值，在数字类型时是位运算操作
list << "<<";
list += "+="
println(list)

// list 遍历
list.forEach({ println(it)})


// --------------------------------- map
def map = [a: 2, b: new Date()];
//写入
map.put("aaaa","bbb")
println(map)
//写入
map.jjj = 600
println(map)

//修改
map.a = "a value"
println(map)

