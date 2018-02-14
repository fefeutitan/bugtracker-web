package br.com.triadworks.bugtracker.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.triadworks.bugtracker.modelo.Bug;

@Controller
@Scope("request")
public class CacheBean {

	private Bug bug;
	private Integer id;
	
	/**
	 * Testando cache de primeiro nível
	 */
	public void pesquisa() {
		
	}

	public Bug getBug() {
		return bug;
	}
	public void setBug(Bug bug) {
		this.bug = bug;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
