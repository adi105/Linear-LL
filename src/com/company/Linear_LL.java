package com.company;

public class Linear_LL {
    protected LLL_node head;

    //insert function
    public boolean insertAtFront(int to_insert){
        //create the node
        LLL_node new_node = new LLL_node(to_insert);
        if (head == null){
            head = new_node;
        }

        else{
            new_node.set_next(head);
            head = new_node;
        }

        return true;
    }

    //removal
    public boolean remove(int to_remove){
        head = remove(head, to_remove);
        return true;
    }

    private LLL_node remove(LLL_node head, int to_remove){
        if (head != null)
            if (head.get_data() == to_remove)
                head = head.get_next();
        else
            head.set_next(remove(head.get_next(), to_remove));
        return head;
    }

    //remove_all
    public void remove_all(){
        head = null;
    }

    //display
    public void display_list(){
        System.out.println("The LLL contains: ");
        display_list(head);
    }

    private void display_list(LLL_node head){
        if (head == null){
            return;
        }

        System.out.print(head.get_data() + " ");
        display_list(head.next);
    }

    public int count_last(){
        int [] arr = new int[1];
        return count_last(head, arr);
    }

    private int count_last(LLL_node head, int [] last_data) {
        //base case
        if (head.next == null) {
            last_data[0] = head.get_data();
            return 1;
        }

        int largest = count_last(head.next, last_data);

        if (head.get_data() == last_data[0]) {
            return largest + 1;
        } else
            return largest;
    }

    //remove the first and last nodes in the list
    public LLL_node remove_first_last(){
        head = head.get_next();
        remove_first_last(head);
        return head;
    }

    private LLL_node remove_first_last(LLL_node head){
        //base case
        if (head.get_next() == null){
            return null;
        }

        head.set_next(remove_first_last(head.get_next()));
        return head;
    }

    //remove all but the last two in the list
    public void remove_except(){
        if (head.get_next() == null || head.get_next().get_next() == null) {
            return;
        }
        remove_except(head);
    }

    private LLL_node remove_except(LLL_node head) {
        //base case
        if (head.get_next().get_next() == null){
            this.head = head;
            return null;
        }

        head.set_next(remove_except(head.get_next()));
        return head;
    }

    //make a copy of the list
    public Linear_LL copy_list(){
        Linear_LL new_ll = new Linear_LL();
        new_ll.head = copy_list(new_ll.head, head);
        return new_ll;
    }

    private LLL_node copy_list(LLL_node new_head, LLL_node head){
        //base case
        if (head == null)
            return head;

        new_head = new LLL_node(head.get_data());
        new_head.set_next(copy_list(new_head.get_next(), head.get_next()));
        return new_head;
    }

}
