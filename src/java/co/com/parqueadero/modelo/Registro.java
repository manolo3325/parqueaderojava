/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.parqueadero.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jhonatan
 */
@Entity
@Table(name = "registro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r")
    , @NamedQuery(name = "Registro.findById", query = "SELECT r FROM Registro r WHERE r.id = :id")
    , @NamedQuery(name = "Registro.findByFechaEntrada", query = "SELECT r FROM Registro r WHERE r.fechaEntrada = :fechaEntrada")
    , @NamedQuery(name = "Registro.findByPlacaVehiculos", query = "SELECT r FROM Registro r WHERE r.placaVehiculos = :placaVehiculos")
    , @NamedQuery(name = "Registro.findByHoraEntrada", query = "SELECT r FROM Registro r WHERE r.horaEntrada = :horaEntrada")
    , @NamedQuery(name = "Registro.findByHoraSalida", query = "SELECT r FROM Registro r WHERE r.horaSalida = :horaSalida")
    , @NamedQuery(name = "Registro.findByValor", query = "SELECT r FROM Registro r WHERE r.valor = :valor")
    , @NamedQuery(name = "Registro.findByDescripcion", query = "SELECT r FROM Registro r WHERE r.descripcion = :descripcion")
    , @NamedQuery(name = "Registro.findByIdUsuario", query = "SELECT r FROM Registro r WHERE r.idUsuario = :idUsuario")
    , @NamedQuery(name = "Registro.findByIdObjetos", query = "SELECT r FROM Registro r WHERE r.idObjetos = :idObjetos")})
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_entrada")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "placa_vehiculos")
    private String placaVehiculos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_entrada")
    @Temporal(TemporalType.TIME)
    private Date horaEntrada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_salida")
    @Temporal(TemporalType.TIME)
    private Date horaSalida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private int valor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private int idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_objetos")
    private int idObjetos;

    public Registro() {
    }

    public Registro(Integer id) {
        this.id = id;
    }

    public Registro(Integer id, Date fechaEntrada, String placaVehiculos, Date horaEntrada, Date horaSalida, int valor, String descripcion, int idUsuario, int idObjetos) {
        this.id = id;
        this.fechaEntrada = fechaEntrada;
        this.placaVehiculos = placaVehiculos;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.valor = valor;
        this.descripcion = descripcion;
        this.idUsuario = idUsuario;
        this.idObjetos = idObjetos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getPlacaVehiculos() {
        return placaVehiculos;
    }

    public void setPlacaVehiculos(String placaVehiculos) {
        this.placaVehiculos = placaVehiculos;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdObjetos() {
        return idObjetos;
    }

    public void setIdObjetos(int idObjetos) {
        this.idObjetos = idObjetos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.parqueadero.modelo.Registro[ id=" + id + " ]";
    }
    
}
