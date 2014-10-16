package BST;

/**
 * Created by anshul on 27/9/14.
 */
public class BinarySearchTreeImp implements BinarySearchTreeI {

    BinaryTreeNode root = null;

    @Override
    public void insert(int element) {

        BinaryTreeNode node = new BinaryTreeNode();
        node.element=element;
        node.left=null;
        node.right=null;
        if(root==null){
            root=node;
        }
        else {

            BinaryTreeNode temp = root;
            while(true){

                if(element>temp.element) {
                    if(temp.right == null) {
                        temp.right= node;
                        break;
                    }
                    else {
                        temp=temp.right;
                    }
                }
                else {

                    if(temp.left == null){
                        temp.left=node;
                        break;
                    }
                    else{
                        temp=temp.left;
                    }
                }
            }
        }
    }

    @Override
    public void remove(int element) {

        if(isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        boolean found = false;

        BinaryTreeNode temp = root;
        while (temp != null) {

            if(element==temp.element) {

                found = true;

                if((temp.left!=null) && (temp.right!=null)) {
                    BinaryTreeNode currNode = nextReplacedElement(temp);
                    BinaryTreeNode parent = returnParent(currNode);

                    if(currNode.element > parent.element) {
                        parent.right = currNode.right;
                    }
                    else {
                        parent.left =currNode.left;
                    }
                    temp.element = currNode.element;
                }

               else if((temp.left==null) && (temp.right!=null)) {
                    if(temp != root) {
                        BinaryTreeNode parent = returnParent(temp);
                        if (parent.right == temp)
                            parent.right = temp.right;
                        else
                            parent.left = temp.right;
                    }
                    else {
                        root=root.right;
                    }
                }

                else if( (temp.left!=null) && (temp.right==null)){

                    if(temp != root) {
                        BinaryTreeNode parent = returnParent(temp);
                        if (parent.left == temp)
                            parent.left = temp.left;
                        else
                            parent.right = temp.left;
                        break;
                    }
                    else {
                        root=root.left;
                    }
                }

                else {

                    if(temp != root) {
                        BinaryTreeNode parent = returnParent(temp);
                        if (parent.left == temp)
                            parent.left = null;
                        else
                            parent.right = null;
                    }
                    else {
                        root = null;
                    }

                }

                break;
            }

            else if(element>temp.element){
                temp=temp.right;
            }

            else {
                temp=temp.left;
            }

        }

        if(found==false) {
            System.out.println("No Such Element to delete");
        }

    }


    public BinaryTreeNode returnParent(BinaryTreeNode node) {

        BinaryTreeNode tempNode = root;
        while(true) {
            if((tempNode.left ==node) || (tempNode.right == node)) {
                return tempNode;
            }
            else if(node.element < tempNode.element) {
                tempNode = tempNode.left;
            }
            else {
                tempNode = tempNode.right;
            }

        }
    }

    @Override
    public boolean isEmpty() {
        if(root==null) return true;
        return false;
    }

    @Override
    public void preOrder(BinaryTreeNode node) {

        if(node == null) return;

        System.out.println(node.element);
        preOrder(node.left);
        preOrder(node.right);
    }

    @Override
    public void inOrder(BinaryTreeNode node) {

        if(node == null) return;

        inOrder(node.left);
        System.out.println(node.element);
        inOrder(node.right);
    }

    @Override
    public void postOrder(BinaryTreeNode node) {

        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.element);
    }

    @Override
    public BinaryTreeNode getRoot() {
        return root;
    }


    public int size(BinaryTreeNode node) {

        if(node==null) return 0;
        return ( size(node.left) + size(node.right) + 1);
    }

    public int sizeOfTree() {
        return size(root);
    }

    public Integer getSmallest() {

        return  getSmallestElement(root).element;
    }

    public Integer getLargest() {

        return getLargestElement(root).element;

    }

    private BinaryTreeNode getLargestElement(BinaryTreeNode root) {

        if(root.right == null) {
            return root;
        }
        else {
            return getLargestElement(root.right);
        }

    }

    private BinaryTreeNode getSmallestElement(BinaryTreeNode root) {

        if(root.left != null) {
            return  getSmallestElement(root.left);
        }
        else {
            return root;
        }
    }

    public BinaryTreeNode returnRoot() {
        return root;
    }

    public void nextReplaced() {
        System.out.println(nextReplacedElement(root.right.right).element);
    }

    public BinaryTreeNode nextReplacedElement(BinaryTreeNode node) {

        if(node.left==null && node.right==null) {
            return null;
        }
        else if(node.left != null) {

            return  getLargestElement(node.left);
        }
        else {
            return getSmallestElement(node.right);
        }
    }


}
