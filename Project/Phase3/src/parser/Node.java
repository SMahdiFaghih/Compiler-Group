package parser;

import java.util.ArrayList;

public class Node {
    public static Node root;
    private String symbolName;
    private String identifierName; //used for IDENTIFIER
    private String nodeValueType; //used for Expr and Constants
    private String constantValue; //used for Constants
    private ArrayList<Node> childNodes;

    Node(String symbolName) {
        this.symbolName = symbolName;
        this.childNodes = new ArrayList<>();
    }

    Node(String symbolName, String identifierName) {
        this.symbolName = symbolName;
        this.identifierName = identifierName;
        this.childNodes = new ArrayList<>();
    }

    Node(String symbolName, String nodeValueType, String constantValue) {
        this.symbolName = symbolName;
        this.nodeValueType = nodeValueType;
        this.constantValue = constantValue;
        this.childNodes = new ArrayList<>();
    }

    public String getSymbolName() {
        return symbolName;
    }

    public String getIdentifierName() {
        return identifierName;
    }

    public String getNodeValueType() {
        return nodeValueType;
    }

    public void setNodeValueType(String nodeValueType) {
        this.nodeValueType = nodeValueType;
    }

    public String getConstantValue() {
        return constantValue;
    }

    public ArrayList<Node> getChildNodes() {
        return childNodes;
    }

    public void addChildNode(Node childNode) {
        this.childNodes.add(0, childNode);
    }

    public void addChildNodes(ArrayList<Node> childNodes) {
        this.childNodes.addAll(childNodes);
    }
}
