package com.tecsup.cloudinaryBACK.dto;

import java.util.Date;

public class ProductoDto {
    
    private String producto;
    private String descripcion;
    private Float precio;
    private Date fechaVencimiento;
    private String imagenUrl;
    
    public ProductoDto() {
    }

    public ProductoDto( String producto,String descripcion, Float precio, Date fechaVencimiento, String imagenUrl) {
        this.producto = producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.imagenUrl = imagenUrl;
    }

    public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getImagenUrl() {
		return imagenUrl;
	}

	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}
    
}
