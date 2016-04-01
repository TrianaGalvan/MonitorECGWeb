package com.monitorecg.hibernate.entities;
// Generated 16-mar-2016 13:26:37 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Reporte generated by hbm2java
 */
public class Reporte  implements java.io.Serializable {


     private int idReporte;
     private String observaciones;
     private String recomendaciones;
     private Integer estatus;
     private Cardiologo cardiologo;

    public Reporte() {
    }

	
    public Reporte(int id) {
        this.idReporte = id;
    }
    public Reporte(int id, String observaciones, String recomendaciones, Integer estatus) {
       this.idReporte = id;
       this.observaciones = observaciones;
       this.recomendaciones = recomendaciones;
       this.estatus = estatus;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }
   
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getRecomendaciones() {
        return this.recomendaciones;
    }
    
    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }
    public Integer getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    public Cardiologo getCardiologo() {
        return cardiologo;
    }

    public void setCardiologo(Cardiologo cardiologo) {
        this.cardiologo = cardiologo;
    }

}


