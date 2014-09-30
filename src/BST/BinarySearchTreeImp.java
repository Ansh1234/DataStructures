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

        BinaryTreeNode temp = root;
        while (temp != null) {

            if(element==temp.element) {


                System.out.println("passing value"+temp.element);
                BinaryTreeNode parent = getParent(temp,root);
                System.out.println("parent value is" +parent.element);

                if((temp.left!=null) && (temp.right!=null)){
                    System.out.println("one");
                   BinaryTreeNode max = temp.right;
                        while(max.left!=null) {
                            max =max.left;
                        }
                    temp.element=max.element;
                    parent=getParent(max,root);
                    if(parent.right == max)
                        parent.right=null;
                    else
                        parent.left=null;


                }

               else if((temp.left==null) && (temp.right!=null)) {
                    System.out.println("two");
                    if(parent.right == temp)
                        parent.right = temp.right;
                    else
                        parent.left=temp.right;
                }

                else if( (temp.left!=null) && (temp.right==null)){
                    System.out.println("three");
                    if(parent.left == temp)
                        parent.left = temp.left;
                    else
                        parent.right=temp.left;
                    break;
                }

                else {

                    System.out.println("four");
                    System.out.println(parent.element);
                    System.out.println(temp.element);
                    if(parent.left == temp)
                        parent.left = null;
                    else
                        parent.right = null;
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

    }

    public BinaryTreeNode getNParent(BinaryTreeNode node,BinaryTreeNode temp){


        System.out.println(node.element);
        System.out.println(temp.element);
        while(temp != null) {

            if((temp.left==node) || (temp.right==node)) {
                System.out.println("true");
                return temp;

            }
            else {
                if(node.element > temp.element) {
                    getParent(node,temp.right);
                }
                else {
                    getParent(node,temp.left);
                }
            }

        }
        return root;
    }

    public BinaryTreeNode getLParent(BinaryTreeNode searchNode,BinaryTreeNode currentNode){
        if(currentNode == null || searchNode == root){
            return null;
        }else if((currentNode.left == searchNode) || (currentNode.right == searchNode)) {
            return currentNode;
        }else {
            if(currentNode.element > searchNode.element) {
                return getParent(searchNode, currentNode.left);
            }
            else {
                return getParent(searchNode, currentNode.right);
            }
        }
    }

    class Pair {
        Pair(Boolean found, BinaryTreeNode node){
            this.found = found;
            this.node = node;
        }
        Boolean found;
        BinaryTreeNode node;
    }

    public BinaryTreeNode getParent(BinaryTreeNode searchNode,BinaryTreeNode currentNode){
        return hasNode(searchNode, currentNode).node;
    }

    public Pair hasNode(BinaryTreeNode searchNode,BinaryTreeNode currentNode){
        if(searchNode == currentNode){
            return new Pair(true, null);
        }else{
            Pair pair;
            if(currentNode.element > searchNode.element) {
                pair = hasNode(searchNode, currentNode.left);
            }else {
                pair = hasNode(searchNode, currentNode.right);
            }
            if(pair.found && pair.node == null){
                pair.node = currentNode;
            }
            return pair;
        }
    }



    @Override
    public boolean isEmpty() {
        if(root==null) return true;
        return false;
    }

    @Override
    public void preorder(BinaryTreeNode node) {

        if(node == null) return;

        System.out.println(node.element);
        preorder(node.left);
        preorder(node.right);
    }

    @Override
    public void inorder(BinaryTreeNode node) {

        if(node == null) return;

        inorder(node.left);
        System.out.println(node.element);
        inorder(node.right);
    }

    @Override
    public void postorder(BinaryTreeNode node) {

        if(node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.element);
    }
    public void display() {
       // preorder(root);
        //postorder(root);
        inorder(root);
    }

    public int size(BinaryTreeNode node) {

        if(node==null) return 0;
       // size of a binary search tree is equal to the (size of leftsubtree) + (size of rightsubtree) +1
        return ( size(node.left) + size(node.right) + 1);
    }

    public int sizeOfTree() {
        return size(root);
    }
}
