/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package com.loubarisziyad.tp4loubarisziyad.ejb;

import com.loubarisziyad.tp4loubarisziyad.entities.CompteBancaire;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author ziyad
 */
@Singleton
@Startup
public class Init {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @EJB
    private GestionnaireCompte gestionnaireCompte;
    
    @PostConstruct
    public void creationBatles(){
        if(gestionnaireCompte.nbCompte()==0){
            gestionnaireCompte.creerCompte(new CompteBancaire("John Lennon",150000));
            gestionnaireCompte.creerCompte(new CompteBancaire("Paul McCartney",950000));
            gestionnaireCompte.creerCompte(new CompteBancaire("Ringo Starr",20000));
            gestionnaireCompte.creerCompte(new CompteBancaire("Georges Harrisson",100000));
        }
    }
    
}
