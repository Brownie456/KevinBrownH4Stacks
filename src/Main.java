/**
 * Created by Brownie on 4/2/2017.
 */
public class Main {

    //transfer from a stack to a queue
    public static void tFromStackToQueue(Stack st,Queue qu) {
        int num = st.getSize();
        for (int i = 0; i < num; i++) {
            Queue.enqueue(qu, Stack.pop(st).getData());
        }
    }

    //Transfer from a queue to an empty stack
    public static void tFromQueueToStack(Stack st,Queue qu){
        Stack temp = new Stack();
        int num = qu.getSize();
        //puts the queue into a temp stack
        for(int i=0;i<num;i++){
            Stack.push(temp,Queue.peek(qu).getData());
            Queue.dequeue(qu);
        }
        //puts the temp stack into the empty stack
        for(int i=0;i<num;i++){
            Stack.push(st,Stack.peek(temp).getData());
            Stack.pop(temp);
        }
    }

    //Move contents of stack to another stack
    public static void copyStack(Stack st, Stack copy){
        Stack temp = new Stack();
       int num = st.getSize();
        if(st.head == null){
            System.out.println("It's empty");
            return;
        }
            for(int i=0;i<num;i++){
                Stack.push(temp,Stack.peek(st).getData());
                Stack.pop(st);
            }
            for(int i=0;i<num;i++){
                Stack.push(copy,Stack.peek(temp).getData());
                Stack.pop(temp);
            }
        }

    public static void main (String[] args){

        //Test stack to show off program
        Stack test = new Stack();
        Stack.push(test,"kevin");
        Stack.push(test,"doug");
        Stack.push(test,"mary");
        Stack.push(test,"grape");
        System.out.println("Test the stack:"+Stack.peek(test).getData());

        //Testing the copy stack method
        System.out.println("Testing Stack to stack transfer");
        Stack sTest = new Stack();
        copyStack(test,sTest);
        System.out.println("Test the stack:"+Stack.peek(sTest).getData());

        //Demonstrate Stack class methods work
        System.out.println("");
        System.out.println("I'll pop 2 elements off the list to show it works");
        Stack.pop(sTest);
        System.out.println("Test the stack:"+Stack.peek(sTest).getData());
        Stack.pop(sTest);
        System.out.println("Test the stack:"+Stack.peek(sTest).getData());
        System.out.println("");
        System.out.println("Now i will add 2 more and test the stack;");
        Stack.push(sTest,"Apple");
        System.out.println("Test the stack:"+Stack.peek(sTest).getData());
        Stack.push(sTest,"Cherries");
        System.out.println("Test the stack:"+Stack.peek(sTest).getData());
        System.out.println("");
        System.out.println("");

        //Testing the Stack to queue Method
        System.out.println("Testing Stack to queue method");
        Queue qTest = new Queue();
        tFromStackToQueue(sTest,qTest);
        System.out.println("Test the Queue:"+Queue.peek(qTest).getData());
        System.out.println("I'll dequeue once and test:");
        Queue.dequeue(qTest);
        System.out.println("Test the Queue:"+Queue.peek(qTest).getData());
        System.out.println("");
        System.out.println("");

        //Testing the Queue to stack method
        System.out.println("Testing Queue to stack method");
        Stack emptyStack = new Stack();
        tFromQueueToStack(emptyStack,qTest);
        System.out.println("Test the Stack:"+Stack.peek(emptyStack).getData());
        System.out.println("I'll pop the stack and peek");
        Stack.pop(emptyStack);
        System.out.println("Test the Stack:"+Stack.peek(emptyStack).getData());
        Stack.pop(emptyStack);
        System.out.println("Test the Stack:"+Stack.peek(emptyStack).getData());
        System.out.println("The stack is now empty, as Kevin was my first input");
    }
}
