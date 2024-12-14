package com.s12works.tellAStory

public fun <E: Any?, T: Any?> getDynamicallyCreatedCollection(
    elements: Collection<E>,
    translator: (E) -> T
): Collection<T> {
    val translatedElements = mutableListOf<T>()

    elements.forEach {
        translatedElements.add(translator(it))
    }

    // defined via translatedElements
    return object: Collection<T> {
        override val size: Int = translatedElements.size

        override operator fun contains(element: T): Boolean = element in translatedElements

        override fun containsAll(elements: Collection<T>): Boolean = translatedElements.containsAll(elements)

        override fun isEmpty(): Boolean = translatedElements.isEmpty()

        override operator fun iterator(): Iterator<T> = translatedElements.iterator()
    }
}
