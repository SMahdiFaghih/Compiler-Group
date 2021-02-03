package parser;

import java.util.ArrayList;

public class Scope {
    public MyClass classNode;
    public Node scopeNode;

    public ArrayList<Node> variables = new ArrayList<>();

    public Scope(MyClass classNode) {
        this.classNode = classNode;
    }

    public Scope(Node scopeNode) {
        this.scopeNode = scopeNode;
    }
}
