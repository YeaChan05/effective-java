package org.yeachan.chapter2.item6.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * package :  org.yeachan.chapter2.item6.map
 * fileName : UsingKeySet
 * author :  ShinYeaChan
 * date : 2023-08-16
 */
public class UsingKeySet {
    public static void main(String[] args) {
        Map<String,Integer> menu=new HashMap<>();
        menu.put("Burger",8);
        menu.put("Pizza",9);
    
        Set<String> names1=menu.keySet();
        Set<String> names2=menu.keySet();
        names1.remove("Burger");
        System.out.println(names2.size());// 1
        System.out.println(menu.size());// 1
        //아니 이게 되네;;
    }
}
