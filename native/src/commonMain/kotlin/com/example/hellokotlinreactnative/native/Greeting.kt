package com.example.hellokotlinreactnative.native


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
