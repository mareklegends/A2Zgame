
package a2z;

/**
 * Clase de java para la gestion si un usario es admin o no
 * @author marcos
 */
public class HelpLogin {
    
    private int coduser;
    private int admin;

    /**
     * Solo se utiliza este constructor para mandar a un usario a una venta o a otra
     * @param coduser
     * @param admin
     */
    public HelpLogin(int coduser, int admin) {
        this.coduser = coduser;
        this.admin = admin;
    }

    /**
     * Obtener el codigo de usario
     * @return devuelve una variable int con el codigo de usario
     */
    public int getCoduser() {
        return coduser;
    }

    /**
     * Añadir el codigo de usario
     * @param coduser
     */
    public void setCoduser(int coduser) {
        this.coduser = coduser;
    }

    /**
     * Obtener si un usario es admin o no
     * @return devuelve una variable int que dice si es admin o no
     */
    public int getAdmin() {
        return admin;
    }

    /**
     * Añadir si un suario es admin o noi
     * @param admin
     */
    public void setAdmin(int admin) {
        this.admin = admin;
    }
    
    
    
    
}
