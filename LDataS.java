//append   // insert item in end  of linked list
//prepend // insert item in front of linked list
class LDataS {
 Node head;
  public  class Node {
            String data;
            String next;

              Node (String data){
                this.data  = data;
                this.next = null;
              }

          }

  public void add (String data){
    Node newNode = new Node(data);
     if(head == null){
       head = newNode;
       return;
     }
     newNode.next = head;
     head = newNode;
  }

  public void last (String data){
    Node newNode = new Node(data);
     if(head == null){
       head = newNode;
       return;
     }

     Node currNode  = head;
     // 1->2->3->4->null
     while (currNode.next != null){
         currNode = currNode.next;
     }
      currNode.next = newNode;

}

public void printList(){
    if(head == null){
      System.out.println("list is empty");
      return;
    }

    Node currNode  = head;
    // 1->2->3->4->null
    while (currNode != null){
         System.out.println(currNode.data+ " -> ");
        currNode = currNode.next;
    }
    System.out.println("NULL");
}
   public static void main (String args[]){
         LDataS s = new LDataS();
         s.add("1");
         s.add("2");
         s.add("3");
         s.add("4");
         s.add("s");
         s.printList();

         // System.out.println(s.head);
   }

}
