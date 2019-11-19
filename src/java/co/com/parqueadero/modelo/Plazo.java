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
@Table(name = "plazo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plazo.findAll", query = "SELECT p FROM Plazo p")
    , @NamedQuery(name = "Plazo.findById", query = "SELECT p FROM Plazo p WHERE p.id = :id")
    , @NamedQuery(name = "Plazo.findByTiempo", query = "SELECT p FROM Plazo p WHERE p.tiempo = :tiempo")
    , @NamedQuery(name = "Plazo.findByDescripcion", query = "SELECT p FROM Plazo p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Plazo.findByValor", query = "SELECT p FROM Plazo p WHERE p.valor = :valor")})
public class Plazo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tiempo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiempo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private int valor;

    public Plazo() {
    }

    public Plazo(Integer id) {
        this.id = id;
    }

    public Plazo(Integer id, Date tiempo, String descripcion, int valor) {
        this.id = id;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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
        if (!(object instanceof Plazo)) {
            return false;
        }
        Plazo other = (Plazo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.parqueadero.modelo.Plazo[ id=" + id + " ]";
    }
    
}
