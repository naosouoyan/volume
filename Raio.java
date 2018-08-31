/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raio;

import javax.swing.JOptionPane;

/**
 *
 * @author Yan
 */
public class Raio {
    public static void main(String[] args) {
        String raio;
        double volume, volume1;
        
        raio = JOptionPane.showInputDialog("Digie o raio: ");
        int int_raio = Integer.parseInt(raio);
        volume = 4* 3.14 * Math.pow(int_raio, 3)/3;
        volume1 = 4* 3.14 * int_raio * int_raio * int_raio / 3;
        JOptionPane.showMessageDialog(null, "O Volume é: "+volume);
        
    }
    
}
