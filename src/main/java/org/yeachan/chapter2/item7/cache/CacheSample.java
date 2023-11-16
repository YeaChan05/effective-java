package org.yeachan.chapter2.item7.cache;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * package :  org.yeachan.chapter2.item7.cache
 * fileName : CacheSample
 * author :  ShinYeaChan
 * date : 2023-09-08
 */
public class CacheSample {
    public static void main(String[] args) {
        Object key1=new Object();
        Object value1=new Object();
        
//        Map<Object, Object> cache=new HashMap<>();
        Map<Object, Object> cache=new WeakHashMap<>();
        cache.put(key1,value1);//key1이 더이상 쓸모 없어지더라도 key1이 들어있던 래퍼런스를 가비지 컬랙션이 비워준다
    }
}