package aufg1.t2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

object ShoppingCartTest {
    @Test
    fun testWithoutBooks() {
        val shoppingCart = ShoppingCart()
        assertEquals(0, shoppingCart.getDiscount())

        shoppingCart.addItem("test")
        assertEquals(0, shoppingCart.getDiscount())

        shoppingCart.addItem("test2")
        assertEquals(0, shoppingCart.getDiscount())

        shoppingCart.removeItem("test2")
        assertEquals(0, shoppingCart.getDiscount())
    }

    @Test
    fun testWithBooks() {
        val shoppingCart = ShoppingCart()
        assertEquals(0, shoppingCart.getDiscount())

        shoppingCart.addItem("book")
        assertEquals(5, shoppingCart.getDiscount())

        shoppingCart.addItem("book2")
        assertEquals(5, shoppingCart.getDiscount())

        shoppingCart.removeItem("book")
        assertEquals(5, shoppingCart.getDiscount())

        shoppingCart.removeItem("book2")
        assertEquals(0, shoppingCart.getDiscount())
    }

    @Test
    fun testBWithoutBooks() {
        val shoppingCart = ShoppingCartB()
        assertEquals(0.0, shoppingCart.getDiscount())

        shoppingCart.addItem("test")
        assertEquals(0.0, shoppingCart.getDiscount())

        shoppingCart.addItem("test2")
        assertEquals(0.0, shoppingCart.getDiscount())

        shoppingCart.removeItem("test2")
        assertEquals(0.0, shoppingCart.getDiscount())
    }

    @Test
    fun testBWithBooks() {
        val shoppingCart = ShoppingCartB()
        assertEquals(0.0, shoppingCart.getDiscount())

        shoppingCart.addItem("book")
        assertEquals(0.05, shoppingCart.getDiscount())

        shoppingCart.addItem("book2")
        assertEquals(0.05, shoppingCart.getDiscount())

        shoppingCart.removeItem("book")
        assertEquals(0.05, shoppingCart.getDiscount())

        shoppingCart.removeItem("book2")
        assertEquals(0.0, shoppingCart.getDiscount())
    }

    @Test
    fun testCWithoutBooks() {
        val shoppingCart = ShoppingCartC()
        assertEquals(0.0, shoppingCart.getDiscount())

        val cartWithItem = shoppingCart.addItem("test")
        assertEquals(0.0, cartWithItem.getDiscount())

        val cartWithRemovedItem = shoppingCart.removeItem("test")
        assertEquals(0.0, cartWithRemovedItem.getDiscount())
    }

    @Test
    fun testCWithBooks() {
        val shoppingCart = ShoppingCartC().addItem("book").addItem("test")
        assertEquals(0.05, shoppingCart.getDiscount())

        val cartWithRemovedBook = shoppingCart.removeItem("book")
        assertEquals(0.0, cartWithRemovedBook.getDiscount())
    }
}