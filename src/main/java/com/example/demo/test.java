package com.example.demo;

public class test {


    public static void main(String[] args) throws Exception {
        // 自定义类 test
        System.out.println("test 类的加载器: " + test.class.getClassLoader());

        // Java 核心类 String
        System.out.println("String 类的加载器: " + String.class.getClassLoader());

        // 常用扩展类，比如 javax.crypto.Cipher
        try {
            Class<?> cipherClass = Class.forName("javax.crypto.Cipher");
            System.out.println("javax.crypto.Cipher 类的加载器: " + cipherClass.getClassLoader());
        } catch (ClassNotFoundException e) {
            System.out.println("javax.crypto.Cipher 类不存在");
        }

        // 自定义加载器示例（简单打印）
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                System.out.println("自定义加载器尝试加载类: " + name);
                return super.loadClass(name);
            }
        };

        // 用自定义加载器加载 test 类
        Class<?> cls = myLoader.loadClass("test");
        System.out.println("自定义加载器加载 test 类的加载器: " + cls.getClassLoader());
    }
}
