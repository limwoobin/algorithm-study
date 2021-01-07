package test4.ex3;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    static class Node{
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public String toString(){
            return String.valueOf(this.data);
        }
    }

    // 앞에다 저장
    public void addFirst(Object data){
        Node newNode = new Node(data);

        newNode.next = head;
        head=newNode;

        size++;
        if(head.next == null){
            tail = head;
        }
    }

    // 뒤에다 저장
    public void addLast(Object data){
        Node newNode = new Node(data);

        if(size == 0){
            addFirst(data);
        }
        else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    //중간에 추가하기
    public void add(Object data, int idx){

        if(idx == 0){
            addFirst(data);
        }
        else{
            Node tmp_1 = new Node(idx-1);
            Node tmp_2 = tmp_1.next;
            Node newNode = new Node(data);

            tmp_1.next = newNode;
            newNode.next = tmp_2;
            size++;

            if(newNode.next == null){
                tail = newNode;
            }
        }
    }

    public Object remove(int idx){
        if(idx == 0){
            return removeFirst();
        }
        Node tmp = new Node(idx-1);
        Node willDelete = tmp.next;
        tmp.next = tmp.next.next;

        Object data = willDelete.data;
        if(willDelete == tail){
            tail = tmp;
        }
        willDelete = null;
        size--;

        return data;
    }

    public Object removeFirst(){
        Node tmp = head;
        head = head.next;
        Object data = tmp.data;
        tmp = null;
        size--;
        return data;
    }

    public Object removeLast(){
        Node tmp = tail;
        tail = new Node(size-2);
        tail.next=null;
        Object data = tmp.data;
        tmp = null;
        size--;
        return data;
    }

    public Object getNode(int idx){
        return new Node(idx).data;
    }

    public Object getFirst(){
        return head.data;
    }

    public Object getLast(){
        return tail.data;
    }

    public int getIndex(Object data){
        Node tmp = head;
        int idx = 0;
        while(tmp.data != data){
            tmp = tmp.next;
            idx++;
            if(tmp == null)
                return -1;
        }

        return idx;
    }

    public int getDuplicateIndex(Object data) {
        Node tmp = head;
        int idx = 0;
        while (tmp.data == tail) {
            tmp = tmp.next;
            idx++;
            if (tmp == data) {
                return idx;
            }
        }

        return idx;
    }

    public boolean isEmpyt(){
        if(size == 0)
            return true;
        return false;
    }

    public int getSize(){
        return size;
    }

    public void clear(){
        while(size>0){
            removeFirst();
        }
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    public class ListIterator{
        private Node lastReturned;
        private Node next;
        private int nextIndex;

        ListIterator(){
            this.next = head;
            this.nextIndex = 0;
        }

        public Object next(){

            lastReturned = next;
            next = next.next;
            nextIndex++;

            return lastReturned.data;
        }

        public boolean hasNext(){
            return nextIndex < getSize();
        }

        public void remove() {
            if (nextIndex == 0) {
                throw new IllegalArgumentException();
            }

            LinkedList.this.remove(nextIndex-1);
            nextIndex--;
        }
    }

    public String toString(){
        if(head == null){
            return "[]";
        }
        Node tmp = head;
        String str = "[";
        while(tmp.next != null){
            str += tmp.data + ",";
            tmp = tmp.next;
        }

        str+= tmp.data+"]";
        return str;
    }
}