/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.parqueadero.controlador;

import co.com.parqueadero.modelo.Modalidad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jhonatan
 */
@Stateless
public class ModalidadFacade extends AbstractFacade<Modalidad> {

    @PersistenceContext(unitName = "parqueaderoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ModalidadFacade() {
        super(Modalidad.class);
    }
    
}
