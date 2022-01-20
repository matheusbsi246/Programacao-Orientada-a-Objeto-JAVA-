public class Queu {
    List q = new List();

    public void push(NodeList node) {
        q.push_front(node);
    }

    public int size(){
        return size();
    }

    public void pop(){
        q.pop_front();
    }

    public List front(){
        q.find_data(1);
        return q;
    }
    public void print(){
        q.print();
    }

}