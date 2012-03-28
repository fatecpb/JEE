/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teleentrega;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Rafael Augusto
 */
@Remote
public interface GestorUsuarioRemote {
    
    public List<Object> listUsuario();
    
}
