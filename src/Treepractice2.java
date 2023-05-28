import java.util.Scanner;

public class Treepractice2 {
    class nodas {
        nodas right, left;
        int val;

        nodas(int val) {
            this.val = val;
            right = left = null;
        }
    }

    nodas addnode() {
        nodas root = null;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == -1) {
            return null;
        }
        if (root == null) {
            root = new nodas(x);
        }
        System.out.println("insert to the left");
        root.left = addnode();
        System.out.println("insert to the right");
        root.right = addnode();
        return root;
    }

    void inorder(nodas root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + "  ");
        inorder(root.right);
    }

    nodas addarr(int[] arr, int x) {
        nodas root = null;
        if (x < arr.length) {
            root = new nodas(arr[x]);
            root.left = addarr(arr, 2 * x + 1);
            root.right = addarr(arr, 2 * x + 2);
        }
        return root;
    }
}


class maani
{
    public static void main(String args[])
    {
        Treepractice2 x=new Treepractice2();
        //Treepractice2.nodas root=x.addnode();
        //x.inorder(root);
        int arr[]={1,2,2,3,4,4,3};
        Treepractice2.nodas root=x.addarr(arr,0);
        x.inorder(root);

    }
}
