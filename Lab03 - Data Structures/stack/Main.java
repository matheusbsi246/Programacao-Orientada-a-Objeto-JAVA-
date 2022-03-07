public class Main {
    public static void Main(String args[]) {
        List teste = new List();

        NodeList node = new NodeList();
        NodeList node2 = new NodeList();
        NodeList node3 = new NodeList();

        node.createNode(10);
        node2.createNode(20);
        node3.createNode(30);

        teste.createList();
        teste.push_front(node);
        teste.push_back(node2);
    }
}
