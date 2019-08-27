package br.unitins.cadastroTeste.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.cadastroTeste.model.CadastroModel;

@Named
@ViewScoped
public class CadastroController implements Serializable {
	private static final long serialVersionUID = 1805374705129895690L;
	
	private CadastroModel cadastroModel;
	private List<CadastroModel> listaCadastroModel;
	
	public void incluir() {
		listaCadastroModel.add(getCadastroModel());
		limpar();
	}
	
	public void limpar() {
		cadastroModel = new CadastroModel();
	}
	
	public void editar(CadastroModel cadastroModelMetodoEditar) {
		setCadastroModel(cadastroModelMetodoEditar);
	}
	
	//Metodos GETTERS e SETTERS
	public CadastroModel getCadastroModel() {
		if(cadastroModel == null) 
			cadastroModel = new CadastroModel();
		return cadastroModel;
	}

	public void setCadastroModel(CadastroModel cadastroModel) {
		this.cadastroModel = cadastroModel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public List<CadastroModel> getListaCadastroModel() {
		if(listaCadastroModel == null) {
			 listaCadastroModel = new ArrayList<CadastroModel>();
		}
		return listaCadastroModel;
	}

	public void setListaCadastroModel(List<CadastroModel> listaCadastroModel) {
		this.listaCadastroModel = listaCadastroModel;
	}
}
