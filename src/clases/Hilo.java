package clases;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JButton;

public class Hilo extends Thread{
  private String nombreMoto;
  private double distancia;
  private double montoOrden;
  private JLabel motoLabel;
  private JButton botonMoto;
  private double velocidadMoto = 20;
  public static ArrayList<Pedido> arrayPedidosTerminados = new ArrayList<>(); 
  
  public Hilo(String nombreMoto, double distancia, double montoOrden,JLabel motoLabel, JButton botonMoto) {
    this.nombreMoto = nombreMoto;
    this.montoOrden = montoOrden;
    this.distancia = distancia;
    this.motoLabel = motoLabel;
    this.botonMoto = botonMoto;
  }
  
  public Hilo(String nombreMoto, double distancia, double montoOrden,JLabel motoLabel) {
    this.nombreMoto = nombreMoto;
    this.montoOrden = montoOrden;
    this.distancia = distancia;
    this.motoLabel = motoLabel;
  }

  @Override
  public void run() {
    moveMotoHorizontally();
  }
  
  private synchronized void moveMotoHorizontally() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy - HH:mm:ss");
    
    LocalDateTime startTime = LocalDateTime.now();
    String FechaHoraInicio = startTime.format(formatter);
    System.out.println("Start Time: " + FechaHoraInicio);
    
    
    double currentPositionX = 100;
    int targetPositionX = 800;                                                  

    while (currentPositionX < targetPositionX) {
      currentPositionX += 5/distancia;                                                    
      motoLabel.setLocation((int) currentPositionX, motoLabel.getY());
      try {
        Thread.sleep(5);                                                 
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    System.out.println("Comida entregada, REGRESANDO");
    targetPositionX = 100;
    flipLabel(motoLabel, true);                                                   
    
    while (currentPositionX >= targetPositionX) {
      currentPositionX -= 5/distancia;                                                    
      motoLabel.setLocation((int) currentPositionX, motoLabel.getY());
      try {
        Thread.sleep(5);                                                 
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
        
    flipLabel(motoLabel, true); 
    System.out.println("VIAJE FINALIZADO");
    this.botonMoto.setEnabled(true);
    
    LocalDateTime endTime = LocalDateTime.now();
    String FechaHoraFinal = endTime.format(formatter);
    System.out.println("End Time: " + FechaHoraFinal);
    
    
    Pedido pedidoTerminado = new Pedido(this.nombreMoto, this.distancia,this.montoOrden,FechaHoraInicio, FechaHoraFinal);
    arrayPedidosTerminados.add(pedidoTerminado);
  }
  
  
  

  private void flipLabel(JLabel motoLabel, boolean flip) {
    int weight = motoLabel.getWidth();
    int height = motoLabel.getHeight();

    BufferedImage bufferedImage = new BufferedImage(weight, height, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = bufferedImage.createGraphics();

    if (flip) {
      AffineTransform transform = AffineTransform.getScaleInstance(-1, 1);
      transform.translate(-weight, 0);
      g.setTransform(transform);
    }

    motoLabel.paint(g);
    g.dispose();

    ImageIcon flippedIcon = new ImageIcon(bufferedImage);
    motoLabel.setIcon(flippedIcon);
  }
  
  
  
  public String getNombreMoto() {
    return nombreMoto;
  }

  public void setNombreMoto(String nombreMoto) {
    this.nombreMoto = nombreMoto;
  }

  public double getDistancia() {
    return distancia;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }
}
