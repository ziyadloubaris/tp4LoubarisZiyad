/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.loubarisziyad.tp4loubarisziyad.ejb;

import com.loubarisziyad.tp4loubarisziyad.entities.CompteBancaire;
import java.util.List;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author ziyad
 */
@DataSourceDefinition (
    className="com.mysql.cj.jdbc.MysqlDataSource",
    name="java:app/jdbc/banque",
    serverName="localhost",
    portNumber=3306,
    user="root",
    password="root",
    databaseName="banque",
    properties = {
      "useSSL=false",
      "allowPublicKeyRetrieval=true"
    }
)
@Stateless
public class GestionnaireCompte {

    @PersistenceContext(unitName = "banquePU")
    private EntityManager em;
    
    public void creerCompte(CompteBancaire c) {
         em.persist(c);
    }
    
    public List<CompteBancaire> getAllComptes(){
     
       // Query query = em.createNamedQuery("Customer.findAll");
    
        String s = "SELECT * FROM CompteBancaire";
        TypedQuery<CompteBancaire> query = em.createQuery(s, CompteBancaire.class);
    
        return query.getResultList();
    }
    public long nbCompte(){
         String s = "SELECT count(cp) FROM CompteBancaire cp";
        Query query = em.createQuery(s);
        long count = (long)query.getSingleResult();
        return count;
    }
}
