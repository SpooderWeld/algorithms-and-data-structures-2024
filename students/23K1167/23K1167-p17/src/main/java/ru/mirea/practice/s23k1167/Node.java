package ru.mirea.practice.s23k1167;

class Node {
    String data;  // Данные (строка)
    Node prev;    // Ссылка на предыдущий узел
    Node next;    // Ссылка на следующий узел

    public Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}