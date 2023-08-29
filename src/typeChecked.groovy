class Foos{
    int  i = 42.0; //编译通过
}


@groovy.transform.TypeChecked
class Foo{
    int i = 42  //编译通过
    // int  i = 42.0;//编译不通过
}

def fs = new Foos()
def f = new Foo()
println("${fs.i}   ${f.i}")