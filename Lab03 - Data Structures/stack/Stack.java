public class Stack {
    List s = new List();

    public void push(NodeList node) {
        s.push_back(node);
    }

    public int size(){
        return size();
    }

    public void pop(){
        s.pop_back();
    }

    public List top(){
        s.find_data(size());
        return s;
    }
    public void print(){
        s.print();
    }

}