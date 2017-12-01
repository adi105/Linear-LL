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
    }
}
