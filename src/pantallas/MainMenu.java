package pantallas;

import clases.Motocicleta;
import clases.Producto;
import java.util.ArrayList;
import static pantallas.RegistrarProductos.imprimirNombreProductos;

public class MainMenu extends javax.swing.JFrame {
  public static ArrayList<Producto> arrayProductos = new ArrayList<>();
  public static ArrayList<Motocicleta> arrayMotocicleta = new ArrayList<>();
  
  RegistrarProductos pantallaRegistrar;
  PrepararPedido pantallaDePedidos;
  SeguirEnvios pantallaSeguirEnvios;
  HistorialEnvios pantallaHistorialEnvios;
  
  
  public MainMenu() {
    initComponents();
    crearCuatroProductosPorDefecto();
    crearTresMotocicletas();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    registrarNuevoProducto = new javax.swing.JButton();
    prepararEnvio = new javax.swing.JButton();
    hacerSeguimientoEnvios = new javax.swing.JButton();
    historialPedidos = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    registrarNuevoProducto.setText("Registrar nuevo producto");
    registrarNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        registrarNuevoProductoActionPerformed(evt);
      }
    });

    prepararEnvio.setText("Preparación de envio");
    prepararEnvio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        prepararEnvioActionPerformed(evt);
      }
    });

    hacerSeguimientoEnvios.setText("Seguimiento de envios");
    hacerSeguimientoEnvios.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        hacerSeguimientoEnviosActionPerformed(evt);
      }
    });

    historialPedidos.setText("Historial de pedidos");
    historialPedidos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        historialPedidosActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(275, 275, 275)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(registrarNuevoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(prepararEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(hacerSeguimientoEnvios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(historialPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(282, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(132, 132, 132)
        .addComponent(registrarNuevoProducto)
        .addGap(30, 30, 30)
        .addComponent(prepararEnvio)
        .addGap(38, 38, 38)
        .addComponent(hacerSeguimientoEnvios)
        .addGap(39, 39, 39)
        .addComponent(historialPedidos)
        .addContainerGap(162, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void registrarNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarNuevoProductoActionPerformed
    pantallaRegistrar = new RegistrarProductos();
    this.pantallaRegistrar.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_registrarNuevoProductoActionPerformed

  private void prepararEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prepararEnvioActionPerformed
    pantallaDePedidos = new PrepararPedido();
    this.pantallaDePedidos.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_prepararEnvioActionPerformed

  private void hacerSeguimientoEnviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerSeguimientoEnviosActionPerformed
    pantallaSeguirEnvios = new SeguirEnvios();
    this.pantallaSeguirEnvios.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_hacerSeguimientoEnviosActionPerformed

  private void historialPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialPedidosActionPerformed
    pantallaHistorialEnvios = new HistorialEnvios();
    this.pantallaHistorialEnvios.setVisible(true);
    this.setVisible(false);
  }//GEN-LAST:event_historialPedidosActionPerformed

  
    
  public static void crearCuatroProductosPorDefecto() {
    if(arrayProductos.size() < 4){
      Producto producto1 = new Producto("Papas Fritas", 10);
      Producto producto2 = new Producto("Hamburguesa", 25);
      Producto producto3 = new Producto("Ensalada", 20);
      Producto producto4 = new Producto("MilkShake", 15);

      MainMenu.arrayProductos.add(producto1);
      MainMenu.arrayProductos.add(producto2);
      MainMenu.arrayProductos.add(producto3);
      MainMenu.arrayProductos.add(producto4);

      System.out.println("Se agregaron los siguientes 4 productos por defecto");
      imprimirNombreProductos();
    }
  }
  
  
  public static void crearTresMotocicletas() {
    int velocidadDeMotocicletas = 20;
    if(arrayMotocicleta.size() < 3){
      Motocicleta moto1 = new Motocicleta("Motocicleta 1", velocidadDeMotocicletas);
      Motocicleta moto2 = new Motocicleta("Motocicleta 2", velocidadDeMotocicletas);
      Motocicleta moto3 = new Motocicleta("Motocicleta 3", velocidadDeMotocicletas);

      arrayMotocicleta.add(moto1);
      arrayMotocicleta.add(moto2);
      arrayMotocicleta.add(moto3);

      System.out.println("Se crearon las 3 motocicletas del negocio con velocidad de: "+velocidadDeMotocicletas+" Km/h");
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
      java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new MainMenu().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton hacerSeguimientoEnvios;
  private javax.swing.JButton historialPedidos;
  private javax.swing.JButton prepararEnvio;
  private javax.swing.JButton registrarNuevoProducto;
  // End of variables declaration//GEN-END:variables
}
