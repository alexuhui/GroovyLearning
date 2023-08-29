    class Groovy {
        String a
        int b
    }
    
    def groovy = new Groovy();
    
    groovy.a = "perperty"
    groovy.b = 660
    groovy.b = "c" // 转成 assii 码 99
    // groovy.b = "cw"  // 报错 ： Cannot cast object 'cw' with class 'java.lang.String' to class 'int'

    println(groovy.a)
    println(groovy.b)