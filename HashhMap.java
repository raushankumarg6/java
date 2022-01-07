package com.company;
import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

    public static class HashMap<K, V> {

    private class HmNode {
        K key;
        V value;

        HmNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
        private int size; // n
        private LinkedList<HmNode>[] buckets; // N = buckets.length

        public HashMap() {
            initbuckets(4);
            size = 0;
        }

        private void initbuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }

        public void put(K key, V value) throws Exception // working fine
        {
            int bi = hashfn(key); // bucket index
            int di = getIndexWithinBucket(key, bi); // data index
            if (di != -1) {
                HmNode node = buckets[bi].get(di);
                node.value = value;
            } else {
                //insert
                HmNode node = new HmNode(key, value);
                buckets[bi].add(node);
                size++;
            }
            double lambda = size * 1.0 / buckets.length;
            if (lambda > 2.0) {
                rehash();
            }
        }

        private void rehash() throws Exception
        {
            LinkedList<HmNode>[] oba = buckets; // old bucket array
            initbuckets(oba.length * 2);
            size = 0;

            for (int i = 0; i < oba.length; i++) {
                for (HmNode node : oba[i]) {
                    put(node.key, node.value);
                }
            }
        }

        public boolean containsKey(K key) //  working
        {
            int bi = hashfn(key); // bucket index
            int di = getIndexWithinBucket(key, bi); // data index
            if (di != -1)
            {
                return true;
            } else
            {
                return false;
            }
        }

        public V get(K key) throws Exception //  working
        {
            int bi = hashfn(key); // bucket index
            int di = getIndexWithinBucket(key, bi); // data index
            if (di != -1) {
                HmNode node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key) throws Exception  // not working
        {
            int bi = hashfn(key); // bucket index
            int di = getIndexWithinBucket(key, bi); // data index

            if (di != -1) {
                HmNode node = buckets[bi].remove(di);
                size--;
                return node.value;
            } else {
                return null;
            }
        }

        public int size() //working fine
        {
            return size;
        }

        private int hashfn(K key) {
            //hashcode
            int hc = key.hashCode(); // returns the hashcode corresponding to the key. hashCode() is method of java which applicable on any type of data
            return Math.abs(hc) % buckets.length; // absolute hash code bcz hc can be anything
        }

        private int getIndexWithinBucket(K key, int bi) {
            int di = 0;
            for (HmNode node : buckets[bi]) {
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        public ArrayList<K> keyset() throws Exception // Working fine
        {
            ArrayList<K> keys = new ArrayList<>(); // for returning keys
            for (int i = 0; i < buckets.length; i++) // for the array
            {
                for (HmNode node : buckets[i]) // for the linked list at each index of array
                {
                    keys.add(node.key);
                }
            }
            return keys;
        }



        public static void main(String[] args) {
            // System.out.println("HashMap !");
            HashMap <String , Integer > mp = new HashMap<>();

//            System.out.println("Size: " + mp.size());
            try {
                mp.put("a" , 21);
                mp.put("b" , 1);
                mp.put("c" , 11);
                mp.put("d" , 121);
                mp.put("e" , 2111);

//                mp.remove("e"); // working
//                System.out.println(mp.keyset()); // working


//                System.out.println(mp.containsKey("e")); // working

//                System.out.println(mp.get("e")); // working

            } catch (Exception e) {
                System.out.println("Unable to perform !");
                e.printStackTrace();
            }

        }
    }
}
