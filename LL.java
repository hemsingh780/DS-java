


class LL {
  Node head;
  Node tail;
  int length;
  class Node {
    String data;
    Node  next;
    Node(String data){
      this.data = data;
      this.next = null;
    }
}

  LL(){
    length  = 0;
  }

  void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
          head = newNode;
          tail  = head;
          length++;
          return;
        }
      //  01->2-->
      newNode.next = head; //
      head  = newNode;
      length++;
  }
  void addLast(String data){
      Node newNode = new Node(data);
      Node currentNode = head;
      while(currentNode.next != null){
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
      tail  = currentNode.next;
      length++;
  }
void printList(){
   Node currentNode = head;
   while(currentNode != null){
       System.out.print(currentNode.data +"->");
       currentNode = currentNode.next;
   }
   System.out.println();
}
// d->g->h->k->a
void length() {
  System.out.println("length  : "+length);
}

void reverse(){
  if(head == null){
      System.out.println("list is null");
   }else{
          Node current = head;
          Node previous = null;   // c
          Node next = null;      //  c.next

          while(current != null){
              next = current.next;
              current.next = previous;
              previous = current;
              current = next;
          }

         Node currentNode = previous;
         while(currentNode != null){
           System.out.print(currentNode.data + "-->");
           currentNode = currentNode.next;
         }

         System.out.println();
   }
}


// CREATE VIEW MarksView AS
// SELECT Student_Detail.NAME, Student_Detail.ADDRESS, Student_Marks.MARKS
// FROM Student_Detail, Student_Mark
// WHERE Student_Detail.NAME = Student_Marks.NAME;

void addMid(String item){
       int midL = length/2;
       Node c  = head;
       int  i = 1;
    while(i<=midL){
        if(midL == i){
            Node newNode = new Node(item);
            newNode.next = c;
            c = newNode;
            break;
        }
        c = c.next;
        i++;
    }
    int j = 1;
    Node currentNode = head;
    // while
    while(j<midL-1){
      currentNode = currentNode.next;
      j++;
    }
    currentNode.next = c;
}

  public static void main(String args[]){
     LL l = new LL();
     l.addFirst("6");
     l.addFirst("5");
     l.addFirst("4");
     l.addFirst("3");
     l.addFirst("2");
     l.addFirst("1");
     l.addLast("7");
     l.printList();
     l.length();
     // l.reverse();
     l.addMid("hel");
     l.printList();

  }
}

// class LL {
//   public static void main(String args[]){
//     new LL().go(1,"hi");
//     new LL().go(2,"hi","world");
//   }
//   public void go(int x, String... y){
//     System.out.println(y[y.length-1]+" ");
//   }
// }
