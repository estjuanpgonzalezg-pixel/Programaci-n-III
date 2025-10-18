package javaapplication16;

import java.awt.Color;
import java.awt.Graphics;

public class Carritos extends javax.swing.JPanel {

    public Carritos() {
        initComponents();
    }
    
     int x = 0;
     int y = 0;
     int a = 0;
     int b = 0;
     int c = 0;
     int d = 0;
     int e = 0;
     int f = 0;
     int g = 0;
     int h = 0;
     
     Color micolor = new Color(180,255,0);
     
    int meta = 780;
    
    public void paintComponent(Graphics p){
        
        super.paintComponent(p);
        
        p.setColor(Color.YELLOW);
        p.fillRoundRect(x, 10, 40, 15, 10, 10); 
        p.setColor(Color.BLACK);
        p.fillOval(x + 5, 23, 10, 10); 
        p.fillOval(x + 25, 23, 10, 10); 
        
        p.setColor(new Color(0, 50, 200));
        p.fillRoundRect(y, 35, 40, 15, 10, 10);
        p.setColor(Color.BLACK);
        p.fillOval(y + 5, 48, 10, 10);
        p.fillOval(y + 25, 48, 10, 10);
        
        p.setColor(new Color(0, 180, 0));
        p.fillRoundRect(a, 60, 40, 15, 10, 10);
        p.setColor(Color.BLACK);
        p.fillOval(a + 5, 73, 10, 10);
        p.fillOval(a + 25, 73, 10, 10);
        
        p.setColor(Color.GRAY);
        p.fillRoundRect(b, 85, 40, 15, 10, 10);
        p.setColor(Color.BLACK);
        p.fillOval(b + 5, 98, 10, 10);
        p.fillOval(b + 25, 98, 10, 10);
        
        p.setColor(new Color(114,47,55));
        p.fillRoundRect(c, 110, 40, 15, 10, 10);
        p.setColor(Color.BLACK);
        p.fillOval(c + 5, 123, 10, 10);
        p.fillOval(c + 25, 123, 10, 10);
        
        p.setColor(new Color(128,0,128));
        p.fillRoundRect(d, 135, 40, 15, 10, 10);
        p.setColor(Color.BLACK);
        p.fillOval(d + 5, 148, 10, 10);
        p.fillOval(d + 25, 148, 10, 10);
        
        p.setColor(Color.ORANGE);
        p.fillRoundRect(e, 160, 40, 15, 10, 10);
        p.setColor(Color.BLACK);
        p.fillOval(e + 5, 173, 10, 10);
        p.fillOval(e + 25, 173, 10, 10);
        
         p.setColor(Color.CYAN);
        p.fillRoundRect(f, 185, 40, 15, 10, 10);
        p.setColor(Color.BLACK);
        p.fillOval(f + 5, 198, 10, 10);
        p.fillOval(f + 25, 198, 10, 10);
        
        p.setColor(new Color(255, 100, 200));
        p.fillRoundRect(g, 210, 40, 15, 10, 10);
        p.setColor(Color.BLACK);
        p.fillOval(g + 5, 223, 10, 10);
        p.fillOval(g + 25, 223, 10, 10);
        
        p.setColor(micolor);
        p.fillRoundRect(h, 235, 40, 15, 10, 10);
        p.setColor(Color.black);
        p.fillOval(h + 5, 248, 10, 10);
        p.fillOval(h + 25, 248, 10, 10);
        
        p.setColor(Color.black);
        p.fillRect(780, 0, 10, 280);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
