class Queue{
  int a[];
  int point = 0;
  int first;

  Queue(int size){
    this.a = new int[size];
  }

  public void  peek(){
    if(a.length>0){
       first = a[0];
       System.out.println(first);
  }
  }
  public void enqueue (int value){
       a[point] = value;
       point++;
  }

  public void dequeue (){
    if(a.length > 0){
       int b[] = new int[a.length-1];
       int i = 0 ;
       while(i<b.length){
         b[i] = a[i+1];
         i++;
       }
       a = b;
       point--;
    }
  }

  public void display () {
     if(a.length > 0){
       for (int x : a){
         System.out.println(x);
       }
     }else {
       System.out.println("Queue is empty !");
     }
  }

  public static void main(String ar[]){
     Queue q  = new Queue(6);
     q.enqueue(1);
     q.enqueue(2);
     q.enqueue(3);
     q.enqueue(4);
     q.enqueue(5);
     q.enqueue(6);
     q.dequeue();
     q.display();
      q.peek();
  }
}
