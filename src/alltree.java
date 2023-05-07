import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class tnode //tree node
{
    int val;
    tnode left;
    tnode right;

    tnode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
public class alltree {



        tnode insert()
        {
            tnode root=null;
            int x;
            Scanner in=new Scanner(System.in);
            x=in.nextInt();
            if(x==-1)
            {
                return null;
            }
            tnode temp=new tnode(x);
            if(root==null) {
                root = temp;
            }
            System.out.println("insert to left");
            root.left=insert();
            System.out.println("insert to right");
            root.right=insert();
            return root;
        }
        void preorder(tnode root)
        {
           if(root==null)
           {
               return;
           }
           System.out.println(root.val);
           preorder(root.left);
           preorder(root.right);
        }
        void postorder(tnode node)
        {
            if(node==null)
            {
                return;
            }
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.val+" ");
        }
        void inorder(tnode node)
        {
            if(node==null)
            {
                return;
            }
            inorder(node.left);
            System.out.println(node.val+ " ");
            inorder(node.right);
        }
    }
class Mainn
{
    public static void main(String[] args) {
        alltree t=new alltree();
        tnode x=t.insert();
        t.inorder(x);
        t.postorder(x);

    }
}
