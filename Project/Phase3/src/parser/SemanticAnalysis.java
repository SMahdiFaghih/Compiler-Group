package parser;

import java.util.ArrayList;

public class SemanticAnalysis {
    private static SemanticAnalysis instance;

    private MyClass rootClass = new MyClass(Node.root);
    private ArrayList<MyClass> classes = new ArrayList<>();

    private ArrayList<Scope> scopes = new ArrayList<>();

    private SemanticAnalysis()
    {
        //Singleton
    }

    public static SemanticAnalysis getInstance()
    {
        if (instance == null)
        {
            instance = new SemanticAnalysis();
        }
        return instance;
    }

    public void startSemanticAnalysis() throws SemanticError
    {
        generateClassesData();
        generateScopes();
    }

    private void generateScopes()
    {
        scopes.add(new Scope(rootClass));
        ArrayList<Node> queue = new ArrayList<>();
        queue.add(Node.root);
        while (queue.size() != 0)
        {
            Node currentNode = queue.remove(0);
            switch (currentNode.getSymbolName())
            {
                case "FunctionDecl":
                    addFunctionScope(currentNode);
                    break;
                case "ClassDecl":
                    addClassScope(currentNode);
                    break;
                default:
                    queue.addAll(currentNode.getChildNodes());
                    break;
            }
        }
    }

    private Scope addFunctionParametersScope(Node functionDeclNode)
    {
        Scope scope = new Scope(functionDeclNode);
        scopes.add(scope);

        //todo

        return scope;
    }

    private void addFunctionScope(Node functionDeclNode)
    {
        Scope parametersScope = addFunctionParametersScope(functionDeclNode);

        Scope scope = new Scope(functionDeclNode);
        scopes.add(scope);

        //todo

        scopes.remove(scope);
        scopes.remove(parametersScope);
    }

    private void addClassScope(Node classDeclNode)
    {
        Scope scope = new Scope(MyClass.getMyClass(classes, classDeclNode));
        scopes.add(scope);

        ArrayList<Node> queue = new ArrayList<>();
        queue.add(classDeclNode);
        while (queue.size() != 0)
        {
            Node currentNode = queue.remove(0);
            if ("FunctionDecl".equals(currentNode.getSymbolName()))
            {
                addFunctionScope(currentNode);
            }
            else
            {
                queue.addAll(currentNode.getChildNodes());
            }
        }

        scopes.remove(scope);
    }

    private void generateClassesData()
    {
        ArrayList<Node> queue = new ArrayList<>();
        queue.add(Node.root);
        while (queue.size() != 0)
        {
            Node currentNode = queue.remove(0);
            switch (currentNode.getSymbolName())
            {
                case "VariableDecl":
                    rootClass.publicVariables.add(currentNode);
                    break;
                case "FunctionDecl":
                    rootClass.publicFunctions.add(currentNode);
                    break;
                case "ClassDecl":
                    MyClass myClass = new MyClass(currentNode);
                    classes.add(myClass);
                    break;
                case "InterfaceDecl":
                    //Ignored!
                    break;
                default:
                    queue.addAll(currentNode.getChildNodes());
                    break;
            }
        }
        for (MyClass myclass : classes)
        {
            Node fieldNode = myclass.classNode.getChildNodes().get(5); //Field
            if (fieldNode.getChildNodes().size() != 0)
            {
                addFields(myclass, fieldNode);
            }
        }
    }

    private void addFields(MyClass currentClass, Node fieldNode)
    {
        Node currentNode = fieldNode.getChildNodes().get(1);
        switch (currentNode.getSymbolName()) //VariableDecl or FunctionDecl
        {
            case "VariableDecl":
                if (fieldNode.getChildNodes().get(0).getChildNodes().size() == 0)
                {
                    currentClass.publicVariables.add(currentNode);
                }
                switch (fieldNode.getChildNodes().get(0).getChildNodes().get(0).getSymbolName()) //AccessMode
                {
                    case "PRIVATE":
                        currentClass.privateVariables.add(currentNode);
                        break;
                    case "PUBLIC":
                        currentClass.publicVariables.add(currentNode);
                        break;
                    case "PROTECTED":
                        currentClass.protectedVariables.add(currentNode);
                        break;
                }
                break;
            case "FunctionDecl":
                if (fieldNode.getChildNodes().get(0).getChildNodes().size() == 0)
                {
                    currentClass.publicFunctions.add(currentNode);
                }
                switch (fieldNode.getChildNodes().get(0).getChildNodes().get(0).getSymbolName()) //AccessMode
                {
                    case "PRIVATE":
                        currentClass.privateFunctions.add(currentNode);
                        break;
                    case "PUBLIC":
                        currentClass.publicFunctions.add(currentNode);
                        break;
                    case "PROTECTED":
                        currentClass.protectedFunctions.add(currentNode);
                        break;
                }
                break;
        }
        if (fieldNode.getChildNodes().get(2).getChildNodes().size() != 0)
        {
            addFields(currentClass, fieldNode.getChildNodes().get(2));
        }
    }
}
