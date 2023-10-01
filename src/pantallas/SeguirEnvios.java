package pantallas;

import clases.Hilo;
import clases.Pedido;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class SeguirEnvios extends javax.swing.JFrame {
  public static ArrayList<Pedido> arrayPedidosPorEnviar = new ArrayList<>();
  public static ArrayList<Thread> arrayHilosDePedidos = new ArrayList<>();
  public static ArrayList<JLabel> arrayFotosMotos = new ArrayList<>();

  public SeguirEnvios() {
    initComponents();
    agregarMotoParaEnvio();
    ponerInformacionPedidos();
    mostrarBotonesYLabels();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    enviarTodasLasMotos = new javax.swing.JButton();
    vehiculo1 = new javax.swing.JLabel();
    distancia1 = new javax.swing.JLabel();
    iniciarViajeMoto1 = new javax.swing.JButton();
    regresarBtn = new javax.swing.JButton();
    panelMotosEnvios = new javax.swing.JPanel();
    metaLabel = new javax.swing.JLabel();
    iniciarViajeMoto2 = new javax.swing.JButton();
    iniciarViajeMoto3 = new javax.swing.JButton();
    vehiculo3 = new javax.swing.JLabel();
    vehiculo2 = new javax.swing.JLabel();
    distancia2 = new javax.swing.JLabel();
    distancia3 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Visualización de Trayectorias");

    enviarTodasLasMotos.setText("Enviar Todas");
    enviarTodasLasMotos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        enviarTodasLasMotosActionPerformed(evt);
      }
    });

    vehiculo1.setText("Vehiculo");

    distancia1.setText("Distancia: ");

    iniciarViajeMoto1.setText("Enviar");
    iniciarViajeMoto1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        iniciarViajeMoto1ActionPerformed(evt);
      }
    });

    regresarBtn.setText("REGRESAR");
    regresarBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        regresarBtnActionPerformed(evt);
      }
    });

    panelMotosEnvios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

    metaLabel.setBackground(new java.awt.Color(153, 153, 255));
    metaLabel.setOpaque(true);

    javax.swing.GroupLayout panelMotosEnviosLayout = new javax.swing.GroupLayout(panelMotosEnvios);
    panelMotosEnvios.setLayout(panelMotosEnviosLayout);
    panelMotosEnviosLayout.setHorizontalGroup(
      panelMotosEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMotosEnviosLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(metaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(36, 36, 36))
    );
    panelMotosEnviosLayout.setVerticalGroup(
      panelMotosEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelMotosEnviosLayout.createSequentialGroup()
        .addGap(43, 43, 43)
        .addComponent(metaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(48, Short.MAX_VALUE))
    );

    iniciarViajeMoto2.setText("Enviar");
    iniciarViajeMoto2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        iniciarViajeMoto2ActionPerformed(evt);
      }
    });

    iniciarViajeMoto3.setText("Enviar");
    iniciarViajeMoto3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        iniciarViajeMoto3ActionPerformed(evt);
      }
    });

    vehiculo3.setText("Vehiculo");

    vehiculo2.setText("Vehiculo");

    distancia2.setText("Distancia: ");

    distancia3.setText("Distancia: ");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(regresarBtn))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(450, 450, 450)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
            .addComponent(enviarTodasLasMotos))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vehiculo3))
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(vehiculo1)
                  .addComponent(distancia1)))
              .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iniciarViajeMoto1))
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vehiculo2))
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(distancia3))
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(distancia2))
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iniciarViajeMoto2))
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iniciarViajeMoto3)))
            .addGap(29, 29, 29)
            .addComponent(panelMotosEnvios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addGap(36, 36, 36))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(36, 36, 36)
            .addComponent(jLabel1))
          .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(enviarTodasLasMotos)))
        .addGap(36, 36, 36)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(vehiculo1)
            .addGap(18, 18, 18)
            .addComponent(distancia1)
            .addGap(30, 30, 30)
            .addComponent(iniciarViajeMoto1)
            .addGap(76, 76, 76)
            .addComponent(vehiculo2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(distancia2)
            .addGap(18, 18, 18)
            .addComponent(iniciarViajeMoto2)
            .addGap(72, 72, 72)
            .addComponent(vehiculo3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(distancia3)
            .addGap(18, 18, 18)
            .addComponent(iniciarViajeMoto3)
            .addGap(0, 0, Short.MAX_VALUE))
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

  private void iniciarViajeMoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarViajeMoto1ActionPerformed
    startThreadAtIndex(0);
  }//GEN-LAST:event_iniciarViajeMoto1ActionPerformed

  private void iniciarViajeMoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarViajeMoto2ActionPerformed
    startThreadAtIndex(1);
  }//GEN-LAST:event_iniciarViajeMoto2ActionPerformed

  private void iniciarViajeMoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarViajeMoto3ActionPerformed
    startThreadAtIndex(2);
  }//GEN-LAST:event_iniciarViajeMoto3ActionPerformed

  private void enviarTodasLasMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarTodasLasMotosActionPerformed
    startThreadAtIndex(0);
    startThreadAtIndex(1);
    startThreadAtIndex(2);
  }//GEN-LAST:event_enviarTodasLasMotosActionPerformed

  
  private void ponerInformacionPedidos() {
    if(!arrayPedidosPorEnviar.isEmpty()){
      vehiculo1.setText(arrayPedidosPorEnviar.get(0).getVehiculo());
      distancia1.setText("Distancia: "+String.valueOf(arrayPedidosPorEnviar.get(0).getDistancia())+"km");
    }
    if(arrayPedidosPorEnviar.size() > 1){
      vehiculo2.setText(arrayPedidosPorEnviar.get(1).getVehiculo());
      distancia2.setText("Distancia: "+String.valueOf(arrayPedidosPorEnviar.get(1).getDistancia())+"km");
    }
    if(arrayPedidosPorEnviar.size() > 2){
      vehiculo3.setText(arrayPedidosPorEnviar.get(2).getVehiculo());
      distancia3.setText("Distancia: "+String.valueOf(arrayPedidosPorEnviar.get(2).getDistancia())+"km");
    }
  }
  
  private void mostrarBotonesYLabels() {
    switch (arrayHilosDePedidos.size()) {
      case 0 -> {
        vehiculo1.setVisible(false);
        distancia1.setVisible(false);
        iniciarViajeMoto1.setVisible(false);
        vehiculo2.setVisible(false);
        distancia2.setVisible(false);
        iniciarViajeMoto2.setVisible(false);
        vehiculo3.setVisible(false);
        distancia3.setVisible(false);
        iniciarViajeMoto3.setVisible(false);
      }
      case 1 -> {
        vehiculo2.setVisible(false);
        distancia2.setVisible(false);
        iniciarViajeMoto2.setVisible(false);
        vehiculo3.setVisible(false);
        distancia3.setVisible(false);
        iniciarViajeMoto3.setVisible(false);
      }
      case 2 -> {
        vehiculo3.setVisible(false);
        distancia3.setVisible(false);
        iniciarViajeMoto3.setVisible(false);
      }
    }
  }
  
  
  
  private void startThreadAtIndex(int index) {
    System.out.println("arrayHilosDePedidos SIZE: " +arrayHilosDePedidos.size());
    if (index >= 0 && index < arrayHilosDePedidos.size()) {
      Hilo hilo = new Hilo(arrayPedidosPorEnviar.get(index).getVehiculo(), arrayPedidosPorEnviar.get(index).getDistancia(), arrayFotosMotos.get(index));
      arrayHilosDePedidos.set(index, hilo);     // Replace the old thread with the new one
      hilo.start();
    }
  }
  
  private void agregarMotoParaEnvio(){
    int posicionY = 100;
    arrayHilosDePedidos.clear();
    arrayFotosMotos.clear();
    
    System.out.println("Pedidos: "+arrayPedidosPorEnviar.size());
    for (Pedido pedido : arrayPedidosPorEnviar) {
      ImageIcon imageIcon = new ImageIcon("/Users/fernandoorozco/Desktop/DeliveryFood/bike.png");
      Image originalImage = imageIcon.getImage();
      Image resizedImage = originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
      ImageIcon resizedIcon = new ImageIcon(resizedImage);
      
      JLabel label2 = new JLabel(resizedIcon);
      label2.setBounds(100, posicionY, 100, 100);
      panelMotosEnvios.add(label2);
      arrayFotosMotos.add(label2);

      Hilo hiloPedido = new Hilo(pedido.getVehiculo(), pedido.getDistancia(), label2);
      arrayHilosDePedidos.add(hiloPedido);
      
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
  private javax.swing.JLabel distancia1;
  private javax.swing.JLabel distancia2;
  private javax.swing.JLabel distancia3;
  private javax.swing.JButton enviarTodasLasMotos;
  private javax.swing.JButton iniciarViajeMoto1;
  private javax.swing.JButton iniciarViajeMoto2;
  private javax.swing.JButton iniciarViajeMoto3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel metaLabel;
  private javax.swing.JPanel panelMotosEnvios;
  private javax.swing.JButton regresarBtn;
  private javax.swing.JLabel vehiculo1;
  private javax.swing.JLabel vehiculo2;
  private javax.swing.JLabel vehiculo3;
  // End of variables declaration//GEN-END:variables
}
