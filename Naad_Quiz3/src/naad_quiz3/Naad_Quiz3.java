/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package naad_quiz3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Naad_Quiz3 {
//
//     static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    static class Queue {
//        Node front;
//        Node rear;
//
//        Queue() {
//            this.front = null;
//            this.rear = null;
//        }
//
//        boolean isEmpty() {
//            return this.front == null;
//        }
//
//        void enqueue(int data) {
//            Node newNode = new Node(data);
//
//            if (this.rear == null) {
//                this.front = this.rear = newNode;
//                return;
//            }
//
//            this.rear.next = newNode;
//            this.rear = newNode;
//        }
//
//        int dequeue() {
//            if (this.isEmpty()) {
//                throw new Error("Way sulod");
//            }
//
//            int data = this.front.data;
//            this.front = this.front.next;
//
//            if (this.front == null) {
//                this.rear = null;
//            }
//
//            return data;
//        }
//
//        int boshit() {
//            if (this.isEmpty()) {
//                throw new Error("Way sulod");
//            }
//            return this.front.data;
//        }
//    }
//    
//    public static void main(String[] args) {
//        Queue queue = new Queue();
//        
//        int kyu = 10;
//        int arr[] = new int [kyu];
//        
//        System.out.println("Enter your elements:");
//        
//        Scanner scn = new Scanner(System.in);
//        
//        
//     
//        
//        for (int i = 1; i < kyu; i++) {
//            int element = scn.nextInt();
//            queue.enqueue(element); }
//        
//        System.out.println("Array is full!");
//        
//        System.out.println("Display elemets? press 1");
//        
//        int i = scn.nextInt();
//        if (i == 1) {
//            System.out.println("Your Elements:");
//      
//        }
//        while (!queue.isEmpty()) {
//            System.out.println(queue.dequeue());
//        }
//    }
//    }


// Number 2

static int MAX = 10;
    private int[] data = new int [MAX];
    private int front  ;
    private int rear;
    
    private void insertBeggining(int index)throws Exception{
       
       if((front == 0 && rear == MAX - 1) || (rear + 1 == front)){
           throw new Exception("Queue is Empty");
       }
       
       if (rear == MAX - 1) {
           rear = 0;
       } else if (front == 1){
           front = 0;
       } else {
           data[rear++] = index;
       }
    }
    private void insertEnding(int item) throws Exception{
        if(rear == MAX - 1){
            throw new Exception("Queue is full");
            
        }
        data[++rear] = item;
    }
     public int deletionBeggining(int item) throws Exception {
        if (rear == MAX-1 ){
            throw new Exception( " Queue is empty");
        }
        int temporary = data [ front];
        if(front == rear){
            front = rear - 1;
        } else{
            front++;
        }
        return temporary;
    }
      public int deletionEnding(int item) throws Exception {
        if (rear == MAX-1 ){
            throw new Exception( " Queue is empty");
        }
        int temporary = data [rear];
        if(front == rear){
            front = rear = -1;
        }else {
            rear--;
        }
        return temporary;
      }  
    
    private void display() throws Exception{
        
        if(front == -1){
            throw new Exception("Queue is Empty");
        }
        
        
        
        if(rear < front){
            for(int i = front; i <= MAX -1; i++){
                System.out.println(data[i] + "");
            }
            for(int i = 0; i <= rear; i++ ){
                System.out.println(data[i] + "");
            }
        }else {
             for(int i = front; i <= rear; i++ ){
                System.out.println(data[i] + "");
             }
        }
        System.out.println("NULL");
    }
    
    private int deletion() throws Exception{
        if (front == -1){
            throw new Exception("Queue is Empty");
        }
        
        int temporary = data[front];
        
        if(front == rear){
            front = rear = -1;
        }else if(front == MAX - 1){
            front = 0;
        } else{
            front++;
        }
        
        return temporary;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
     var list = new Naad_Quiz3();
        
        while (true) {
            System.out.println("1. Insert Begining");
            System.out.println("2. Insert Ending");
            System.out.println("3. Delete Beggining");
            System.out.println("4. Delete Ending");
            System.out.println("5. Print");
            int choice = scan.nextInt();
            int index;
            
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Index");
                    index = scan.nextInt();
                    list.insertBeggining(index);
                }
                case 2 -> {
                    System.out.println("Enter Index");
                    index = scan.nextInt();
                    list.insertEnding(index);
                }
                  case 3 -> {
                      System.out.println("Enter Index");
                      index = scan.nextInt();
                      list.deletionBeggining(index);
                }
                case 4 -> {
                    System.out.println("Enter Index");
                    index = scan.nextInt();
                    list.deletionEnding(index);
                }
                case 5 -> list.display();
            }
            
        }
    }
}

    


