package ejercicio03;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import estructuras.Node;
import estructuras.BST;
import estructuras.ExceptionIsEmpty;

public class BSTViewer<T extends Comparable<T>> extends BST<T>{
    private Graph graph;

    public BSTViewer() {
        super();
        graph = new SingleGraph("BST");
        System.setProperty("org.graphstream.ui", "swing");
        graph.setAttribute("ui.stylesheet", 
            "node { fill-color:rgb(239, 92, 92); text-size: 16px; size: 25px; }" +
            "edge { fill-color: rgb(35, 35, 35); }"
        );
    }

    public void graphTree () throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("Está vacío.");
            
        graphTree(getRoot(), graph, null, 0, 0, 2);
        graph.display(false);
    }

    private void graphTree (Node<T> actual, Graph graph, String fatherId,
                            double positionX, double positionY, double space) {
        
        if (actual != null) {

            String actualId = actual.getData().toString();
            org.graphstream.graph.Node node = graph.addNode(actualId);
            
            node.setAttribute("ui.label", actualId);
            node.setAttribute("xy", positionX, positionY);

            if (fatherId != null)
                graph.addEdge(fatherId + "-" + actualId, fatherId, actualId);

            graphTree(actual.getLeft(), graph, actualId, positionX - space, positionY - 1, space/2);
            graphTree(actual.getRight(), graph, actualId, positionX + space, positionY - 1, space/2);
        }
    }
}

