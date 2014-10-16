package BST;

/**
 * Created by anshul on 27/9/14.
 */
public interface BinarySearchTreeI{

    public void insert(int element);
    public void remove(int element);
    public boolean isEmpty();
    public void preOrder(BinaryTreeNode root);
    public void inOrder(BinaryTreeNode root);
    public void postOrder(BinaryTreeNode root);
    public BinaryTreeNode getRoot();
}
