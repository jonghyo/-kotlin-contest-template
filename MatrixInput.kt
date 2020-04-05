fun main(args: Array<String>) {
    val testcase = Integer.parseInt(readLine())
    repeat(t) { index ->
        //input number
        val n = Integer.parseInt(readLine())
        
        //n × n Matrix
        val array = Array(n, {arrayOfNulls<Int>(n)})
        
        var result = ""
        repeat(n){
            val m = readLine()!!.split(" ").map(String::toInt)
            array[it] = toArray<Int?>(m)
        }

        println("Case #${index+1}: ${result}")
    }
}

inline fun <reified T> toArray(list: List<*>): Array<T> {
    return (list as List<T>).toTypedArray()
}
