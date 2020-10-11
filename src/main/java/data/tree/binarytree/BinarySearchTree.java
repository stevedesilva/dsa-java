package data.tree.binarytree;

import java.util.Optional;

public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;

    /*
             9
          4     20
       1   6   15 170
    */
    public Node<T> insert(T value) {
        // check empty value
        if (value == null) {
            return null; // optional
        }

        Node<T> node = new Node<>(value);
        if (root == null) {
            root = node;
            return node;
        }

        Node<T> current = root;
        boolean nextLevel = true;

        while (nextLevel) {
            // left
            final int position = node.compareTo(current);

            if (position < 0) {
                // Handle left
                if (current.left == null) {
                    // found space - set leaf
                    current.left = node;
                    nextLevel = false;
                }
                current = current.left;
            } else if (position > 0) {
                // handle right
                if (current.right == null) {
                    // found space - set leaf
                    current.right = node;
                    nextLevel = false;
                }
                current = current.right;
            } else {
                System.out.println("Duplicate element - do nothing");
                nextLevel = false;
            }

        }

        return node;
    }

    public Optional<Node<T>> lookup(T value) {


        Node<T> current = root;
        Node<T> node = new Node<>(value);
        while (true) {
            if (current == null) {
                System.out.printf("Not found: %s", value);
                return Optional.empty();
            }
            final int pos = node.compareTo(current);
            if (pos == 0) {
                // found node
                System.out.printf("Found: %s\n", value);
                break;
            } else if (pos < 0) {
                // left
                current = current.left;
            } else {
                // right
                current = current.right;
            }

        }
        return Optional.ofNullable(node);
    }

    /*
    search for v
        if v is a leaf
          delete leaf v
        else if v has 1 child
          bypass v
        else replace v with successor
     */
    public boolean remove(T value) {
        Node<T> search = new Node<>(value);

        Node<T> parent = null;
        Node<T> current = root;
        while (true) {
            if (current == null) {
                System.out.println("Not found");
                return false;
            }
            final int pos = search.compareTo(current);
            if (pos == 0) {
                // found node
                System.out.printf("Found: %s \n", value);
                break;
            } else if (pos < 0) {
                // left
                parent = current;
                current = current.left;
            } else {
                // right
                parent = current;
                current = current.right;
            }
        }

        if (current.left == null && current.right == null) {
            System.out.printf("Remove leaf ...  %s\n", value);
            if (parent.left != null && value.equals(parent.left.value )) {
                System.out.printf("Remove Left Leaf node: %s\n", value);
                parent.left = null;
                return true;
            } else if (parent.right != null && value.equals(parent.right.value)) {
                System.out.printf("Remove Right Leaf node: %s\n", value);
                parent.right = null;
                return true;
            }
        } else if ((current.left != null && current.right == null) || (current.right != null && current.left == null)) {
            System.out.printf("Bypass node ...  %s\n", value);
            if (current.left != null) {
                System.out.printf("Remove Left Leaf node: %s\n", value);
                if (parent.left != null && value.equals(parent.left.value )) {
                    // choose one that isn't null
                    parent.left = (current.left != null? current.left : current.right);
                    System.out.printf("Bypassed with value: %s\n", parent.left.value);
                    return true;
                } else if (parent.right != null && value.equals(parent.right.value )) {

                    // choose one that isn't null
                    parent.right = (current.left != null? current.left : current.right);
                    System.out.printf("Bypassed with value: %s\n", parent.right.value);
                    return true;
                }
            }
            if (current.right != null) {
                System.out.printf("Remove right Leaf node: %s\n", value);
                if (parent.left != null && value.equals(parent.left.value )) {
                    // choose one that isn't null
                    parent.left = (current.left != null? current.left : current.right);
                    System.out.printf("Bypassed with value: %s\n", parent.left.value);
                    return true;
                } else if (parent.right != null && value.equals(parent.right.value )) {

                    // choose one that isn't null
                    parent.right = (current.left != null? current.left : current.right);
                    System.out.printf("Bypassed with value: %s\n", parent.right.value);
                    return true;
                }

            }
            if (current.left != null) {
                System.out.printf("Remove left Leaf node: %s\n", value);

            }
        } else {
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
            System.out.printf("Successor  left and right node exist: %s\n", value);
            // parent right gets value

            if (parent.left != null && value.equals(parent.left.value )) {

                System.out.printf("sub parent left node for current right %s\n", current.right.value);
                parent.left = current.right;
                parent.left.left = current.left;

                System.out.printf("New parent left value: %s\n", parent.left.value);
                return true;
            } else if (parent.right != null && value.equals(parent.right.value )) {

                System.out.printf("sub parent right node for current right %s\n", current.right.value);
                parent.right = current.right;
                parent.right.left = current.left;

                System.out.printf("New parent left value: %s\n", parent.right.value);
                return true;
            }
        }


            // found parent and matched node
        return false;
    }
}
