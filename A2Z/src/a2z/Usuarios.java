
package a2z;

import java.util.Date;

/**
 * Clase de los usuarios que no son admin
 * @author marcos
 * @version final
 */
public class Usuarios {
    private int coduser;
    private String nombre;
    private Date fecha;

    /**
     * Contructor para añadir usuarios que no son admin
     * @param coduser
     * @param nombre
     * @param fecha
     */
    public Usuarios(int coduser, String nombre, Date fecha) {
        this.coduser = coduser;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    /**
     * Devuelve el coodigo del usario que no es admin
     * @return int con el codigo de usario
     */
    public int getCoduser() {
        return coduser;
    }

    /**
     * Cambiar el codigo del usario que no es admin
     * @param coduser
     */
    public void setCoduser(int coduser) {
        this.coduser = coduser;
    }

    /**
     * Devuelve el nombre del usaruario que no es admin
     * @return un string con el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambiar el nombre del usuario que no es admin
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la fecha del usario que no es admin
     * @return date con la fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Cambiar la fecha del usario que no es admin
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
