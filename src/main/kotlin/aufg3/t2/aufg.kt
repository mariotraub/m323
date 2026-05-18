package aufg3.t2

import aufg2.t1.prompt
import kotlin.random.Random

// 1.1
fun <T> addToCart(cart: List<T>, item: T) = cart + item

// 1.3
fun firstCharacter(str: String) = str.firstOrNull()

// 1.4
fun multiplyWithRandomNumber(number: Int, seed: Int) = Random(seed).nextInt() * number

// 1.5
fun divideNumbers(dividend: Int, divisor: Int) = runCatching { dividend / divisor }.getOrNull()

// 1.6
// Not really possible...
fun returnStr(str: String) = str