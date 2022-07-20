package com.empresa.proyecto.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.proyecto.dto.response.EmpresaListarResponse;
import com.empresa.proyecto.dto.response.OutResponse;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping(value = "/index")
	public String index() {
		log.info("[INDEX][CONTROLLER][INICIO]");
		String out = "Hola";
		log.info("[INDEX][CONTROLLER][FIN]");
		return out;
	}

	@PostMapping(value = "/listarEmpresa")
	public OutResponse<List<EmpresaListarResponse>> listarEmpresa() {
		log.info("[INDEX][CONTROLLER][INICIO]");
		OutResponse<List<EmpresaListarResponse>> out = new OutResponse<>();
		List<EmpresaListarResponse> lista = new ArrayList<>();
		EmpresaListarResponse obj = new EmpresaListarResponse();
		obj.setId(1L);
		obj.setNombre("MIMP");
		obj.setDescripcion("Miniterio");
		lista.add(obj);
		out.setObjeto(lista);
		out.setRcodigo(0);
		out.setRmensaje("EXITO");

		log.info("[INDEX][CONTROLLER][FIN]");
		return out;
	}

}
