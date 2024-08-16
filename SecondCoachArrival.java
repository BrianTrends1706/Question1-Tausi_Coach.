/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qtn_3;



/**
 *
 * @author HP
 */
public class SecondCoachArrival {
  public static void main(String[] args) {
    int distance = 10000; 
    double speed = 225.5; 
    int startTime = 9; 
    double speedKmh = speed * 3600 / 1000; 
    double travelTime = distance / speedKmh;  
    double arrivalTime = startTime + travelTime;
   
    System.out.printf("Arrival Time: %.2f hours%n", arrivalTime);
  }
}