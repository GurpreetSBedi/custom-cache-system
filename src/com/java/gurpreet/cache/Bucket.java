package com.java.gurpreet.cache;

import java.util.LinkedList;
import java.util.List;

public class Bucket {
    private List<EntrySet<Integer,Integer>> bucket;

    public Bucket(){
        bucket = new LinkedList<>();
    }

    public Integer get(Integer key) {
        for (EntrySet<Integer, Integer> pair : this.bucket) {
            if (pair.getKey().equals(key))
                return pair.getVal();
        }
        return -1;
    }

    public void update(Integer key, Integer value) {
        boolean found = false;
        for (EntrySet<Integer, Integer> pair : this.bucket) {
            if (pair.getKey().equals(key)) {
                pair.val = value;
                found = true;
            }
        }
        if (!found)
            this.bucket.add(new EntrySet<Integer, Integer>(key, value));
    }

    public void remove(Integer key) {
        for (EntrySet<Integer, Integer> pair : this.bucket) {
            if (pair.getKey().equals(key)) {
                this.bucket.remove(pair);
                break;
            }
        }
    }
}
