i = 1
def post(){
    i = i++ 
    println (i) //1
    i = i++
    println (i) //1
}
def pre(){
    i = ++i 
    println (i) //2
    i = ++i
    println (i) //3
}
post()
pre()