package com.kotlindemo.chapters

class ChildForInterface : InterfaceDemo {
     override val var1: String// compulsory to implement
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun doCall() {// compulsory to implement
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun doCallBody() {// not compulsory to implement
        super.doCallBody()
    }
}