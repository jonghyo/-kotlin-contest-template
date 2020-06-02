import java.io.PrintWriter

// 入力取得
private fun read() = readLine()!!
private fun readInt() = read().toInt()
private fun readLong() = read().toLong()
private fun nextDouble() = read().toDouble()

//入力取得(list)
private fun listOfString() = read().split(" ") //スペース区切り
private fun listOfInt() =listOfString().map { it.toInt() }
private fun listOfLong() =listOfString().map { it.toLong() }
private fun listOfDouble() =listOfString().map { it.toDouble() }

//二次元配列y生成
private fun arrayIntInit(n:Int) = Array(n, {Array(n, {it -> 0})}) //0で初期化した, n × nの二次元配列

//PrintWriter(出力用)
val pw = PrintWriter(System.out)

fun main(args: Array<String>) {
    func()
}

fun func(){
    val (a,b,c) = listOfInt() //e.g 1 2 3
    print(a)
    print(b)
    println(c)
    pw.flush()
}

fun println(value : Any) {
    pw.println(value)
}

fun print(value : Any) {
    pw.print(value)
}
