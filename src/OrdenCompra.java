import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int ultimoID;
    private int indiceProductos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++ultimoID;
        this.productos = new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto){
        if (indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        }
    }

    public int getTotal(){
        int total = 0;
        for (Producto p : productos){
            total += p.getPrecio();
        }
        return total;
    }
}
