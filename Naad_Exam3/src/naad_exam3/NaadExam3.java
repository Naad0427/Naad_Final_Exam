
package naad_exam3;


import java.util.Scanner;


public class NaadExam3 {
private class PriorityQueue{
            
            int priority;
            int data;
          
       PriorityQueue next;           
        }

    private PriorityQueue front = null;
   static int printCount = 0;
    public int deletion() throws Exception{
          if (front == null){
              throw new Exception("Queue is Empty");
          } 
          int temporary = front.data;
          front = front.next;
            
           return temporary; 
        
        }
    private void insert(int item, int priority){
            PriorityQueue node = new PriorityQueue();
            node.data=item;
            node.priority = priority;
            node.next = null;
            
            
            if (front == null || priority <= front.priority) {
                node.next = front;
                front = node;
            }
            else{
                PriorityQueue temporary = front;
                while (temporary.next != null && temporary.next.priority <= priority) {                    
                    temporary = temporary.next;
                }
                   node.next = temporary.next;
                   temporary.next = node;
               printCount++;
               
               }
            
        }
     
        public void print() throws Exception{
            if (front == null){
              throw new Exception("Walay Sulod");
          }
            PriorityQueue temporary;
    temporary = front;
            
            System.out.println("Priority \t\t Pages");
            
            while(temporary != null){
              
                   System.out.println(temporary.priority + "\t\t" + temporary.data);
                temporary = temporary.next;

            }
            System.out.println("\n");
        }
    public static void main(String[] args) throws Exception {
        NaadExam3 list;
    list = new NaadExam3();
        Scanner scanner;
    scanner = new Scanner(System.in);
        boolean insert;
    insert = true;
        while (insert) {            
            System.out.println("Enter Pages: ");
                    int page;
            page = scanner.nextInt();
                    
                    System.out.println("Enter Priority Number: ");
                    
                    int priority = scanner.nextInt();
                      
                    list.insert(page, priority);
                     if(printCount>4){
                         list.deletion();
            }
                        
                    
                    list.print();
        }
                
    }
    
}

	
		
    

