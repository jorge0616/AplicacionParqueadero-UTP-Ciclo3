package com.ruta3.parking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "RegistroVehiculos")
public class RegistroVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column()
    private Long cedula;

    @Column(length = 10, nullable = false)
    private String placa;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaEntrada;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaSalida;

    @ManyToOne
    @JoinColumn(name = "tipoServicio")
    private Servicio servicio;

    @Column
    private int valorAPagar;

    public RegistroVehiculo() {
    }

    public RegistroVehiculo(Long cedula, String placa, Date fechaEntrada, Date fechaSalida, Servicio servicio, int valorAPagar) {
        this.cedula = cedula;
        this.placa = placa;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.servicio = servicio;
        this.valorAPagar = valorAPagar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(int valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

}
