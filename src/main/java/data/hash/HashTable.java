package data.hash;

import java.util.ArrayList;

public class HashTable {
    // [{list},
    //  {list},
    //  {list}
    // ]
    ArrayList<KeyValue>[] data;
    int currentLength;


    public HashTable(int size) {
        this.data = new ArrayList[size];
        this.currentLength = 0;
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.codePointAt(i) * i) % data.length;
        }
        return hash;
    }


    public void set(String key, int value) {
        int address = hash(key);
        if (data[address] == null) {
            ArrayList<KeyValue> arrayAtAddress = new ArrayList<>();
            data[address] = arrayAtAddress;
            currentLength++;
        }
        KeyValue pair = new KeyValue(key, value);
        data[address].add(pair);
    }


    public Integer get(String key) {
        int address = hash(key);
        ArrayList<KeyValue> bucket = data[address];
        if (bucket != null) {
            if (bucket.size() == 1) {
                return bucket.get(0).getValue();
            }
            // else more than one item in bucket
            for (KeyValue keyValue : bucket) {
                if (keyValue.getKey().equals(key)) {
                    return keyValue.getValue();
                }
            }
        }
        return null;// return null when key does not exist.
    }


    public String[] keys() {
        ArrayList<KeyValue>[] bucket = data;
        String[] keyArray = new String[currentLength];
        int count = 0;
        for (ArrayList<KeyValue> keyValues : bucket) {
            if (keyValues != null) {
                keyArray[count] = keyValues.get(0).getKey();
                count++;
            }
        }
        return keyArray;

    }

}
