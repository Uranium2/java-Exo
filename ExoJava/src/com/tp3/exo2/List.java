package com.tp3.exo2;

public class List {
    private class Item {
        private int val;
        private Item next;

        public Item(int val) {
            this.val = val;
        }
    }
    private Item start;

    public void add(int val) {
        while (start.next != null) {
            start = start.next;
        }
        start.next = new Item(val);
    }

    public void print() {
        Item iter = start;
        while (iter != null) {
            System.out.println(iter.val);
            start = iter.next;
        }
    }
}
