import java.util.*;
class treerev {

    private node root;
    class node{
        int val;
        node left;
        node right;

        node(int val)
        {
            this.val=val;
        }

    }
    
    public void populate(Scanner scanner)
    {
        System.out.println("Enter the root Node: ");
        int val=scanner.nextInt();
        root=new node(val);
        populate(scanner,root);
    }
    private void populate(Scanner scanner, node n)
    {
        System.out.println("Insert into left?");
        boolean left=scanner.nextBoolean();
        if(left)
        {
            int x=scanner.nextInt();
            n.left=new node(x);
            populate(scanner,n.left);
        }

    
        System.out.println("Do you want to enter right of " + n.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + n.val);
            int value = scanner.nextInt();
            n.right = new node(value);
            populate(scanner, n.right);
        }

    }
    public void display()
    {
        display(this.root);
    }
    public void display(node root)
    {
        if(root==null)
        {
            return;
        }

        display(root.left);
        System.out.println(root.val);
        display(root.right);

    }
    
}
public class main{
    public static void main(String[] args) {
        treerev t=new treerev();
        Scanner sc=new Scanner(System.in);
        t.populate(sc);
        t.display();
    }
}
