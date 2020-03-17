package com.romaqui.pos.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import com.romaqui.pos.dao.GenericDao;
import com.romaqui.pos.modelo.ApiOutResponse;
import com.romaqui.pos.service.GenericService;

@Service
public class GenericServiceImpl implements GenericService{

	@Autowired
	GenericDao genericDao;
	
	@Override
	public HttpEntity<ApiOutResponse> listarMaestra() {
		ApiOutResponse out = genericDao.listarMaestra();
		
		HttpEntity<ApiOutResponse> entity = new HttpEntity<>(out);
		return entity;
	}
	
	

}
