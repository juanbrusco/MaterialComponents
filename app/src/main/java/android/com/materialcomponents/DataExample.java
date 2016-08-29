package android.com.materialcomponents;

/**
 * Created by juan.brusco on 29/08/2016.
 */
public class DataExample {
    private int imagen;
    private String nombre;
    private String detalle;

    public DataExample(int imagen, String nombre, String detalle) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.detalle = detalle;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public int getImagen() {
        return imagen;
    }
}
