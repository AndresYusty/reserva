package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.VueloService;

@RestController
@RequestMapping()
public class reservaController {

	@Autowired
	private reservaService reservaService;
}
