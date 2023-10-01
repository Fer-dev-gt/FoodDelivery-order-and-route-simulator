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
    int currentPositionX = 100;
    int targetPositionX = 800;                                                  // Assuming 'distancia' is the target position

    while (currentPositionX < targetPositionX) {
      currentPositionX += 5;                                                    
      motoLabel.setLocation(currentPositionX, motoLabel.getY());
      try {
        Thread.sleep(10);                                                 
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    System.out.println("Entregando Comida");
    targetPositionX = 100;
    flipLabel(motoLabel, true);                                                   
    
    while (currentPositionX >= targetPositionX) {
      currentPositionX -= 5;                                                    
      motoLabel.setLocation(currentPositionX, motoLabel.getY());
      try {
        Thread.sleep(10);                                                 
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
        
    flipLabel(motoLabel, true); 
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
