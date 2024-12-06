/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movie_tickets;

/**
 *
 * @author RC_Student_lab
 */
public class movieTicketss implements iMovieTickets{
    
    // Implement the CalculateTotalTicketPrice method
    @Override
    public double CalculateTotalTicketPrice(int numbeOfTickets, double ticketPrice) {
        // Assuming there is a VAT of 15% on the total price
        double totalPrice = numbeOfTickets * ticketPrice;
        double vat = totalPrice * 0.15;
        return totalPrice + vat;
    }

    // Implement the ValidateData method
    @Override
    public boolean ValidateData(Movie_Tickets_GUI movieTicketData) {
        String movie = (String) movieTicketData.jComboBox1.getSelectedItem();
        String priceText = movieTicketData.jTextField2.getText();
        String ticketNrText = movieTicketData.jTextField1.getText();

        double price = 0;
        int ticketNr = 0;

        try {
            price = Double.parseDouble(priceText);
            ticketNr = Integer.parseInt(ticketNrText);
        } catch (NumberFormatException e) {
            movieTicketData.jTextArea1.setText("Invalid input: Please enter valid numbers for price and number of tickets.");
            return false;
        }

        // Validate movie name, price, and number of tickets
        if (movie == null || movie.isEmpty()) {
            movieTicketData.jTextArea1.setText("Invalid movie name: Movie name cannot be empty.");
            return false;
        }

        if (price <= 0) {
            movieTicketData.jTextArea1.setText("Invalid price: Ticket price must be greater than zero.");
            return false;
        }

        if (ticketNr <= 0) {
            movieTicketData.jTextArea1.setText("Invalid number of tickets: Number of tickets must be greater than zero.");
            return false;
        }

        return true;
    }
}
