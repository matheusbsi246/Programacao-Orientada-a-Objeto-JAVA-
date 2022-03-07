public class List {
    private NodeList begin = new NodeList();
    private NodeList end = new NodeList();
    private int size;

   public List() {

        end = new NodeList();
        begin = new NodeList();
        this.size = 0;

    }

    public List (NodeList node) {
        if(node.getNext() == null){
            throw new NullPointerException("Insita um nó valido");
        }
        this.end = node;
        this.begin = node;
        size = 1;

    }

    public void push_front(NodeList node) {
        if (size == 0) {
            this.begin = node;
            this.end = node;
            size++;
        } else {
            node.setNext(begin);
            begin.setPrev(node);
            this.begin = node;
            size++;
        }
    }

    public void push_back(NodeList node) {
        if (size == 0) {
            this.begin = node;
            this.end = node;
            size++;
        } else {
            this.end.setNext(node);
            node.setPrev(this.end);
            this.end = node;
            size++;
        }

    }

    public void insert_pos(NodeList node, int pos) {
        int i = 0;
        NodeList atual = new NodeList();
        atual = this.begin;

        while (i <= pos || i <= size) {
            atual.setNext(atual);
            i++;
        }
        if (i > size) {
            push_back(node);
        } else if (i == 1) {
            push_front(node);
        } else {
            (atual.getNext()).setPrev(node);
            node.setNext(atual.getNext());
            atual.setNext(node);
            node.setPrev(atual);
            size++;
        }
    }

    public void insert_sorted(NodeList node) {
        int i = node.getValue();
        NodeList atual = new NodeList();
        atual.setNode(begin);
        while (atual.getValue() > i) {
            atual.setNext(atual);
        }
        insert_pos(node, i);
    }

    public int size() {
        return size;
    }

    public void pop_front() {
        ((begin.getNext()).getNext()).setPrev(begin);
        (begin.getNext()).setPrev(null);
        begin.setNode(begin.getNext());
        size--;
    }

    public void pop_back() {
        ((end.getPrev()).getPrev()).setNext(end);
        (end.getPrev()).setNext(null);
        end.setNode(end.getPrev());
        size--;
    }

    public void erase_data(NodeList node) {
        NodeList atual = new NodeList();
        atual.setNode(begin);
        while (atual != node) {
            atual.setNext(atual);
        }
        (atual.getPrev()).setNext(atual.getNext());
        (atual.getNext()).setPrev(atual.getPrev());
        size--;
    }

    public void erase_pos(int pos) {
        int i = 1;
        NodeList atual = new NodeList();
        atual.setNode(begin);
        while (i < pos) {
            atual.setNext(atual);
        }
        atual.getPrev().setNext(atual.getNext());
        atual.getNext().setPrev(atual.getPrev());
        size--;
    }

    public int find_pos(NodeList node) {
        NodeList atual = new NodeList();
        int i = 0;
        while (atual != node && i <= size) {
            i++;
        }
        if (i > size) {
            return -1;
        }
        return i;

    }

    public NodeList find_data(int i) {
        NodeList atual = new NodeList();
        atual.setNode(begin);
        while (atual.getValue() != i && atual != null) {
            atual.setNext(atual);
        }
        return atual;
    }

    public NodeList front() {
        return begin;
    }

    public NodeList back() {
        return end;
    }

    public int get_pos(NodeList node) {
        int i = 0;
        NodeList atual = new NodeList();
        atual.setNode(begin);
        while (atual != node && i <= size) {
            atual.setNext(atual);
            i++;
        }
        if (i > size) {
            return -1;
        } else {
            return i;
        }
    }

    public void print() {
        NodeList atual = new NodeList();
        atual.setNode(begin);
        System.out.println("" + atual.getValue());
        for (int i = 1; i < size; i++) {
            atual.setNode(atual.getNext());
            System.out.println("" + atual.getValue());
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        NodeList node = new NodeList();
        NodeList node2 = new NodeList(20);
        NodeList node3 = new NodeList(30);
        NodeList node4 = new NodeList(40);
        NodeList node5 = new NodeList(50);

        try {
            List list1 = new List(node);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }


        System.out.println(" list Print: ");

    }
}
