package javaapplication16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {

       DefaultTableModel modelo = new DefaultTableModel();
    
    public GUI() {
        initComponents();
        modelo.setColumnIdentifiers(new Object[]{"Carro", "Tiempo"});
        modelo.setRowCount(0);
    }

     Timer tempo = new Timer(1000, new ActionListener ()
      {
public void actionPerformed(ActionEvent e)
        {
        carritos();
        }
});

    int valorRandom1, valorRandom2, valorRandom3, valorRandom4, valorRandom5, valorRandom6, valorRandom7, valorRandom8, valorRandom9, valorRandom10, segundos = 0;
    
    String apuesta;
    
    boolean[] yaRegistrado = new boolean[10];
    
void random() {
    
    valorRandom1 = (int)(Math.random() * (20 - 3 + 1)) + 3;
    valorRandom2 = (int)(Math.random() * (20 - 3 + 1)) + 3;
    valorRandom3 = (int)(Math.random() * (20 - 3 + 1)) + 3;
    valorRandom4 = (int)(Math.random() * (20 - 3 + 1)) + 3;
    valorRandom5 = (int)(Math.random() * (20 - 3 + 1)) + 3;
    valorRandom6 = (int)(Math.random() * (20 - 3 + 1)) + 3;
    valorRandom7 = (int)(Math.random() * (20 - 3 + 1)) + 3;
    valorRandom8 = (int)(Math.random() * (20 - 3 + 1)) + 3;
    valorRandom9 = (int)(Math.random() * (20 - 3 + 1)) + 3;
    valorRandom10 = (int)(Math.random() * (20 - 3 + 1)) + 3;
}

    void reinicio(){
    
        for (int i = 0; i < yaRegistrado.length; i++) {
        yaRegistrado[i] = false;
        }
        
        segundos = 0;
        carritos1.x = 0;
        carritos1.y = 0;
        carritos1.a = 0;
        carritos1.b = 0;
        carritos1.c = 0;
        carritos1.d = 0;
        carritos1.e = 0;
        carritos1.f = 0;
        carritos1.g = 0;
        carritos1.h = 0;
        modelo.setRowCount(0);
    
    }
    
    void carritos(){
  
    int[] posiciones = {
        carritos1.x, carritos1.y, carritos1.a, carritos1.b, carritos1.c,
        carritos1.d, carritos1.e, carritos1.f, carritos1.g, carritos1.h
    };

    String[] nombres = {
        "Carro amarillo", "Carro azul", "Carro verde", "Carro gris", "Carro vino",
        "Carro morado", "Carro amarillo oscuro", "Carro cyan", "Carro rosado", "Carro verde vomito"
    };

    int[] velocidades = {
        valorRandom1, valorRandom2, valorRandom3, valorRandom4, valorRandom5,
        valorRandom6, valorRandom7, valorRandom8, valorRandom9, valorRandom10
    };

    boolean todosLlegaron = true;

    for (int i = 0; i < 10; i++) {
        if (posiciones[i] < carritos1.meta) {
            todosLlegaron = false;
            posiciones[i] += velocidades[i];
        } else if (posiciones[i] >= carritos1.meta && !yaRegistrado[i]) {
      modelo.addRow(new Object[]{nombres[i], segundos});
     yaRegistrado[i] = true;
      }
      }

    carritos1.x = posiciones[0];
    carritos1.y = posiciones[1];
    carritos1.a = posiciones[2];
    carritos1.b = posiciones[3];
    carritos1.c = posiciones[4];
    carritos1.d = posiciones[5];
    carritos1.e = posiciones[6];
    carritos1.f = posiciones[7];
    carritos1.g = posiciones[8];
    carritos1.h = posiciones[9];

    carritos1.repaint();
    segundos++;

    if (todosLlegaron) {
        tempo.stop();
    String autoGanador = modelo.getValueAt(0, 0).toString();

    if (autoGanador.equals(apuesta)) {
        JOptionPane.showMessageDialog(this,
            "Su auto " + apuesta + " ganó la carrera ",
            "Resultado de la apuesta",
            JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this,
            "Su auto no ganó.\nEl ganador fue: " + autoGanador,
            "Resultado de la apuesta",
            JOptionPane.WARNING_MESSAGE);
    }
    
    }
    
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        carritos1 = new javaapplication16.Carritos();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel1.setText("Controlador de tiempo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro amarillo", "Carro azul ", "Carro verde", "Carro gris", "Carro vino", "Carro morado", "Carro amarillo oscuro", "Carro cyan", "Carro rosado", "Carro verde vomito" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout carritos1Layout = new javax.swing.GroupLayout(carritos1);
        carritos1.setLayout(carritos1Layout);
        carritos1Layout.setHorizontalGroup(
            carritos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        carritos1Layout.setVerticalGroup(
            carritos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(carritos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carritos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        random();
        reinicio();
        
        apuesta = (String) jComboBox1.getSelectedItem();
        
        tempo.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
          int nuevoDelay = jSlider1.getValue();
         tempo.setDelay(nuevoDelay);
    }//GEN-LAST:event_jSlider1StateChanged

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaapplication16.Carritos carritos1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
