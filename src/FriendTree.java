import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;

class node
{
    node left;
    node right;
    int val;
    node(int val)
    {
        this.val=val;
        left=right=null;
    }
}

public class FriendTree {
    Scanner in=new Scanner(System.in);

    node addnodes()
    {
        node root=null;
        int x=in.nextInt();
        if(x==-1)
        {
            return null;
        }
        node temp=new node(x);
        if(root==null)
        {
            root=temp;
        }
        System.out.println("insert to left");
        root.left=addnodes();
        System.out.println("insert to right");
        root.right=addnodes();
        return root;
    }
    void inorder(node x)
    {
        if(x==null)
        {
            return;
        }
        inorder(x.left);
        System.out.println(x.val);
        inorder(x.right);
    }

    void iteratriveInorder(node x)
    {
        Stack<node> stk=new Stack<>();

    }
}
class mani
{
    public static void main(String[] args) {
        FriendTree t=new FriendTree();
       node root= t.addnodes();
       t.inorder(root);
    }
}
