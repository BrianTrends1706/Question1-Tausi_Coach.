/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qtn_3;



/**
 *
 * @author HP
 */
public class TrainTravelTime {
  public static void main(String[] args) {
    int totalDistance = 10000;
    int speed = 250; 
    int stopDistance = 150;
    int refuelDistance = 200; 
    int stopTime = 5; 

    int numStops = totalDistance / stopDistance;
    int numRefuels = totalDistance / refuelDistance;

    int totalStopTime = (numStops + numRefuels) * stopTime;
    double travelTime = (double) totalDistance / speed; 
    double totalTime = travelTime + (totalStopTime / 60.0);

    System.out.printf("Total travel time: %.2f hours%n", totalTime);
  }
}