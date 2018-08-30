package com.kotlindemo.chapters

class PojoDemo {
    var a: Int = 0

    constructor(a: Int) {// parameterised constructor
        this.a = a
    }

    constructor() {} // empty constructor


    var someProperty: String = "defaultValue"

    var someProperty1: String = "defaultValue"
        get() = field  // underline says its redunt you can even remove it no need
        set(value) {
            field = value
        }

}
