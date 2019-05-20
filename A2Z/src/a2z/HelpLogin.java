/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2z;

/**
 *
 * @author marek
 */
public class HelpLogin {
    
    private int coduser;
    private int admin;

    public HelpLogin(int coduser, int admin) {
        this.coduser = coduser;
        this.admin = admin;
    }

    public int getCoduser() {
        return coduser;
    }

    public void setCoduser(int coduser) {
        this.coduser = coduser;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
    
    
    
    
}
