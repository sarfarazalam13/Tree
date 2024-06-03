import java.util.Scanner;

class tree{
  class node{
    int val;
    node left;
    node right;
    node(int val)
    {
      this.val=val;
    }
  }
  private node root;

  public void pop(Scanner scanner)
  {
    System.out.print("Enter the value of the root");
    int x=scanner.nextInt();
    root = new node(x);
    pop(scanner,root);
  }  
  private void pop(Scanner scanner,node node)
  {
    System.out.println("Do you want to enter left of " + node.val);
    boolean x=scanner.nextBoolean();
    if(x)
    {
      int y=scanner.nextInt();
      node.left=new node(y);
      pop(scanner,node.left);
    
    }

    System.out.println("Do u want to insrt to tthe roght of "+node.val);
    boolean y=scanner.nextBoolean();
    if(y)
    {
      int z=scanner.nextInt();
      node right=new node(z);
      pop(scanner,node.right);
    }
  }

  public void display()
  {
    display(this.root);
  }
  private void display(node root)
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
public class tree2{
  public static void main(String args[])
  {
    tree x=new tree();
    x.pop(new Scanner(System.in));
    x.display();
  }
}