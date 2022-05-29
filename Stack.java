class Stack {

    int length;
    int a [];
    int point  = 0;

    Stack(){}
    Stack(int a){
      length  = a;
      this.a  = new int[length];
    }

   public void push(int value){
        a[point] = value;
        point++;
   }

   public void pop(){
     if(a.length>0){
             int b[]  =  new int[a.length-1];
             int i = 0 ;
             while(i<b.length){
                b[i] =  a[i];
                i++;
             }
             a = b;
             point--;
        }
   }

   public void display(){
    if(length > 0){
       for(int x : a){
         System.out.println(x);
       }
     }else{
        System.out.println("the stack have no value");
     }
   }
    public static void main(String ar[]){
       Stack obj = new Stack(4);
        obj.push(2);
        obj.push(2);
        obj.push(2);
        obj.push(2);
      System.out.println(obj.point);
       obj.display();

    }
}
