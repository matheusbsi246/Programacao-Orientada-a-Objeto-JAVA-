public class List {
    private NodeList begin = new NodeList();
    private NodeList end = new NodeList();
    private int size;

    public void createList(NodeList node) {
        if (node == null) {
            size = 0;
            begin = null;
            end = null;
            end = null;
        } else {
            begin = node;
            end = node;
        }

    }

    public void push_front(NodeList node) {
        NodeList aux = new NodeList();
        aux.setNode(begin);
        aux.setPrev(node);
        begin.setNode(node);
        node.setNext(aux);
        node.setPrev(null);
        size++;
    }

    public void push_back(NodeList node) {
        NodeList aux = new NodeList();
        aux.setNode(end);
        aux.setNext(node);
        end.setNode(node);
        node.setPrev(aux);
        node.setNext(null);
        size++;
    }

    public void insert_pos(NodeList node, int pos) {
        int i = 0;
        NodeList atual = new NodeList();
        atual.setNode(begin);

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
        for (int i = 0; i < size; i++) {
            System.out.println("" + atual.getValue());
            atual.setNext(atual);
        }

    }

}
