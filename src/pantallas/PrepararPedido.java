package pantallas;

import clases.Motocicleta;
import clases.Pedido;
import clases.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrepararPedido extends javax.swing.JFrame {
  public static ArrayList<Pedido> arrayPedidos = new ArrayList<>();
  public static ArrayList<Producto> arrayOrdenActual = new ArrayList<>();
  double distanciaPedido = 0;
  double totalOrdenPedido = 0;
  

  public PrepararPedido() {
    initComponents();
    MostrarProductosYPedidosTabla();
    actualizarComboBoxMotocicletas();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    totalOrdenLabel = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    listaMotocicletas = new javax.swing.JComboBox<>();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaPedidos = new javax.swing.JTable();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablaProductos = new javax.swing.JTable();
    confirmarPedido = new javax.swing.JButton();
    AgregarProducto = new javax.swing.JButton();
    regresarBtn = new javax.swing.JButton();
    distanciaRecorrido = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Productos");

    jLabel2.setText("Pedidos");

    jLabel3.setText("Total: ");

    totalOrdenLabel.setText("0.00");

    jLabel5.setText("Vehiculo");

    jLabel6.setText("Distancia a recorrer:");

    jLabel7.setText("Km");

    listaMotocicletas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null},
        {null, null},
        {null, null},
        {null, null}
      },
      new String [] {
        "Producto", "Precio"
      }
    ));
    jScrollPane1.setViewportView(tablaPedidos);

    tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null},
        {null, null},
        {null, null},
        {null, null}
      },
      new String [] {
        "Producto", "Precio"
      }
    ));
    jScrollPane2.setViewportView(tablaProductos);

    confirmarPedido.setText("Confirma pedido");
    confirmarPedido.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        confirmarPedidoActionPerformed(evt);
      }
    });

    AgregarProducto.setText("Agregar Producto Seleccionado");
    AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AgregarProductoActionPerformed(evt);
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
        .addGap(107, 107, 107)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel2)
        .addGap(207, 207, 207))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(regresarBtn))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(72, 72, 72)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(97, 97, 97)
                .addComponent(listaMotocicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addComponent(distanciaRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 482, Short.MAX_VALUE)
            .addComponent(confirmarPedido)
            .addGap(32, 32, 32))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(totalOrdenLabel)))))
        .addGap(31, 31, 31))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(37, 37, 37)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(524, Short.MAX_VALUE)))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(69, 69, 69)
          .addComponent(AgregarProducto)
          .addContainerGap(681, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addComponent(regresarBtn)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jLabel2))
        .addGap(38, 38, 38)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(42, 42, 42)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(totalOrdenLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(listaMotocicletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(60, 60, 60)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(jLabel7)
              .addComponent(distanciaRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(75, 75, 75))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(confirmarPedido)
            .addGap(62, 62, 62))))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(116, 116, 116)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(320, Short.MAX_VALUE)))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
          .addContainerGap(430, Short.MAX_VALUE)
          .addComponent(AgregarProducto)
          .addGap(250, 250, 250)))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
    arrayOrdenActual.clear();
    System.out.println("🥲 Se borraron los datos de la orden actual 🥲");
    this.dispose();
    MainMenu menuPrincipal = new MainMenu();
    menuPrincipal.setVisible(true);
  }//GEN-LAST:event_regresarBtnActionPerformed

  private void AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductoActionPerformed
    try {
      int IndexProductoSeleccionado = seleccionarProducto();
      String nombreProductoOrden = MainMenu.arrayProductos.get(IndexProductoSeleccionado).getNombre();
      double precioProductoOrden = MainMenu.arrayProductos.get(IndexProductoSeleccionado).getPrecio();
      Producto nuevaOrden = new Producto(nombreProductoOrden, precioProductoOrden);
      arrayOrdenActual.add(nuevaOrden);
      System.out.println("✅ Se agrego la orden ✅");
      actualizarTotalDelPedido();
    } catch (IndexOutOfBoundsException e) {
      JOptionPane.showMessageDialog(null, "❌ Seleccione una fila de productos! ❌", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
    
    MostrarProductosYPedidosTabla();
  }//GEN-LAST:event_AgregarProductoActionPerformed

  private void confirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarPedidoActionPerformed
    boolean distanciaEsValida = verificarDistanciaRecorrido();
    if(!distanciaEsValida) return;
    if(!arrayOrdenActual.isEmpty()){
      crearEnvioDePedido();
      arrayOrdenActual.clear();
      totalOrdenLabel.setText("0.00");
      distanciaRecorrido.setText("");
      try {
        String motoSeleccionada = listaMotocicletas.getSelectedItem().toString();
        quitarMotoReservada(motoSeleccionada);
      } catch (NullPointerException e){
        System.out.println("Espera a que las motos esten libres");
      }
      distanciaPedido = 0;
      totalOrdenPedido = 0;
      actualizarComboBoxMotocicletas();
      JOptionPane.showMessageDialog(null, "✅ Se confirmo el pedido ✅", "Alert", JOptionPane.INFORMATION_MESSAGE);
      MostrarProductosYPedidosTabla();
      cerrarVentanaSiYaNoHayMotos();
    } else {
      JOptionPane.showMessageDialog(null, "❌ El pedido tiene que tener minimo un producto agregado ❌", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_confirmarPedidoActionPerformed

  
  
  public void crearEnvioDePedido(){
    String motoSeleccionada = listaMotocicletas.getSelectedItem().toString();
    Pedido nuevoPedido = new Pedido(motoSeleccionada, distanciaPedido,totalOrdenPedido);
    SeguirEnvios.arrayPedidosPorEnviar.add(nuevoPedido);
    
    
    System.out.println("PEDIDOS POR ENVIAR");
    for (Pedido p : SeguirEnvios.arrayPedidosPorEnviar) {    
      System.out.println(p.getVehiculo()+", "+ p.getDistancia() +", "+p.getMonto());
    }
  }
  
  
  public void MostrarProductosYPedidosTabla(){
    // Tabla de los productos disponbles
    tablaProductos.setAutoCreateRowSorter(true); 
    DefaultTableModel modelProductos = new DefaultTableModel();                                  
    modelProductos.setColumnIdentifiers(new String[] {"Nombre", "Precio (Q)"});
    
    for (Producto producto : MainMenu.arrayProductos) {                                         
      Object[] rowData = new Object[] {
        producto.getNombre(),
        producto.getPrecio(),
      };
      modelProductos.addRow(rowData);
    }
    
    tablaProductos.setModel(modelProductos);                                                          
    System.out.println("Se actualizaron las filas de los Productos");
    
    
    // Tabla de los pedidos por hacer PENDIENTE
    tablaPedidos.setAutoCreateRowSorter(true); 
    DefaultTableModel modelPedidos = new DefaultTableModel();                                  
    modelPedidos.setColumnIdentifiers(new String[] {"Nombre", "Precio (Q)"});
    
    for (Producto pedido : arrayOrdenActual) {                                         
      Object[] rowData = new Object[] {
        pedido.getNombre(),
        pedido.getPrecio(),
      };
      modelPedidos.addRow(rowData);
    }
    
    tablaPedidos.setModel(modelPedidos);                                                          
    System.out.println("Se actualizaron las filas de los Pedidos");
  }
 
  
  public int seleccionarProducto(){
      int selectedRow = tablaProductos.getSelectedRow();                                                       // Obtenemos el index de la fila que esta siendo seleccionada

      if (selectedRow >= 0) {                                                                                   // Validamos que una fila esta siendo seleccionada
        String nombreProducto = (String) tablaProductos.getValueAt(selectedRow, 0);                          
        System.out.println("Producto seleccionado: " + nombreProducto);
        int indexProductoArray = encontrarIndexProductoSeleccionado(nombreProducto);
        System.out.println("Index: " +indexProductoArray);
        return indexProductoArray;
        //persistenciaDatosPedidos();                           // IMPORTANTE
      } else {
        System.out.println("No row selected");
        return -1;
      }
  }
  
  
  private int encontrarIndexProductoSeleccionado(String nombreProducto) {
    for (int i = 0; i < MainMenu.arrayProductos.size(); i++) {
      Producto profesor = MainMenu.arrayProductos.get(i);
      if (profesor.getNombre().equals(nombreProducto)) return i;                         // Regresa el index del producto que encontró e hizo match
    }
    return -1;                                                                                  // Si retorna -1 es porque no encontro al producto
  }
  
  
  public  void actualizarTotalDelPedido(){
    double totalOrdenActual = 0;
    for (Producto producto : arrayOrdenActual) {    
      totalOrdenActual += producto.getPrecio();
    }
    totalOrdenPedido = totalOrdenActual;
    totalOrdenLabel.setText(String.valueOf(totalOrdenActual));
  }
  
  
  public void actualizarComboBoxMotocicletas() {
    listaMotocicletas.removeAllItems();
    for (Motocicleta moto : MainMenu.arrayMotocicleta) {
      if(moto.isEstaDisponible() == true)     listaMotocicletas.addItem(moto.getNombre());
    }
  }
  
  
  public void quitarMotoReservada(String motoEnviadaPedido){
    for (Motocicleta moto : MainMenu.arrayMotocicleta) {
      if(motoEnviadaPedido.equals(moto.getNombre()))    moto.setEstaDisponible(false);
    }
  }
 
  
  public void cerrarVentanaSiYaNoHayMotos(){
    if(listaMotocicletas.getItemCount() == 0){
      JOptionPane.showMessageDialog(null, "😎 Todas las motos estan ocupadas, no se puede enviar más ordenes por ahora 😎", "Alert", JOptionPane.INFORMATION_MESSAGE);
      this.dispose();
      MainMenu menuPrincipal = new MainMenu();
      menuPrincipal.setVisible(true);
    }
  }
  
  
  public boolean verificarDistanciaRecorrido(){
    try {
      double distancia = Double.parseDouble (distanciaRecorrido.getText());
      if(distancia > 0 && distancia <= 10) {
        distanciaPedido = distancia;
        return true;
      } else {
        JOptionPane.showMessageDialog(null, "❌ Ingrese la distancia del viaje (Entre 1 a 10 Km) ❌", "Alert", JOptionPane.INFORMATION_MESSAGE);
      }
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "❌ Ingrese la distancia del viaje (Entre 1 a 10 Km) ❌", "Alert", JOptionPane.INFORMATION_MESSAGE);
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
      java.util.logging.Logger.getLogger(PrepararPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PrepararPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PrepararPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PrepararPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> {
      new PrepararPedido().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton AgregarProducto;
  private javax.swing.JButton confirmarPedido;
  private javax.swing.JTextField distanciaRecorrido;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JComboBox<String> listaMotocicletas;
  private javax.swing.JButton regresarBtn;
  private javax.swing.JTable tablaPedidos;
  private javax.swing.JTable tablaProductos;
  private javax.swing.JLabel totalOrdenLabel;
  // End of variables declaration//GEN-END:variables
}
