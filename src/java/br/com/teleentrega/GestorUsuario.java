/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teleentrega;

import java.util.*;
import javax.ejb.Stateful;

/**
 *
 * @author Rafael Augusto
 */
@Stateful
public class GestorUsuario implements GestorUsuarioRemote {


    @Override
    public List<Object> listUsuario() {
        List<Object> lista = new ArrayList<Object>();
        lista.add(new Object());
        lista.add(new Object());
        lista.add(new Object());
        
        return lista;
    }

    // comentarios
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
