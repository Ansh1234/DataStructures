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

                if((temp.left!=null) && (temp.right!=null)){
                    if(root.right != null){
                        temp=root.right;
                        while(temp.left!=null){
                            temp=temp.left;
                        }

                    }
                    else if(root.left !=null){

                        temp=root.left;
                        while(temp != null) {
                            temp=temp.right;
                        }
                    }
                    else{
                        root=null;
                    }
                }
               else if((temp.left==null) && (temp.right!=null)) {
                    temp=null;
                    break;
                }
                else if( (temp.left!=null) && (temp.right==null)){


                }
                else{

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

    @Override
    public boolean isEmpty() {
        if(root==null) return true;
        return false;
    }
}
