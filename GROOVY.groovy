def countElements(List<Integer> list) {
    def countMap = [:]

    list.each { element ->
        countMap[element] = (countMap[element] ?: 0) + 1
    }

    return countMap
}

def list = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(list)

println(result)
