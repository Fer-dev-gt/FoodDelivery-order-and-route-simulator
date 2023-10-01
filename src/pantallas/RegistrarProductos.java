package pantallas;

import clases.Producto;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistrarProductos extends javax.swing.JFrame {

  public RegistrarProductos() {
    initComponents();
    
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    nombreProductoInput = new javax.swing.JTextField();
    precioProductoInput = new javax.swing.JTextField();
    registrarProducto = new javax.swing.JButton();
    regresarBtn = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Registrar nuevo producto");

    jLabel2.setText("Nombre:");

    jLabel3.setText("Precio:");

    registrarProducto.setText("Registrar producto");
    registrarProducto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        registrarProductoActionPerformed(evt);
      }
    });

    regresarBtn.setText("REGRESAR");
    regresarBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        regresarBtnActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(147, 147, 147)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(registrarProducto)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombreProductoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(precioProductoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE)))
            .addGap(36, 36, 36)
            .addComponent(regresarBtn)
            .addGap(23, 23, 23))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(41, 41, 41)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(regresarBtn))
        .addGap(78, 78, 78)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(nombreProductoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(32, 32, 32)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(precioProductoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(38, 38, 38)
        .addComponent(registrarProducto)
        .addContainerGap(71, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
    this.dispose();
    MainMenu menuPrincipal = new MainMenu();
    menuPrincipal.setVisible(true);
  }//GEN-LAST:event_regresarBtnActionPerformed

  private void registrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProductoActionPerformed
    try {
      String nombreProducto = nombreProductoInput.getText();
      double precioProducto = Double.parseDouble(precioProductoInput.getText());
      double precioProductoFormato = ((double) Math.round(precioProducto * 100)) / 100;
      
      boolean productoIsReapeated = checkearProductoRepetido(nombreProducto);
      
      if(productoIsReapeated){
        JOptionPane.showMessageDialog(null, "❌ El producto: "+ nombreProducto +" ya esta registrado, prueba con otro ❌", "Alert", JOptionPane.INFORMATION_MESSAGE);
        nombreProductoInput.setText("");
      } else {
        Producto productoNuevoRegistro = new Producto(nombreProducto, precioProductoFormato);
        MainMenu.arrayProductos.add(productoNuevoRegistro);
        JOptionPane.showMessageDialog(null, "✅ Se ingreso correctamente el producto ✅", "Alert", JOptionPane.INFORMATION_MESSAGE);
        imprimirNombreProductos();
        limpiarInputs();
      }
      
    } catch (Exception e){
      JOptionPane.showMessageDialog(null, "❌ Ingrese un numero en precio! ❌", "Alert", JOptionPane.INFORMATION_MESSAGE);
      precioProductoInput.setText("");
    }
    
    try {
      persistenciaProductosRestaurantes();
    } catch (IOException ex) {
      Logger.getLogger(RegistrarProductos.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_registrarProductoActionPerformed

  
  public static void persistenciaProductosRestaurantes() throws IOException {
    FileOutputStream archivoDeSalida = new FileOutputStream("/Users/fernandoorozco/Desktop/Productos_Restaurante.bin");
    ObjectOutputStream objectoOutput = new ObjectOutputStream(archivoDeSalida);
    objectoOutput.writeObject(MainMenu.arrayProductos);
    archivoDeSalida.close();
    objectoOutput.close();
    System.out.println("Se hizo PERSISTENCIA de Datos Productos");
  }
  
  
  public static boolean checkearProductoRepetido(String nombreProducto) {
    for (Producto producto :MainMenu.arrayProductos) {
      if (nombreProducto.equals(producto.getNombre())) return true;                                                            
    }
    return false;                                                               
  }

  
  public static void imprimirNombreProductos(){
    for(Producto producto :  MainMenu.arrayProductos) {
      System.out.println(producto.getNombre()+ ", precio: "+producto.getPrecio());
    }
  }
  
  
  public void limpiarInputs(){
    nombreProductoInput.setText("");
    precioProductoInput.setText("");
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
      java.util.logging.Logger.getLogger(RegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new RegistrarProductos().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JTextField nombreProductoInput;
  private javax.swing.JTextField precioProductoInput;
  private javax.swing.JButton registrarProducto;
  private javax.swing.JButton regresarBtn;
  // End of variables declaration//GEN-END:variables
}
