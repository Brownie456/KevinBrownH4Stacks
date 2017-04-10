/**
 * Created by Brownie on 4/2/2017.
 */
public class Main {

    //transfer from a stack to a queue
    public static void tFromStackToQueue(Stack st,Queue qu){


    }
    //Transfer from a queue to a stack
    public static void tFromQueueToStack(Stack st,Queue qu){

    }
    //Move contents of stack to another stack
    public static void copyStack(Stack st, Stack copy){
        Stack temp = new Stack();
       int num = st.getSize();
        if(st.head == null){
            System.out.println("It's empty");
            return;
        }
        else{
            for(int i=0;i<num;i++){
                Stack.push(temp,Stack.peek(st));
                Stack.pop(st);
                System.out.print(Stack.peek(st));
                System.out.print(temp.head);
            }
            for(int i=0;i<num;i++){
                Stack.push(copy,Stack.peek(temp));
                Stack.pop(temp);
            }
        }


    }

    public static void main (String[] args){





        Stack test = new Stack();
        Stack.push(test,"kev");
        Stack.push(test,"doug");
        Stack.push(test,"doge");
        Stack.push(test,"grape");


        Stack cory = new Stack();
       System.out.println(test.head);



System.out.println("Cheetos");




        Queue doug = new Queue();
        Queue.enqueue(doug, "Kevin");

        System.out.println(doug.getSize());
        Queue.peek(doug);
        Queue.enqueue(doug,"Andrew");
        System.out.println(doug.getSize());
        Queue.peek(doug);
        Queue.enqueue(doug, "Arnold");

        Queue.enqueue(doug, "Tulip");
        Queue.enqueue(doug, "Beer");

        Queue.dequeue(doug);
        System.out.println(doug.getSize());

        Queue.peek(doug);
        System.out.println(doug.getSize());









    }
}
