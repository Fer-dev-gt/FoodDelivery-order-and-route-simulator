package pantallas;

import clases.Pedido;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class SeguirEnvios extends javax.swing.JFrame {
  public static ArrayList<Pedido> arrayPedidosPorEnviar = new ArrayList<>();

  public SeguirEnvios() {
    initComponents();
    agregarMotoParaEnvio();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();
    regresarBtn = new javax.swing.JButton();
    panelMotosEnvios = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Visualización de Trayectorias");

    jButton1.setText("Enviar Todas");

    jLabel2.setText("Motocicleta 1");

    jLabel3.setText("Distancia: ");

    jButton2.setText("Enviar");

    regresarBtn.setText("REGRESAR");
    regresarBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        regresarBtnActionPerformed(evt);
      }
    });

    panelMotosEnvios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

    javax.swing.GroupLayout panelMotosEnviosLayout = new javax.swing.GroupLayout(panelMotosEnvios);
    panelMotosEnvios.setLayout(panelMotosEnviosLayout);
    panelMotosEnviosLayout.setHorizontalGroup(
      panelMotosEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    panelMotosEnviosLayout.setVerticalGroup(
      panelMotosEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(regresarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel2)
                  .addComponent(jButton2)
                  .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(panelMotosEnvios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(450, 450, 450)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
            .addComponent(jButton1)))
        .addGap(36, 36, 36))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(jButton1))
          .addGroup(layout.createSequentialGroup()
            .addGap(36, 36, 36)
            .addComponent(jLabel1)))
        .addGap(36, 36, 36)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addComponent(jLabel3)
            .addGap(26, 26, 26)
            .addComponent(jButton2)
            .addGap(0, 525, Short.MAX_VALUE))
          .addComponent(panelMotosEnvios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addComponent(regresarBtn)
        .addGap(17, 17, 17))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
    this.dispose();
    MainMenu menuPrincipal = new MainMenu();
    menuPrincipal.setVisible(true);
  }//GEN-LAST:event_regresarBtnActionPerformed

  
  
  private void agregarMotoParaEnvio(){
    int posicionY = 100;
    for (Pedido pedido : arrayPedidosPorEnviar) {
        ImageIcon imageIcon = new ImageIcon("/Users/fernandoorozco/Desktop/DeliveryFood/bike.png");              // Load an image from your file (replace "path/to/your/image.jpg" with the actual path)
        Image originalImage = imageIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        
        JLabel label2 = new JLabel(resizedIcon);
        label2.setBounds(100, posicionY, 100, 100);
        panelMotosEnvios.add(label2);
        posicionY += 125;
    }
  }
  

  
  
  
  
  
  
  
  
  
  
  
  public static void main(String args[]) {
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(SeguirEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SeguirEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SeguirEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SeguirEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new SeguirEnvios().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel panelMotosEnvios;
  private javax.swing.JButton regresarBtn;
  // End of variables declaration//GEN-END:variables
}
