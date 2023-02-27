class Node{
    private Student data;
    private Node next;

    // Constructor for the Node
    public Node(Student st){
        data = st;
        next = null;
    }

    public Student getData(){return data;}
    public void setData(Student newSt){data = newSt;}

    public Node getNext(){return next;}
    public void setNext(Node newNext){next = newNext;}
}

// Now for the dynamic student
public class DynamicStudent {
    private Node head;
    private static int last = 0;

    public DynamicStudent(){head = null;}

    // test whether the list is empty
    public boolean isEmpty(){return head == null;}

    // returns the number of elements in the list
    public int count(){return last;}

    // insert an element in a give position
    public void insert(Student st, int position){
        if(position > last)
            System.out.printf("Cannot insert beyond " +last);
        else{
            // create a new node with the student
            Node nodeToInsert = new Node(st);

            // insert at the head if position == 0
            if (position == 0){
                nodeToInsert.setNext(head);
                head = nodeToInsert;
            }
            else{
                Node current = head;
                int currentPosition = 0;

                // go to the position before the node to insert
                while(currentPosition < position-1){
                    current = current.getNext();
                    currentPosition++;
                }

                // now that we are before the position we re-assign the pointers
                nodeToInsert.setNext(current.getNext());
                current.setNext(nodeToInsert);
            }

            // now increment last
            last++;
        }
    }

    // overload insert to always insert at the end of the list
    public void insert(Student st){ insert( st, last);}

    // Now delete
    public void delete(Student st){
        Node current = head;
        Node previous = head;

        while( !(current.getData().getName() == st.getName() &&
                current.getData().getForm() == st.getForm() ) &&
                current.getNext() != null)
        {
            previous = current;
            current = current.getNext();
        }

        // check if item was found
        if(current.getData().getName().equals(st.getName()) &&
        current.getData().getForm().equals(st.getForm()))
            previous.setNext(current.getNext());
        else
            System.out.println(st + " is not in the list ");
    }

    public String toString(){
        String result = "";

        Node start = head;
        while (start != null){
            result += start.getData() + " --> ";
            start = start.getNext();
        }
        result += "null";
        return result;
    }
}
