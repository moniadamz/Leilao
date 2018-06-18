/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.EventListener;


public interface CadastroListener extends EventListener{
    void elementoAdicionado(CadastroEvent evt);
}
