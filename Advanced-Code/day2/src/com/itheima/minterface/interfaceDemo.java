package com.itheima.minterface;

public class interfaceDemo {
    public static void main(String[] args) {

    }
    interface Inter{//接口不能实例化
        public abstract void show();
        public abstract void method();
    }
    class InterImp implements Inter{//实现类，也可看作接口的子类

        @Override
        public void show() {
            System.out.println("sss");
        }

        @Override
        public void method() {
            System.out.println("sadqq");
        }
    }
}
