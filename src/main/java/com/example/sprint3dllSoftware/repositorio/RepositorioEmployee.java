package com.example.sprint3dllSoftware.repositorio;

import com.example.sprint3dllSoftware.entidades.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmployee extends JpaRepository<Employee, Integer> {
}
