package com.mycompany.carrental;

import java.sql.Connection;
import javax.swing.SwingUtilities;

public class CarRental {
    public static void main(String[] args) {
        // 1. Double check the database works silently in the background
        Connection conn = DBConnection.connect();
        
        if (conn != null) {
            System.out.println("System Initialized: Database online.");
            
            // 2. Launch your actual login visual interface window!
            SwingUtilities.invokeLater(() -> {
                new login().setVisible(true); // Double check if your file is named login or LoginFrame
            });
            
        } else {
            System.out.println("CRITICAL ERROR: Application halted because database is offline.");
        }
    }
}
