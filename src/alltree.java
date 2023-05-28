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


        tnode addarr(int[] arr,int x)
        {
            tnode root=null;
            if(x<arr.length)
            {
                root=new tnode(arr[x]);
                root.left=addarr(arr,2*x+1);
                root.right=addarr(arr,2*x+2);


            }
            return root;
        }
        boolean symmetrictree(tnode root)
        {
           return  isSymmertric(root.left,root.right);

        }

            private boolean isSymmertric(tnode left, tnode right) {
            if(left==null||right==null)
            {
                return right==left;
            }
            return left.val==right.val && isSymmertric(left.left,right.right)&& isSymmertric(left.right,right.left);
    }

}
class Mainn
{
    public static void main(String[] args) {
        alltree t=new alltree();
        //tnode x=t.insert();
        //t.inorder(x);
        //t.postorder(x);
        //int[] arr={ 1, 2, 3, 4, 5, 6, 6, 6, 6 };
       //tnode z= t.addarr(arr,0);
       //t.inorder(z);
        int arr[]={1,2,2,3,4,4,3};
        tnode x=t.addarr(arr,0);
        System.out.println(t.symmetrictree(x));


    }
}
