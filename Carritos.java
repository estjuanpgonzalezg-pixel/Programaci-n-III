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
     
     Color micolor = new Color(200,191,231);
     
    int meta = 450;
    
    public void paintComponent(Graphics p){
        
        super.paintComponent(p);
        
        p.setColor(Color.red);
        p.fillRect(x,5,25,10);
        p.setColor(Color.black);
        p.fillRect(x, 0, 5, 5);
        p.fillRect(x, 15, 5, 5);
        p.fillRect(x+20, 0, 5, 5);
        p.fillRect(x+20, 15, 5, 5);
        
        p.setColor(Color.blue);
        p.fillRect(y,30,25,10);
        p.setColor(Color.black);
        p.fillRect(y, 25, 5, 5);
        p.fillRect(y, 40, 5, 5);
        p.fillRect(y+20, 25, 5, 5);
        p.fillRect(y+20, 40, 5, 5);
        
        p.setColor(Color.green);
        p.fillRect(a,55,25,10);
        p.setColor(Color.black);
        p.fillRect(a, 50, 5, 5);
        p.fillRect(a, 65, 5, 5);
        p.fillRect(a+20, 50, 5, 5);
        p.fillRect(a+20, 65, 5, 5);
        
        p.setColor(Color.orange);
        p.fillRect(b,80,25,10);
        p.setColor(Color.black);
        p.fillRect(b, 75, 5, 5);
        p.fillRect(b, 90, 5, 5);
        p.fillRect(b+20, 75, 5, 5);
        p.fillRect(b+20, 90, 5, 5);
        
        p.setColor(Color.cyan);
        p.fillRect(c,105,25,10);
        p.setColor(Color.black);
        p.fillRect(c, 100, 5, 5);
        p.fillRect(c, 115, 5, 5);
        p.fillRect(c+20, 100, 5, 5);
        p.fillRect(c+20, 115, 5, 5);
        
        p.setColor(Color.LIGHT_GRAY);
        p.fillRect(d,130,25,10);
        p.setColor(Color.black);
        p.fillRect(d, 125, 5, 5);
        p.fillRect(d, 140, 5, 5);
        p.fillRect(d+20, 125, 5, 5);
        p.fillRect(d+20, 140, 5, 5);
        
        p.setColor(Color.DARK_GRAY);
        p.fillRect(e,155,25,10);
        p.setColor(Color.black);
        p.fillRect(e, 150, 5, 5);
        p.fillRect(e, 165, 5, 5);
        p.fillRect(e+20, 150, 5, 5);
        p.fillRect(e+20, 165, 5, 5);
        
        p.setColor(Color.pink);
        p.fillRect(f,180,25,10);
        p.setColor(Color.black);
        p.fillRect(f, 175, 5, 5);
        p.fillRect(f, 190, 5, 5);
        p.fillRect(f+20, 175, 5, 5);
        p.fillRect(f+20, 190, 5, 5);
        
        p.setColor(Color.MAGENTA);
        p.fillRect(g,205,25,10);
        p.setColor(Color.black);
        p.fillRect(g, 200, 5, 5);
        p.fillRect(g, 215, 5, 5);
        p.fillRect(g+20, 200, 5, 5);
        p.fillRect(g+20, 215, 5, 5);
        
        p.setColor(micolor);
        p.fillRect(h,230,25,10);
        p.setColor(Color.black);
        p.fillRect(h, 225, 5, 5);
        p.fillRect(h, 240, 5, 5);
        p.fillRect(h+20, 225, 5, 5);
        p.fillRect(h+20, 240, 5, 5);
        
        p.setColor(Color.red);
        p.fillRect(450, 0, 10, 263);
        
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
