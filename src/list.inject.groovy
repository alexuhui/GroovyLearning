def list = ["love", "you", "!"]
def aa = list.inject() {sum, elem ->
    "$sum $elem "
}

println aa

aa = list.inject('I') {sum, elem ->
    "$sum $elem "
}

println aa

aa = list.inject('I') {sum, elem ->
    "$sum | $elem"
}

println aa