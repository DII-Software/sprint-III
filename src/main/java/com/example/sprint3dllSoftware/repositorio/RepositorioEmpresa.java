package com.example.sprint3dllSoftware.repositorio;

import com.example.sprint3dllSoftware.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface RepositorioEmpresa extends JpaRepository <Empresa, Integer>{

}
