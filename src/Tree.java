import java.util.Scanner;

public class Tree {
    class node
    {
        node left;
        node right;
        int val;
        node(int val)
        {
            this.val=val;
            this.left=this.right=null;
        }
    }
    node insert()
    {
        node root=null;

        Scanner in=new Scanner( System.in);
        int x=in.nextInt();
        root=new node(x);
        if(x==-1)
        {
            return null;
        }

        System.out.println("insert to the left");
        root.left=insert();
        System.out.println("insert to the right");
        root.right=insert();
        return root;
    }
    void display(node root)
    {
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);

    }
}
class Main
{
    public static void main(String[] args) {
        Tree t=new Tree();
        Tree.node root=t.insert();

        t.display(root);
    }
}
