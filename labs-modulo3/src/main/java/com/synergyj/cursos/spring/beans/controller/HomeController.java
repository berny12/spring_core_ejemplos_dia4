package com.synergyj.cursos.spring.beans.controller;

import org.springframework.stereotype.Component;

@Component
public class HomeController {
	public void home() {
		System.out.println("En el home del controller");
	}
}
