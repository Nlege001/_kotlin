package com.example.mysingleton


class component private constructor(builder: Builder){
    var param1: String? = null

    class Builder{
        private var param1: String? = null

        //setter
        fun setparam1(param1: String) = apply { this.param1= param1 }

        //getter
        fun getParam1() = param1
    }

    init{
        param1 = builder.getParam1()
    }
}


