package com.romaqui.pos.dao.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.romaqui.pos.dao.GenericDao;
import com.romaqui.pos.modelo.ApiOutResponse;
import com.romaqui.pos.modelo.Maestra;

@Repository
public class GenericDaoImpl implements GenericDao{

	@Override
	public ApiOutResponse listarMaestra() {
		// SE LLAMA A LA BASE DE DATOS
		List<Maestra> lista = new ArrayList<>();
		//SE LLAMA A DB
		
		ApiOutResponse out = new ApiOutResponse();
		out.setrCodigo(1);
		out.setrMensaje("OK");
		out.setObjeto(lista);
		return out;
	}
	
	

}
