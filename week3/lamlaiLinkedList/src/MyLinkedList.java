public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }
    public MyLinkedList(Object data){
        this.head = new Node(data);
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next=temp;
        numNodes++;
    }
    public void addLast(Object data){
        Node temp = head;
        for (int i = 0; i < numNodes-1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }
    public Object get(int index){
        if(index<0||index>=numNodes) throw new IndexOutOfBoundsException("index: "+index+" size: "+numNodes);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp.getData();
    }
    public void add(int index, Object data){
        if(index<0||index>numNodes) throw new IndexOutOfBoundsException("index: "+index+" size: "+numNodes);
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
        holder=temp.next;
        temp.next = new Node(data);
        temp.next.next=holder;
        numNodes++;
    }
    public Object remote(int index){
        if(index<0||index>numNodes-1) throw new IndexOutOfBoundsException("index: "+index+" size: "+numNodes);
        else {
            Node temp = head;
            Object data;
            if(index==0){
                head=head.next;
                data = head.getData();
            }
            else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                data = temp.next.getData();
                temp.next=temp.next.next;
            }
            numNodes--;
            return data;
        }
    }
    public Object remote(Object O){
        Node temp = head;
        for (int i = 0; i < numNodes-1; i++) {
            if (temp.getData()==O&&i==0){
                numNodes--;
                return head.data;


            }
            else if(temp.getData()==O){
                temp.next=temp.next.next;
                numNodes--;
                return O;
            }
            temp=temp.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        String show = "";
        Node temp = head;
        for (int i = 0; i < numNodes ; i++) {
            show+= temp.data+", ";
            temp=temp.next;
        }
        return show;
    }

    class Node{
        private Node next;
        private Object data;

        public Node() {
        }
        public Node(Object data) {
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }

}






