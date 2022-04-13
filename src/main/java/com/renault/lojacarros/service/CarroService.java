package com.renault.lojacarros.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.renault.lojacarros.model.Veiculo;

@Service
public class CarroService {

	public Veiculo buscarCarros() {
		Veiculo veiculo = new Veiculo("camaro");
		
		return veiculo;
	}

	public Veiculo buscarCarros(String tipo) {
		Veiculo veiculoLuxo = new Veiculo("camaro","1234");
		Veiculo veiculoClassico = new Veiculo("fusca","4444");
		veiculoClassico.setCor("azul");
		if("luxo".equals(tipo.toLowerCase())) {
			return veiculoLuxo;
		
		}else if ("classico".equals(tipo.toLowerCase())) {
			return veiculoClassico;
		}else {
			return new Veiculo("outros");
		}
		
	
		
	}

	public Object buscarCarrosTodos() {
		List<Veiculo> lista = new ArrayList<>();
		
		Veiculo veiculoLuxo = new Veiculo("camaro","1234");
		Veiculo veiculoClassico = new Veiculo("fusca","4444");
		veiculoClassico.setCor("azul");
		
		lista.add(veiculoClassico);
		lista.add(veiculoLuxo);
		
		return lista;
	}

}
