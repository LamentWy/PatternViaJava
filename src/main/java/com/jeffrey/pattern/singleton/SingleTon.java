
package com.jeffrey.pattern.singleton;
/**
  * 基于内部类的单例模式  Lazy  线程安全
  * 优点：
  * 1、线程安全
  * 2、lazy
  * @author 
  */
 public class SingleTon {
     
     /**
      * 内部类，用于实现lzay机制
    */
     private static class SingletonHolder{
         /** 单例变量  */
         private static SingleTon instance = new SingleTon();
     }
     
     /**
      * 私有化的构造方法，保证外部的类不能通过构造器来实例化。
 */
     private SingleTon() {
         
     }

     
     /**
      * 获取单例对象实例
     * @return 单例对象
     */
    public static SingleTon getInstance() {
         return SingletonHolder.instance;
     }
     
 }