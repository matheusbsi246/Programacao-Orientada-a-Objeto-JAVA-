public class NodeList {
    private int i;
    private NodeList next = new NodeList();

    public NodeList next(NodeList atual) {
        return atual.next;
    }

    public int getValue(NodeList atual) {
        return i;
    }

    public void setValue(NodeList atual, int i) {
        atual.i = i;
    }
}