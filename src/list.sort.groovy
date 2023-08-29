def lst = [13, 12, 15, 14];
def newlst = lst.sort();//默认排序
println newlst; //[12, 13, 14, 15]      

//自定义处理
def newlist2 = lst.sort {
    a, b -> b - a
}

println newlist2; //   [15, 14, 13, 12]