package com.java.gurpreet.cache;

import java.util.ArrayList;
import java.util.List;

public class CustomCache {
    int key_space;
    List<Bucket> buckets;
    /** Initialize your data structure here. */
    public CustomCache() {
        this.key_space = 2069;
        this.buckets = new ArrayList<>();
        for(int i=0; i < this.key_space; i++){
            this.buckets.add(new Bucket());
        }
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hash_key = key % this.key_space;
        this.buckets.get(hash_key).update(key,value);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hash_key = key % this.key_space;
        return this.buckets.get(hash_key).get(key);
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hash_key = key % this.key_space;
        this.buckets.get(hash_key).remove(key);
    }
}
