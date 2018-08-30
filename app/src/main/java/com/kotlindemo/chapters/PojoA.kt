package com.kotlindemo.chapters

class PojoA {
    public var varA: String = ""
        set(value) {
            field = value
        }
        get() = field
}