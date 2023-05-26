/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Pichau
 */
public class Metodos {
    
    //para botões
    public static void btnentered(JButton btn) {       
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setBackground(Color.white);
        btn.setForeground(new Color(220,27,116));
    } 
    
    public static void btnexit(JButton btn){
        btn.setBackground(new Color(220,27,116)); //rosa
        btn.setForeground(Color.white);
    }
    
    public static void btnpress(JButton btn){
        btn.setBackground(new Color(93,100,218));
        btn.setForeground(Color.blue);
    }
    
    public static void btnrelease(JButton btn){
        btn.setBackground(new Color(220,27,116));
        btn.setForeground(Color.white);
    }
    
    
    //para labels
    public static void Labelentered(JLabel lbl){
        lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lbl.setForeground(new Color(220,27,116));
    }
    
    public static void Labeexit(JLabel lbl){
        lbl.setForeground(Color.white);
    }
    
    public static void Labepress(JLabel lbl){
        
    }
    
    public static void Labelrelease(JLabel lbl){
        
    }
    
    public static void sair(JLabel lbl){
        System.exit(0);
    }
}
