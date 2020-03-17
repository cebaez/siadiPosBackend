package com.romaqui.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.romaqui.pos.modelo.ApiOutResponse;
import com.romaqui.pos.service.GenericService;

@RestController
@RequestMapping("/generic")
public class GenericController {

	@Autowired
	GenericService genericService;

	@PostMapping("/listarMaestra")
	public HttpEntity<ApiOutResponse> listarMaestra() {
		HttpEntity<ApiOutResponse> entity = genericService.listarMaestra();
		return entity;
	}

}
