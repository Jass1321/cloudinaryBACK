package com.tecsup.cloudinaryBACK.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Imagen {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String imagenUrl;
    private String imagenId;
   
    public Imagen() {
    	
    }

	public Imagen(String name, String imagenUrl, String imagenId) {
		super();
		this.name = name;
        this.imagenUrl = imagenUrl;
        this.imagenId = imagenId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getImagenId() {
        return imagenId;
    }

    public void setImagenId(String imagenId) {
        this.imagenId = imagenId;
    }
}
