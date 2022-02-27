package com.java.gurpreet.cache;

public class DriverClass {

    public static void main(String... args){
        CustomCache customCache = new CustomCache();
        customCache.put(1, 1); // The map is now [[1,1]]
        customCache.put(2, 2); // The map is now [[1,1], [2,2]]
        customCache.get(1);    // return 1, The map is now [[1,1], [2,2]]
        customCache.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        customCache.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        customCache.get(2);    // return 1, The map is now [[1,1], [2,1]]
        customCache.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        customCache.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
    }
}
