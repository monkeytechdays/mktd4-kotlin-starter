package io.monkeypatch.mktd4.ex5

/**
 * Exercise 5: Lazy and Delegate.
 */

/**
 * Use a custom getter to make the 'lazy' really lazy.
 * It should be initialized by the invocation of 'initializer()' only at the moment of the first access.
 */
class LazyProperty(val initializer: () -> Int) {
    private var value: Int? = null
    val lazyValue: Int
        get() {
            // this custom getter should initialize the lazy property once 
        }
}
/**
 * Read About Lazy Properties <a href="https://kotlinlang.org/docs/reference/delegated-properties.html#lazy">Lazy</a>
 * use the lazy construction
 * It should be initialized by the invocation of 'initializer()' only at the moment of the first access.
 */
class DelegateProperty(initializer: () -> Int) {

    val lazyValue: Int by /* TODO */
}




