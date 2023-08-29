def lst = [13, 12, 15, 14, 0, -1];
def newlst = [];
newlst = lst.collect {
    // 对每个元素求平方
    it * it
}

println newlst //[169, 144, 225, 196, 0, 1]