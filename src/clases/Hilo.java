package clases;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Hilo extends Thread{
  private String nombreMoto;
  private double distancia;
  private JLabel motoLabel;
  private double velocidadMoto = 20;
  
  public Hilo(String nombreMoto, double distancia, JLabel motoLabel) {
    this.nombreMoto = nombreMoto;
    this.distancia = distancia;
    this.motoLabel = motoLabel;
  }
  

  @Override
    public void run() {
        moveMotoHorizontally();
    }
  
  private synchronized void moveMotoHorizontally() {
    System.out.println("a");
    int currentPositionX = 100;
    int targetPositionX = 800;                                                  // Assuming 'distancia' is the target position

    while (currentPositionX < targetPositionX) {
      currentPositionX += 5;                                                    
      motoLabel.setLocation(currentPositionX, motoLabel.getY());
      System.out.println(currentPositionX);
      try {
        Thread.sleep(25);                                                 
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    System.out.println("Entregando Comida");
    targetPositionX = 100;
    flipLabel(motoLabel);                                                   // Voltea la moto
    
    while (currentPositionX >= targetPositionX) {
      currentPositionX -= 5;                                                    
      motoLabel.setLocation(currentPositionX, motoLabel.getY());
      System.out.println(currentPositionX);
      try {
        Thread.sleep(25);                                                 
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  
  
  
  
private void flipLabel(JLabel label) {
    int w = label.getWidth();
    int h = label.getHeight();

    BufferedImage bufferedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = bufferedImage.createGraphics();

    // Flip the label horizontally
    AffineTransform transform = AffineTransform.getScaleInstance(-1, 1);
    transform.translate(-w, 0);
    g.setTransform(transform);

    // Draw the flipped label
    label.paint(g);
    g.dispose();

    // Set the flipped label as the new icon
    ImageIcon flippedIcon = new ImageIcon(bufferedImage);
    label.setIcon(flippedIcon);
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
