/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qtn_3;



/**
 *
 * @author HP
 */
public class TrainStops {
  public static void main(String[] args) {
    int totalDistance = 10000;
    int stopDistance = 150;
    int refuelDistance = 200; 

    int numStops = totalDistance / stopDistance;
    int numRefuels = totalDistance / refuelDistance;

    System.out.println("Number of stops: " + numStops);
    System.out.println("Number of refuels: " + numRefuels);
  }
}