package org.morfly.gradle.lib1


class MainViewModel1 {

    val text: String
        get() = """
            Build system: Gradle.
            Language: Kotlin.
            Features: androidx, data-binding, binding-adapters 
        """.trimIndent()

    val magicNumber: Int get() = 46
}