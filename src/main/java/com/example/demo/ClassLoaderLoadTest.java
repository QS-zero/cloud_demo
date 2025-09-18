package com.example.demo;

public class ClassLoaderLoadTest {
    public static void main(String[] args) throws Exception {
        // 核心类，Bootstrap 加载器负责加载
        System.out.println("String 类加载器: " + String.class.getClassLoader());

        // 扩展类，Extension 加载器负责加载
        Class<?> cipherCls = Class.forName("javax.crypto.Cipher");
        System.out.println("javax.crypto.Cipher 类加载器: " + cipherCls.getClassLoader());

        // 应用类，Application 加载器负责加载
        System.out.println("当前类加载器: " + ClassLoaderLoadTest.class.getClassLoader());
    }
}
