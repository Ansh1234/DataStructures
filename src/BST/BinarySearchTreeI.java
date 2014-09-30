package BST;

/**
 * Created by anshul on 27/9/14.
 */
public interface BinarySearchTreeI{

    public void insert(int element);
    public void remove(int element);
    public boolean isEmpty();
    public void preorder(BinaryTreeNode root);
    public void inorder(BinaryTreeNode root);
    public void postorder(BinaryTreeNode root);
}
