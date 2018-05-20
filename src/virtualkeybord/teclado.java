/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualkeybord;

import java.awt.event.KeyEvent;

/**
 *
 * @author Bia
 */
public class teclado {
    public boolean brilhaTeclado(KeyEvent evt){
        return evt.getKeyCode() == KeyEvent.VK_A;
    }
}
