/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    
    /* Main */
    public static void main(String[] args) {
          
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        String type = in.nextLine();
        Customer cus = CustomerFactory.CreateCustomer(type);
        /* Line down is not toString */
        System.out.print(cus.createMail());
    }
}
