package com.yry.test;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMapTest
 *
 * @author: yry
 * @date: 2020/4/1
 */
public class HashMapTest {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        for (Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }

}
