package javaapplication16;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {

    int[] posiciones = new int[10];

    String[] nombres = {
        "Carro rojo", "Carro azul", "Carro verde", "Carro naranja", "Carro cian",
        "Carro gris", "Carro gris oscuro", "Carro rosa", "Carro magenta", "Carro violeta"
    };

    boolean[] yaRegistrado = new boolean[10];
    String apuesta;

    DefaultTableModel modelo = new DefaultTableModel();

    volatile boolean todosLlegaron = false;
    volatile int carrosLlegaron = 0;
    volatile int tiempoGlobal = 0;

    public class Carro extends Thread {

        private int index;
        private GUI guiRef;

        public Carro(int index, GUI guiRef) {
            this.index = index;
            this.guiRef = guiRef;
        }

        @Override
        public void run() {

            int pos = 0;

            while (!todosLlegaron && pos < carritos2.meta) {

                pos++;
                posiciones[index] = pos;

                try {
                    Thread.sleep((int)(Math.random() * 15 + 5));
                } catch (InterruptedException ex) {}

                SwingUtilities.invokeLater(() -> actualizarPosiciones());
            }

            synchronized(guiRef) {
                if (!yaRegistrado[index]) {
                    yaRegistrado[index] = true;
                    carrosLlegaron++;

                    int tiempoLlegada = tiempoGlobal; 

                    guiRef.registrarLlegada(nombres[index], tiempoLlegada);

                    if (carrosLlegaron == 10)
                        todosLlegaron = true;
                }
            }
        }
    }

    public GUI() {
        initComponents();
        modelo.setColumnIdentifiers(new Object[]{"Carro", "Tiempo"});
        modelo.setRowCount(0);
    }

    void reinicio() {
        for (int i = 0; i < 10; i++) {
            posiciones[i] = 0;
            yaRegistrado[i] = false;
        }
        modelo.setRowCount(0);
        carritos2.repaint();
    }

    void actualizarPosiciones() {
        carritos2.x = posiciones[0];
        carritos2.y = posiciones[1];
        carritos2.a = posiciones[2];
        carritos2.b = posiciones[3];
        carritos2.c = posiciones[4];
        carritos2.d = posiciones[5];
        carritos2.e = posiciones[6];
        carritos2.f = posiciones[7];
        carritos2.g = posiciones[8];
        carritos2.h = posiciones[9];
        carritos2.repaint();
    }

    synchronized void registrarLlegada(String nombre, int tiempo) {

        SwingUtilities.invokeLater(() -> {
            modelo.addRow(new Object[]{nombre, tiempo});
        });

        if (carrosLlegaron == 10) {
            SwingUtilities.invokeLater(() -> {
                String ganador = modelo.getValueAt(0, 0).toString();

                if (ganador.equals(apuesta)) {
                    JOptionPane.showMessageDialog(this,
                        "¡Felicidades! Tu carro (" + apuesta + ") ganó la carrera.");
                } else {
                    JOptionPane.showMessageDialog(this,
                        "Perdiste la apuesta.\nGanó: " + ganador);
                }
            });
        }
    }

    private void iniciarCarrera() {

        reinicio();
        apuesta = (String) jComboBox1.getSelectedItem();

        todosLlegaron = false;
        carrosLlegaron = 0;
        tiempoGlobal = 0;

        for (int i = 0; i < 10; i++) {
            new Carro(i, this).start();
        }
        
        new Thread(() -> {
            while (!todosLlegaron) {
                try { Thread.sleep(1); } catch (Exception e) {}
                tiempoGlobal++;
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        carritos2 = new javaapplication16.Carritos();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro rojo", "Carro azul", "Carro verde", "Carro naranja", "Carro cian", "Carro gris", "Carro gris oscuro", "Carro rosado", "Carro magenta", "Carro violeta" }));
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

        javax.swing.GroupLayout carritos2Layout = new javax.swing.GroupLayout(carritos2);
        carritos2.setLayout(carritos2Layout);
        carritos2Layout.setHorizontalGroup(
            carritos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        carritos2Layout.setVerticalGroup(
            carritos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carritos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carritos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        iniciarCarrera();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
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
    private javaapplication16.Carritos carritos2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
