public class NodeList {
    private int i;
    private NodeList next;
    private NodeList prev;

    public void createNode(int j) {
        this.next = null;
        this.prev = null;
        this.i = j;
    }

    public void createNode() {
        this.next = null;
        this.prev = null;
    }

    public void setNode(NodeList node) {
        this.next = node.next;
        this.prev = node.prev;
        this.i = node.i;
    }

    public NodeList getNext() {
        return this.next;
    }

    public void setNext(NodeList node) {
        this.next = node;
    }

    public NodeList getPrev() {
        return this.prev;
    }

    public void setPrev(NodeList node) {
        this.prev = node;
    }

    public int getValue() {
        return this.i;
    }

    public void setValue(int j) {
        this.i = j;
    }

    // public static void main(String[] args) {
    // NodeList node = new NodeList();
    // NodeList node2 = new NodeList();
    // NodeList node3 = new NodeList();

    // node.createNode(10);
    // node.next = node2;
    // node2.createNode(20);
    // node3 = node.getNext();
    // node3.setValue(15);

    // int j = node3.getValue();
    // System.out.println(" j " + j);
    // j = node2.getValue();
    // System.out.println(" j2 " + j);

    // }

}