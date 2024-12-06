/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movie_tickets;

/**
 *
 * @author RC_Student_lab
 */
public class MovieTickets  {
    // Method to validate the movie name (cannot be empty)
    public boolean validateMovieName(String movieName) {
        if (movieName == null || movieName.trim().isEmpty()) {
            return false; 
        }
        return true; 
    }

    // Method to validate ticket price (must be greater than zero)
    public boolean validateTicketPrice(double price) {
        if (price <= 0) {
            return false; 
        }
        return true; 
    }

    // Method to validate the number of tickets (must be greater than zero)
    public boolean validateNumberOfTickets(int numberOfTickets) {
        if (numberOfTickets <= 0) {
            return false; 
        }
        return true; 
    }

    // Method to calculate total ticket price (including VAT)
    public double calculateTotalPrice(double price, int numberOfTickets) {
        double vat = 0.14; 
        double totalPrice = price * numberOfTickets;
        return totalPrice + (totalPrice * vat); 
    }
    
    
}
