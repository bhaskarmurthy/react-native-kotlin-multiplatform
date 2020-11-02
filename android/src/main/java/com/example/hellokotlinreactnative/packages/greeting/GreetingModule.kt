package com.example.hellokotlinreactnative.packages.greeting

import com.example.hellokotlinreactnative.native.Greeting
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = "GreetingModule")
class GreetingModule(context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {

    override fun getName(): String {
        return "GreetingModule"
    }

    @ReactMethod
    fun greeting(callback: Callback) {
        callback(Greeting().greeting())
    }

}