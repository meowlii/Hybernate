package com.example.EmpresaServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmpresaEntities.Funcionario;
import com.example.EmpresaRepositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public List<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}

	public Funcionario getFuncionarioById(long funcodigo) {
		return funcionarioRepository.findById(funcodigo).orElse(null);
	}

	public Funcionario saveFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

}
