
package juego;

import javax.swing.JFrame;

public class JUEGO extends JFrame {
    public JUEGO(){
        initUI();
    }
        private void initUI() {
        
        add(new Board());
        setSize(250, 200);
        setTitle("Juego");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
        public static void main(String[] args) {
        JUEGO juego= new JUEGO();
        juego.setVisible(true);
        
        
    }
}
