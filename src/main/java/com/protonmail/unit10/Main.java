/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.protonmail.unit10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author unit
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame("W A T E R  P I P E L I N E S  S C E T C H");
        frame.getContentPane().add(new Scetch());
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        String URL = "jdbc:h2:~/\"PUBLIC\"/PIPELINES;DB_CLOSE_DELAY=-1";
        String login = "root";
        String pass = "cobra";
        Connection connection;
        
        PreparedStatement statement;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input start point:");
        String startPoint = sc.next();
        System.out.println("Input destination point: ");
        String endPoint = sc.next();

        String querry = "SELECT DESTINATION" + endPoint + " FROM \"PUBLIC\".PIPELINES WHERE STARTPOINT = '" + startPoint + "';";
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(URL, login, pass);
            statement = connection.prepareStatement(querry);
            ResultSet set = statement.executeQuery(querry);
            Boolean result = set.getBoolean("DESTINATION" + endPoint);

            if (result == true) {
                Distances distances = new Distances();
                int inPipe = Integer.parseInt(startPoint);
                int outOfPipe = Integer.parseInt(endPoint);

                if (inPipe == 1 && outOfPipe <= 5) {
                    switch (outOfPipe) {
                        

                        case (3) -> System.out.println("Distance " + distances.getDistance1_4() / 2);

                        case (4) -> System.out.println("Distance " + distances.getDistance1_4());

                        case (5) -> System.out.println("Distance " + (distances.getDistance1_4() / 2 + distances.getDistance3_5()));

                        default -> System.out.println("No route awailable.");
                    }
                }

                if (inPipe == 2 && outOfPipe <= 5) {
                    switch (outOfPipe) {                       
                        case (3) -> System.out.println("Distance " + distances.getDistance1_4() / 3);

                        case (4) -> System.out.println("Distance " + (distances.getDistance1_4() - 10));

                        case (5) -> System.out.println("Distance " + (distances.getDistance1_4() / 3 + distances.getDistance3_5()));

                        default -> System.out.println("No route awailable");
                    }
                }

                if (inPipe == 3 && outOfPipe <= 5) {
                    switch (outOfPipe) {
                        case (4) -> System.out.println("Distance " + distances.getDistance1_4() / 2);

                        case (5) -> System.out.println("Distance " + distances.getDistance3_5());

                        default -> System.out.println("No route awailable");
                    }
                }
                if (inPipe == 6 && outOfPipe == 7) {
                    System.out.println("Distance " + distances.getDistance6_7());

                }

            } else {
                System.err.println("The route does not exist."
                        + "At least for now.");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
