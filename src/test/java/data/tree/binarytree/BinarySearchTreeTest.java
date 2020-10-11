package data.tree.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    /*
              9
           4     20
        1   6   15 170
     */

    @Test
    void emptyTreeHasNullRoot() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        assertNull(bst.root);
    }

    @Test
    void insert_AddOneItemHasRootElement() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);

        assertNotNull(bst.root);
        assertEquals(9, bst.root.value);

    }

    @Test
    void insert_AddDuplicateRootLeft() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);
        bst.insert(9);

        assertNotNull(bst.root);
        assertEquals(9, bst.root.value);
        assertNull(bst.root.left);
        assertNull(bst.root.right);
    }

    @Test
    void insert_AddTwoItemLeft() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);
        bst.insert(4);

        assertNotNull(bst.root);
        assertEquals(9, bst.root.value);
        assertNotNull(bst.root.left);
        assertEquals(4, bst.root.left.value);
    }

    @Test
    void insert_AddDuplicateTwoItemLeft() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);
        bst.insert(4);
        bst.insert(4);

        assertNotNull(bst.root);
        assertEquals(9, bst.root.value);
        assertNotNull(bst.root.left);
        assertEquals(4, bst.root.left.value);
        assertNull(bst.root.left.left);
        assertNull(bst.root.left.right);
    }

    @Test
    void insert_AddThreeItemLeft() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);
        bst.insert(4);
        bst.insert(1);

        assertNotNull(bst.root);
        assertEquals(9, bst.root.value);
        assertNotNull(bst.root.left);
        assertEquals(4, bst.root.left.value);
        assertNotNull(bst.root.left.left);
        assertEquals(1, bst.root.left.left.value);
    }

    @Test
    void insert_AddFourItemLeft() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);
        bst.insert(4);
        bst.insert(1);
        bst.insert(0);

        assertNotNull(bst.root);
        assertEquals(9, bst.root.value);
        assertNotNull(bst.root.left);
        assertEquals(4, bst.root.left.value);
        assertNotNull(bst.root.left.left);
        assertEquals(1, bst.root.left.left.value);
        assertNotNull(bst.root.left.left.left);
        assertEquals(0, bst.root.left.left.left.value);
    }

    @Test
    void insert_AddTwoItemRight() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);
        bst.insert(11);

        assertNotNull(bst.root);
        assertEquals(9, bst.root.value);
        assertNotNull(bst.root.right);
        assertEquals(11, bst.root.right.value);
    }

    @Test
    void insert_AddThreeItemRight() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);
        bst.insert(11);
        bst.insert(12);

        assertNotNull(bst.root);
        assertEquals(9, bst.root.value);
        assertNotNull(bst.root.right);
        assertEquals(11, bst.root.right.value);
        assertNotNull(bst.root.right.right);
        assertEquals(12, bst.root.right.right.value);
    }

    @Test
    void insert_AddFourItemRight() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);
        bst.insert(11);
        bst.insert(12);
        bst.insert(20);

        assertNotNull(bst.root);
        assertEquals(9, bst.root.value);
        assertNotNull(bst.root.right);
        assertEquals(11, bst.root.right.value);
        assertNotNull(bst.root.right.right);
        assertEquals(12, bst.root.right.right.value);

        assertNotNull(bst.root.right.right.right);
        assertEquals(20, bst.root.right.right.right.value);
    }

    /*
             9
          4     20
       1   6   15 170
    */
    @Test
    void insert_AddItemLeftRight() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);

        assertNotNull(bst.root);
        assertEquals(9, bst.root.value);
        assertEquals(4, bst.root.left.value);
        assertEquals(6, bst.root.left.right.value);
        assertEquals(20, bst.root.right.value);
        assertEquals(170, bst.root.right.right.value);
        assertEquals(15, bst.root.right.left.value);
        assertEquals(1, bst.root.left.left.value);

    }

    private BinarySearchTree<Integer> getTree() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);

        return bst;
    }

    /*
             9
          4     20
       1   6   15 170
    */

    @Test
    void lookup_ReturnsRootNode() {
        BinarySearchTree<Integer> bst = getTree();

        final int expected = 9;
        var got = bst.lookup(expected);

        assertTrue(got.isPresent());
        assertEquals(expected, got.get().value);

    }

    @Test
    void lookup_EmptyTreeReturnEmptyResult() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        var got = bst.lookup(9);

        assertFalse(got.isPresent());

    }

    @Test
    void lookup_Level2ReturnsValue() {
        BinarySearchTree<Integer> bst = getTree();

        int expected = 4;
        var got = bst.lookup(expected);

        assertTrue(got.isPresent());
        assertEquals(expected, got.get().value);

        expected = 20;
        got = bst.lookup(expected);

        assertTrue(got.isPresent());
        assertEquals(expected, got.get().value);

    }

    @Test
    void lookup_Level3ReturnsValue() {
        BinarySearchTree<Integer> bst = getTree();

        int expected = 1;
        var got = bst.lookup(expected);

        assertTrue(got.isPresent());
        assertEquals(expected, got.get().value);

        expected = 6;
        got = bst.lookup(expected);

        assertTrue(got.isPresent());
        assertEquals(expected, got.get().value);

        expected = 15;
        got = bst.lookup(expected);

        assertTrue(got.isPresent());
        assertEquals(expected, got.get().value);


        expected = 170;
        got = bst.lookup(expected);

        assertTrue(got.isPresent());
        assertEquals(expected, got.get().value);

    }

    @Test
    void lookup_Level4NoValue() {
        BinarySearchTree<Integer> bst = getTree();

        int expected = 200;
        var got = bst.lookup(expected);

        assertFalse(got.isPresent());


        expected = 5;
        got = bst.lookup(expected);

        assertFalse(got.isPresent());

    }


    @Test
    void remove_Level4NoValue() {
        BinarySearchTree<Integer> bst = getTree();


        var got = bst.remove(200);

        assertFalse(got);

    }

    /*
                    9
                 4     20
              1   6   15 170
           */
    @Test
    void removeLeaf_Level3ReturnsValue() {
        BinarySearchTree<Integer> bst = getTree();

        int valueToRemove = 1;
        var got = bst.remove(valueToRemove);

        assertTrue(got);

        var found = bst.lookup(valueToRemove);

        assertFalse(found.isPresent());


        valueToRemove = 6;
        got = bst.remove(valueToRemove);

        assertTrue(got);

        found = bst.lookup(valueToRemove);

        assertFalse(found.isPresent());

        valueToRemove = 15;
        got = bst.remove(valueToRemove);

        assertTrue(got);

        found = bst.lookup(valueToRemove);

        assertFalse(found.isPresent());

        valueToRemove = 170;
        got = bst.remove(valueToRemove);

        assertTrue(got);

        found = bst.lookup(valueToRemove);

        assertFalse(found.isPresent());


    }

    /*
                   9
                4     20
             1   6   15 170
               3
          */
    @Test
    void remove_Level3ReturnsValueBypass() {
        BinarySearchTree<Integer> bst = getTree();
        bst.insert(3);

        int valueToRemove = 1;
        var got = bst.remove(valueToRemove);

        assertTrue(got);

        var found = bst.lookup(valueToRemove);

        assertFalse(found.isPresent());


        valueToRemove = 6;
        got = bst.remove(valueToRemove);

        assertTrue(got);

        found = bst.lookup(valueToRemove);

        assertFalse(found.isPresent());


    }

    /*
                   9
                4     20
             1   6   15 170

          */
    @Test
    void remove_Level3ReturnsValue7Bypass() {
        BinarySearchTree<Integer> bst = getTree();
        bst.insert(0);


        int valueToRemove = 1;
        var got = bst.remove(valueToRemove);

        assertTrue(got);

        var found = bst.lookup(valueToRemove);

        assertFalse(found.isPresent());


        bst.insert(100);


        valueToRemove = 170;
        got = bst.remove(valueToRemove);

        assertTrue(got);

        found = bst.lookup(valueToRemove);

        assertFalse(found.isPresent());


    }


    /*
                         9
                  4            20
              1       6      15     170
           0     3


                         9
                  4            20
              3       6      15     170
           0
          */
    @Test
    void remove_Level3ReturnsValueLeftSuccessor() {
        BinarySearchTree<Integer> bst = getTree();
        bst.insert(0);
        bst.insert(3);


        var got = bst.remove(1);
        assertTrue(got);

        var found = bst.lookup(1);
        assertFalse(found.isPresent());

        // new parent

        assertNotNull(bst.root.left);
        assertEquals(4, bst.root.left.value);

        assertNotNull(bst.root.left.left);
        assertEquals(3, bst.root.left.left.value);

        assertNotNull(bst.root.left.left.left);
        assertEquals(0, bst.root.left.left.left.value);

        assertNull(bst.root.left.left.right);



    }


    /*
                         9
                  4            20
              1       6      15     170
                    5    7


                         9
                  4            20
              1       7      15     170
                   5
          */
    @Test
    void remove_Level3ReturnsValueRightSuccessor() {
        BinarySearchTree<Integer> bst = getTree();
        bst.insert(5);
        bst.insert(7);



        var got = bst.remove(6);
        assertTrue(got);

        var found = bst.lookup(6);
        assertFalse(found.isPresent());

        // new parent

        assertNotNull(bst.root.left);
        assertEquals(4, bst.root.left.value);

        assertNotNull(bst.root.left.right);
        assertEquals(7, bst.root.left.right.value);

        assertNotNull(bst.root.left.right.left);
        assertEquals(5, bst.root.left.right.left.value);

        assertNull(bst.root.left.right.right);

    }

}