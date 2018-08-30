package com.kotlindemo.chapters

class C : A, B {
    override fun bar() { // it is compulsory in Class A , also it is compulsory to override as there is ambiguity in A and B
        TODO("not implemented")
    }

    override fun foo() { // it was non compulsory, but then became compulsory as there is ambiguity in A and B
        TODO("not implemented")
    }
}


/*
*
*
 interface A {
    fun foo() { print("A") }// non compulsory
    fun bar()// compulsory
}

interface B {
    fun foo() { print("B") } // non compulsory
    fun bar() { print("bar") } // non compulsory
}


*
* */