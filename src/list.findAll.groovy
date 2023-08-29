def lst = [13, 12, 15, 14,0,-1];
def newlst = lst.findAll();//[13, 12, 15, 14, -1]

println newlst;//


def newlst2 = lst.findAll {
    value -> value < 13
};
println newlst2;//[12, 0, -1]