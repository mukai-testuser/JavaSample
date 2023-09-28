/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javasample;

/**
 * @author mukai.yh
 */
public class JavaSample  {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   
        //インタフェース 変数 = 引数 -> 処理と戻り値
//        Sample sample = () -> System.out.println("Hello!");
        Sample sample = (String name) -> { 
            return String.format("Hello %s!!",name);
        };

//        sample = new Sample() {
//            @Override
//            public void greeting() {
//                System.out.println("Hello!");
//            }
//        };
        String s = sample.greeting("Tanaka");
        System.out.println(s);
    }
}
