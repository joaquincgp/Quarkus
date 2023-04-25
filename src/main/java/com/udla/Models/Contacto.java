package com.udla.Models;

public class Contacto {
    private int idContact;
    private String name;
    private String cedula;
    private String number;
    private String address;
    
    public Contacto(String name, String cedula, String number, String address) {
        this.name = name;
        this.cedula = cedula;
        this.number = number;
        this.address = address;
    }
    


    public Contacto() {
    }



    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getCedula() {
        return cedula;
    }



    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
}
