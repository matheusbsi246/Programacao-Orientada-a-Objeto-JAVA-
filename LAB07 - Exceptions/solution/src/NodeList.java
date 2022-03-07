public class NodeList {
    private int i;
    private NodeList next;
    private NodeList prev;

     public NodeList() {
        this.next = null;
        this.prev = null;
    }

      public NodeList(int j) {
        this.next = null;
        this.prev = null;
        this.i = j;
    }



    public void setNode(NodeList node) {
        if (node == null) {
            throw new NullPointerException();
        }
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
}

