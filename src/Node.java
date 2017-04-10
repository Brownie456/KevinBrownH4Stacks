public class Node{

        private String data;
        private Node next, prev;

        /*  Constructor with parameters*/
        public Node(String data,Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        /* Get next node method*/
        public Node getNext() {
            return next;
        }


    /* Set next node method*/
        public void setNext(Node next)
        {
            this.next = next;
        }

        /*method to return the node in String */
        public String getData() {
            return data;
        }

        /*Method to set the data of node */
        public void setData(String data) {
            this.data = data;
        }
        public Node getPrev(){
        return prev;
         }

    /*Method to set previous node */
        public void setPrev(Node prev){
        this.prev = prev;
        }

        /*To string method to return the data of node */
        public String toString() {
            return " Name : "+this.data;
        }
    }
