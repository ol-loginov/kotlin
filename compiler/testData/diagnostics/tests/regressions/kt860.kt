// KT-860 ConcurrentModificationException in frontend

package kotlin.util

import java.util.*

fun <T, U: MutableCollection<in T>> Iterator<T>.to(container: U) : U {
    while(hasNext())
        container.add(next())
    return container
}

inline fun <T> Iterator<T>.toArrayList() = to(ArrayList<T>())
