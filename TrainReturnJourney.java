/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qtn_3;



/**
 *
 * @author HP
 */
public class TrainReturnJourney {
  public static void main(String[] args) {
    int totalDistance = 10000; 
    int speed = 250; 
    int refuelDistance = 200; 
    int refuelTime = 5;
    int numRefuels = totalDistance / refuelDistance;
    int totalRefuelTime = numRefuels * refuelTime; 
    double travelTime = (double) totalDistance / speed; 
    double totalTime = travelTime + (totalRefuelTime / 60.0); 
    System.out.printf("Total travel time: %.2f hours%n", totalTime);
  }
}