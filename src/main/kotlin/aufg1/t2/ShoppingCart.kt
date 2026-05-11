package aufg1.t2

class ShoppingCart {
    private val items = mutableListOf<String>()
    private var hasBook = false

    fun getDiscount() = if (hasBook) 5 else 0

    fun getItems() = items
    fun addItem(item: String) {
        if (item.contains("book")) {
            hasBook = true
        }
        items.add(item)
    }
    fun removeItem(item: String) {
        items.remove(item)
        if (!items.any { it.contains("book") }) {
            hasBook = false
        }
    }
}

class ShoppingCartB {
    private val items = mutableListOf<String>()
    fun getItems() = items
    fun addItem(item: String) = items.add(item)
    fun removeItem(item: String) = items.remove(item)

    fun getDiscount() =
        if (items.any { it.contains("book") }) 0.05 else 0.0
}

class ShoppingCartC(
    val items: List<String> = listOf(),
) {
    fun addItem(item: String) = ShoppingCartC(items + item)
    fun removeItem(item: String) = ShoppingCartC(items - item)

    fun getDiscount() =
        if (items.any { it.contains("book") }) 0.05 else 0.0
}
