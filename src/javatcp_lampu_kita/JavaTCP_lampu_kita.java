/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatcp_lampu_kita;

/**
 *
 * @author Ulfa
 */
public class JavaTCP_lampu_kita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Server_lampu sl = new Server_lampu();
        sl.show();
        
        Client_Button cb = new Client_Button();
        cb.show();
    }
    
}
