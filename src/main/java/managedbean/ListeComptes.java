/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managedbean;

import com.loubarisziyad.tp4loubarisziyad.ejb.GestionnaireCompte;
import com.loubarisziyad.tp4loubarisziyad.entities.CompteBancaire;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author ziyad
 */
@Named(value = "listeComptes")
@ViewScoped
public class ListeComptes implements Serializable {

    private List<CompteBancaire> comptesBancaires;
    @EJB
    private GestionnaireCompte gestionnaireCompte;
    /**
     * Creates a new instance of ListeComptes
     */
    public ListeComptes() {
    }
    
    public List<CompteBancaire> getAllComptes(){
        if(comptesBancaires == null){
            comptesBancaires=gestionnaireCompte.getAllComptes();
        }
        return comptesBancaires;
    }
}
