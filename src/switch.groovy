
def x = 2
def testSwitch =  {
    switch (x) {
        case [1, 2, 3]:
            println(x + " : 1-3")
            break;
        case "foo":
            println(x + " : foo")
        case 4..1000:
            println(x + " : 4-1000")
            break;
         case Date:
             println("Date ${x}")
            break;
    }
}

10.times{
    x = it
    testSwitch.call()
}

x = new Date()
testSwitch.call()
    