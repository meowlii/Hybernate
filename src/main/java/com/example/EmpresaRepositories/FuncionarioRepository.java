package com.example.EmpresaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmpresaEntities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
