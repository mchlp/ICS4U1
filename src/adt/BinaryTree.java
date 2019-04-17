package adt;

public class BinaryTree implements BinaryTreeADT {

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isLeaf(Node n) {
        return n.leftChild == null && n.rightChild == null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void insert(Node n) {

    }

    @Override
    public void remove(Object data) {

    }

    @Override
    public Node search(Object data) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object[] traversalPreOrder() {
        return new Object[0];
    }

    @Override
    public Object[] traversalInOrder() {
        return new Object[0];
    }

    @Override
    public Object[] traversalPostOrder() {
        return new Object[0];
    }

    @Override
    public Object[] traversalBFS() {
        return new Object[0];
    }
}
