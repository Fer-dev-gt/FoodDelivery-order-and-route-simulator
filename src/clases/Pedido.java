package clases;
import java.time.LocalDateTime;

public class Pedido {
  private int numeroDeOrden;
  private String vehiculo;
  private double distancia;
  private double monto;
  private LocalDateTime fechaHoraCreacion; 
  private LocalDateTime fechaHoraEntrega; 


  public Pedido(String vehiculo, double distancia, double monto) {
    this.vehiculo = vehiculo;
    this.distancia = distancia;
    this.monto = monto;
  }

  public String getVehiculo() {
    return vehiculo;
  }

  public void setVehiculo(String vehiculo) {
    this.vehiculo = vehiculo;
  }

  public double getDistancia() {
    return distancia;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }

  public double getMonto() {
    return monto;
  }

  public int getNumeroDeOrden() {
    return numeroDeOrden;
  }

  public void setNumeroDeOrden(int numeroDeOrden) {
    this.numeroDeOrden = numeroDeOrden;
  }

  public void setMonto(double monto) {
    this.monto = monto;
  }

  public LocalDateTime getFechaHoraCreacion() {
    return fechaHoraCreacion;
  }

  public void setFechaHoraCreacion(LocalDateTime fechaHoraCreacion) {
    this.fechaHoraCreacion = fechaHoraCreacion;
  }

  public LocalDateTime getFechaHoraEntrega() {
    return fechaHoraEntrega;
  }

  public void setFechaHoraEntrega(LocalDateTime fechaHoraEntrega) {
    this.fechaHoraEntrega = fechaHoraEntrega;
  }
  
  


  
  @Override
  public String toString() {
      return "Pedido{" +
              "vehiculo='" + vehiculo + '\'' +
              ", distancia=" + distancia +
              ", monto=" + monto +
              ", fechaYHora=" + fechaHoraCreacion +
                '}';
    }
}
