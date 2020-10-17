package org.morfly.gradle.app


class MainViewModel {

    val text: String
        get() = """
            Build system: Gradle.
            Language: Kotlin.
            Features: androidx, data-binding, binding-adapters 
        """.trimIndent()

    val magicNumber: Int get() = 46
}