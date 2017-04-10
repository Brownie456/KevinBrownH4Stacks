/**
 * Created by Brownie on 4/2/2017.
 */
public class Stack {

    public static Node head;
    private int size;

    public Stack(){
        head = null;
        size = 0;
    }
//method to push nodes onto a stack
    public static void push(Stack st,String input){
        Node newNode = new Node(input, null,null);
        if (st.head == null){
            st.head = newNode;
            st.size++;
        }
        else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
            st.size++;
        }
    }

    //method to remove the top node from a stack
    public static void pop(Stack st) {

        if (st.head == null) {
            System.out.println("The stack is empty");
        }
        if (st.size == 1) {
            st.head = null;
        } else {
            st.head = st.head.getNext();
            }
            st.size--;
        }

        //returns the size of a stack
    public int getSize(){
        return size;
    }

    //view the top node of a stack
    public static String peek(Stack st){
        String temp = st.head.getData();
                return temp;

        }

    }








