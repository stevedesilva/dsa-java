package data.graph_adjacent_list;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {


    @Test
    void Graph_emptyGraph() {
        Graph<Integer> graph = new Graph<>();
        assertEquals(0,graph.getNumberOfNodes());
    }

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
    @Test
    void addVertex_oneNode() {
        Graph<Integer> graph = new Graph();

        graph.addVertex(1);
        assertEquals(1,graph.getNumberOfNodes());
    }

    @Test
    void addVertex_SameNode() {
        Graph<Integer> graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(1);
        assertEquals(1,graph.getNumberOfNodes());
    }

    @Test
    void addVertex_TwoNode() {
        Graph<Integer> graph = new Graph();

        graph.addVertex(0);
        graph.addVertex(1);
        assertEquals(2,graph.getNumberOfNodes());
    }

    @Test
    void addVertex_AllNode() {
        Graph<Integer> graph = getIntegerGraph();
        assertEquals(7,graph.getNumberOfNodes());
    }

    @Test
    void addEdge_OneEdge() {
        Graph<Integer> graph = getIntegerGraph();

        graph.addEdge(6,5);
        var list = graph.getAdjacentList();
        var edges1 = list.get(new Node(6));
        assertEquals(1,edges1.size());

        var edges2 = list.get(new Node(6));
        assertEquals(1,edges2.size());
    }

    @Test
    void addEdge_OneEdgeTwiceIdempotent() {
        Graph<Integer> graph = getIntegerGraph();

        graph.addEdge(6,5);
        graph.addEdge(5,6);
        graph.addEdge(6,5);
        var list = graph.getAdjacentList();
        var edges1 = list.get(new Node(6));
        assertEquals(1,edges1.size());

        var edges2 = list.get(new Node(6));
        assertEquals(1,edges2.size());


    }


    @Test
    void addEdge_All() {
        Graph<Integer> graph = getIntegerGraph();

        graph.addEdge(3,1);
        graph.addEdge(3,4);
        graph.addEdge(4,2);
        graph.addEdge(4,5);
        graph.addEdge(1,2);
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(6,5);

        var list = graph.getAdjacentList();
        var edges = list.get(new Node(0));
        assertEquals(2,edges.size());

        list = graph.getAdjacentList();
        edges = list.get(new Node(1));
        assertEquals(3,edges.size());

        list = graph.getAdjacentList();
        edges = list.get(new Node(2));
        assertEquals(3,edges.size());

        list = graph.getAdjacentList();
        edges = list.get(new Node(3));
        assertEquals(2,edges.size());

        list = graph.getAdjacentList();
        edges = list.get(new Node(4));
        assertEquals(3,edges.size());

        list = graph.getAdjacentList();
        edges = list.get(new Node(5));
        assertEquals(2,edges.size());

        list = graph.getAdjacentList();
        edges = list.get(new Node(6));
        assertEquals(1,edges.size());
    }

    private Graph<Integer> getIntegerGraph() {
        Graph<Integer> graph = new Graph<>();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        return graph;
    }
}