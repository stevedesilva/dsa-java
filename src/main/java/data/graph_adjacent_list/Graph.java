package data.graph_adjacent_list;

import java.util.*;

public class Graph<T> {
    /*
        Adjacency List
        0:	1	2
        1:	0	2	3
        2:	0	1	4
        3:	1	4
        4:	2	3	5
        5:	4	6
        6:	5
     */
    private int numberOfNodes;
    private Map<Node<T>, Set<T>> adjacentList;

    public Graph() {
        this.adjacentList = new HashMap<>();
        this.numberOfNodes = 0;
    }

    public boolean addVertex(T value) {
        Node<T> node = new Node<T>(value);

        if (!adjacentList.containsKey(node)) {
            // create new slot
            numberOfNodes++;
            adjacentList.put(node, new HashSet<>());
            System.out.printf("added node %s. \n",value);
            return true;
        }


        System.out.printf("Node %s  already exists. \n",value);
        return false;
    }

    public void addEdge(T value1, T value2) {
        Node<T> node1 = new Node<T>(value1);
        if (adjacentList.containsKey(node1)) {
            Set<T> set = adjacentList.get(node1);
            set.add(value2);
            System.out.printf("Add edge for Node %s. \n",node1);
        }

        Node<T> node2 = new Node<T>(value2);
        if (adjacentList.containsKey(node2)) {
            Set<T> set = adjacentList.get(node2);
            set.add(value1);
            System.out.printf("Add edge for Node %s. \n",node2);

        }

    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public Map<Node<T>, Set<T>> getAdjacentList() {
        return adjacentList;
    }
}
