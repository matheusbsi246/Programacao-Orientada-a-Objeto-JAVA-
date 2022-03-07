public class Main {
    public static void main(String args[]) {
        List teste = new List();

        NodeList node  = new NodeList();
        NodeList node2 = new NodeList();
        NodeList node3 = new NodeList();

        int j = 0;

        node.createNode(10);
        node2.createNode(20);
        node3.createNode(30);

        teste.createList();
        teste.push_front(node);
        teste.insert_pos(node3, 2);
        teste.push_back(node2);
        teste.print();
        // System.out.println("node : " + node);
        System.out.println("node  int : " + j);
    }
}
