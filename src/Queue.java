/**
 * Created by Brownie on 4/2/2017.
 */
public class Queue {
    private Node front, back;
    private int size;

    //Default constructor
    public Queue(){
        front = null;
        back = null;
        size = 0;
    }

    //Method to add node to the queue
    public static void enqueue(Queue qu,String input){
        Node newNode = new Node(input, null,null);


        if (qu.size == 0) {
            qu.front = newNode;
            qu.back = newNode;
            qu.size++;
        }
            else{
                qu.back.setNext(newNode);
                qu.back = newNode;
                qu.size++;

            }
        }

        //Method to remove the node from the queue
        public static Node dequeue(Queue qu){
        Node temp = null;
            if (qu.size == 0) {
                System.out.println("The stack is empty");
            }
            if (qu.size == 1) {
                temp = qu.front;
                qu.front = null;
                qu.back = null;
            } else {
                temp = qu.front;
                qu.front = qu.front.getNext();
            }
            qu.size--;
            return temp;

        }



    //Method to view the the node in front of queue
    public static Node peek(Queue qu){

            return qu.front;
        }


    //Method to return size of the node
    public int getSize(){
        return size;
    }





}
