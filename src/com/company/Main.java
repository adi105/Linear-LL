package com.company;

public class Main {

    public static void main(String[] args) {
        Linear_LL LLL = new Linear_LL();
        LLL.insertAtFront(5);
        LLL.insertAtFront(7);
        LLL.insertAtFront(9);
        LLL.insertAtFront(5);
        LLL.insertAtFront(5);
        LLL.display_list();
        Linear_LL list2 = LLL.copy_list();
        System.out.print("\n");
        list2.display_list();
    }
}
