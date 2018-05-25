/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ronald
 */
public class User {
    
    private int codigo;
    private String correo;
    private String pasword;

    public User() {
    }
    
    public User(int codigo, String correo, String pasword) {
        this.codigo = codigo;
        this.correo = correo;
        this.pasword = pasword;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
}
