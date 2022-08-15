package org.example.collections_implementation.linked_list_implementation;


public class MyLinkedList {
    private static int counter;
    private Node head;
    private class Node {
        // reference to the next node in the chain, or null if there isn't one.
        Node next;

        // data carried by this node. could be of any type you need.
        Object data;

        // Node constructor
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        // another Node constructor if we want to specify the node to point to.
        @SuppressWarnings("unused")
        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }

        // these methods should be self-explanatory
        public Object getData() {
            return data;
        }

        @SuppressWarnings("unused")
        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }

    }

    // appends the specified element to the end of this list.
    public void add(Object data) {

        // Initialize Node only incase of 1st element
        if (head == null) {
            head = new Node(data);
        }

        Node tempNode = new Node(data);
        Node currentNode = head;

        // Let's check for NPE before iterate over crunchifyCurrent
        if (currentNode != null) {

            // starting at the head node, crawl to the end of the list and then add element after last node
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }

            // the last node's "next" reference set to our new node
            currentNode.setNext(tempNode);
        }

        // increment the number of elements variable
        incrementCounter();
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    // inserts the specified element at the specified position in this list
    public void add(Object data, int index) {
        Node nodeTemp = new Node(data);
        Node currentNode = head;

        // Let's check for NPE before iterate over crunchifyCurrent
        if (currentNode != null) {
            // crawl to the requested index or the last element in the list, whichever comes first
            for (int i = 0; i < index && currentNode.getNext() != null; i++) {
                currentNode = currentNode.getNext();
            }
        }

        // set the new node's next-node reference to this node's next-node reference
        nodeTemp.setNext(currentNode.getNext());

        // now set this node's next-node reference to the new node
        currentNode.setNext(nodeTemp);

        // increment the number of elements variable
        incrementCounter();
    }

    // returns the element at the specified position in this list.
    public Object get(int index) {
        // index must be 1 or higher
        if (index < 0)
            return null;
        Node currentNode = null;
        if (head != null) {
            currentNode = head.getNext();
            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null){
                    return null;
                }

                currentNode = currentNode.getNext();
            }
            return currentNode.getData();
        }
        return currentNode;
    }

    // removes the element at the specified position in this list.
    public boolean remove(int index) {

        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;

        Node crunchifyCurrent = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (crunchifyCurrent.getNext() == null)
                    return false;

                crunchifyCurrent = crunchifyCurrent.getNext();
            }
            crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());

            // decrement the number of elements variable
            decrementCounter();
            return true;

        }
        return false;
    }

    // returns the number of elements in this list.
    public int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";

        if (head != null) {
            Node crunchifyCurrent = head.getNext();
            while (crunchifyCurrent != null) {
                output += "[" + crunchifyCurrent.getData().toString() + "]";
                crunchifyCurrent = crunchifyCurrent.getNext();
            }

        }
        return output;
    }
}
