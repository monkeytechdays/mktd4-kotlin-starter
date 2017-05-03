package io.monkeypatch.mktd4.ex5

/**
 * Exercise 5: Lazy and Delegate.
 *
 * Read About Lazy Properties <a hreaf="https://kotlinlang.org/docs/reference/delegated-properties.html#lazy"></a>
 * And Add a custom getter to make the 'lazy' val really lazy.
 * It should be initialized by the invocation of 'initializer()' at the moment of the first access.
 */

class LazyProperty(val initializer: () -> Int) {
    /* TODO */

}

class DelegateProperty(val initializer: () -> Int) {

    val lazyValue: Int by /* TODO */
}




