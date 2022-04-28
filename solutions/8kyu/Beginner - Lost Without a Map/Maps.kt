fun maps(x: IntArray): IntArray {
    for (index in 0..x.size - 1) {
        x[index] = x[index] * 2
    }
    
    return x
}
