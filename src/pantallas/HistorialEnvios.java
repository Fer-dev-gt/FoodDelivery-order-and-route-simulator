package pantallas;

import clases.Hilo;
import clases.Pedido;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class HistorialEnvios extends javax.swing.JFrame {

  public HistorialEnvios() {
    initComponents();
    MostrarHistorialPedidos();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaHistorialPedidos = new javax.swing.JTable();
    regresarBtn = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Historial de Pedidos");

    tablaHistorialPedidos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "Vehiculo", "Distancia", "Monto", "Fecha y hora de creación", "Title Fecha y hora de entrega5"
      }
    ));
    jScrollPane1.setViewportView(tablaHistorialPedidos);

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
        .addGap(426, 426, 426)
        .addComponent(jLabel1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(53, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(49, 49, 49))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(regresarBtn)
            .addGap(443, 443, 443))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(39, 39, 39)
        .addComponent(jLabel1)
        .addGap(52, 52, 52)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
        .addComponent(regresarBtn)
        .addGap(45, 45, 45))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
    this.dispose();
    MainMenu menuPrincipal = new MainMenu();
    menuPrincipal.setVisible(true);
  }//GEN-LAST:event_regresarBtnActionPerformed

  
  public void MostrarHistorialPedidos() {
    tablaHistorialPedidos.setAutoCreateRowSorter(true); 
    DefaultTableModel modelProductos = new DefaultTableModel();                                  
    modelProductos.setColumnIdentifiers(new String[] {"Vehiculo", "Distancia (km)", "Monto (Q)", "Fecha y Hora de Creación", "Fecha y Hora de Entrega"});
    
    for (Pedido pedidoTerminado : Hilo.arrayPedidosTerminados) {                                         
      Object[] rowData = new Object[] {
        pedidoTerminado.getVehiculo(),
        pedidoTerminado.getDistancia() + " km",
        "Q "+ pedidoTerminado.getMonto(),
        pedidoTerminado.getFechaHoraCreacion(),
        pedidoTerminado.getFechaHoraEntrega()
      };
      modelProductos.addRow(rowData);
    }
    
    tablaHistorialPedidos.setModel(modelProductos);                                                          
    System.out.println("Se actualizaron las filas de los pedidos ya terminados");
  }
  
  
  public static void recuperarHistorialPedidos() {
    try {
      FileInputStream archivoBinario = new FileInputStream("/Users/fernandoorozco/Desktop/Historial_Pedidos.bin");
      ObjectInputStream objetoInput = new ObjectInputStream(archivoBinario);
      ArrayList<Pedido> ordenesEnviadas = (ArrayList<Pedido>) objetoInput.readObject();
      System.out.println("Se recuperaron: " + ordenesEnviadas.size() + " registros de Historial de Pedidos");
      
      for (Pedido ordenEnviada : ordenesEnviadas) {
        String horaInicioViaje = ordenEnviada.getFechaHoraCreacion();
        String horaFinalViaje = ordenEnviada.getFechaHoraEntrega();
        boolean isRepeated = checkearHistorialRepetido(horaInicioViaje, horaFinalViaje);
        if(isRepeated) {
          System.out.println("No se Registro dato repetido");
          continue;
        }
        System.out.println(ordenEnviada.getFechaHoraCreacion());
        Hilo.arrayPedidosTerminados.add(ordenEnviada);
      }
      
      archivoBinario.close();
      objetoInput.close();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Error al recuperar Historial de Pedidos Completados: " + e.getMessage());
    }
  }
  
  
  public static boolean checkearHistorialRepetido(String horaInicioViaje, String horaFinalViaje) {
    for (Pedido producto : Hilo.arrayPedidosTerminados) {
      if (producto.getFechaHoraCreacion().equals(horaInicioViaje) && producto.getFechaHoraEntrega().equals(horaFinalViaje)) return true;                     
    }
    return false;                                                                 
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
      java.util.logging.Logger.getLogger(HistorialEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(HistorialEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(HistorialEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(HistorialEnvios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new HistorialEnvios().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton regresarBtn;
  private javax.swing.JTable tablaHistorialPedidos;
  // End of variables declaration//GEN-END:variables
}
