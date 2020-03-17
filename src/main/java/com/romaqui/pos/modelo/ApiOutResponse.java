package com.romaqui.pos.modelo;

import java.io.Serializable;

public class ApiOutResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer rCodigo;
	private String rMensaje;
	private Object objeto;

	public ApiOutResponse() {
	}

	public ApiOutResponse(Integer rCodigo, String rMensaje, Object objeto) {
		this.rCodigo = rCodigo;
		this.rMensaje = rMensaje;
		this.objeto = objeto;
	}

	public Integer getrCodigo() {
		return rCodigo;
	}

	public void setrCodigo(Integer rCodigo) {
		this.rCodigo = rCodigo;
	}

	public String getrMensaje() {
		return rMensaje;
	}

	public void setrMensaje(String rMensaje) {
		this.rMensaje = rMensaje;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

}
