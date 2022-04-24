fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    val inLove = ((flowerA % 2 == 0 && flowerB % 2 > 0) 
                  || (flowerA % 2 > 0 && flowerB % 2 == 0))
    return inLove
}
