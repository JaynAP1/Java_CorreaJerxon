package Clases;

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        if (cantidad < 0){
            System.out.println("No se pueden agregar cantidades negativas");
        }
        else {
            this.cantidad = cantidad;
        }
        if (precio < 0){
            System.out.println("El precio debe ser mayor a cero");
            this.precio = 1;
        }
        else {
            this.precio = precio;
        }
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0){
            System.out.println("No se pueden agregar cantidades negativas");
        }
        else {
            this.cantidad = cantidad;
        }
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            System.out.println("El precio debe ser mayor a cero");
        }
        else {
            this.precio = precio;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public void mostrarinformacion() {
        System.out.println("Codigo del producto: " + codigo);
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Cantidad del producto: " + cantidad);
        System.out.println("Precio del producto: " + precio);
    }

    public void actualizarStock(int cantidadParametro){
        if (cantidadParametro > 0){
            this.cantidad += cantidadParametro;
        }
        else {
            cantidadParametro = -(cantidadParametro);
            if (cantidadParametro > this.cantidad){
                System.out.println("No se puede actualizar la cantidad ya que la cantidad que deseas supera el stock de: "+ getCantidad());
            }
            else {
                this.cantidad -= cantidadParametro;
            }
        }
    }

}
