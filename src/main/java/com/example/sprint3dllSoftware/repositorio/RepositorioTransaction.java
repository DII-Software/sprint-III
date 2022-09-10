package com.example.sprint3dllSoftware.repositorio;

import com.example.sprint3dllSoftware.entidades.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioTransaction extends JpaRepository<Transaction, Integer> {

}
