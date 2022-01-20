public class NodeList {
    private int i;
    private NodeList next = new NodeList();
    private NodeList prev = new NodeList();

    public void createNode(int j) {
        next = null;
        prev = null;
        i = j;
    }

    public void setNode(NodeList node) {
       next = node.next;
       prev = prev.next;
       i = node.i;
    }
 
    public NodeList getNext() {
        return next;
    }

    public void setNext(NodeList node) {
        node = next;
    }

    public NodeList getPrev() {
        return prev;
    }

    public void setPrev(NodeList node) {
        node = prev;
    }

    public int getValue() {
        return i;
    }

    public void setValue(int j) {
        i = j;
    }
}