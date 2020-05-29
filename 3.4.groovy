//i ++: загрузить x из памяти, использовать, увеличивать, хранить обратно в память.
// ++ i: загрузить x из памяти, увеличить, использовать, сохранить обратно в память.

def post(){
    int i = 1
    i = i++ 
    println (i) //1  
}
def pre(){
    int i = 1
    i = ++i 
    println (i) //2
}
def craftpost() {
    int i = 1
    temp = i
    i = i + 1 
    i = temp 
    println (i) 
}
def crasftpre(){
    int i = 1
    i = i + 1
    println (i) 
}
post()
pre()
craftpost() 
crasftpre()
