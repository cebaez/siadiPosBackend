package com.romaqui.pos.service;


import org.springframework.http.HttpEntity;
import com.romaqui.pos.modelo.ApiOutResponse;

public interface GenericService {

	public HttpEntity<ApiOutResponse> listarMaestra();
}
