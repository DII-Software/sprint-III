package com.example.sprint3dllSoftware.Servicios;


import com.example.sprint3dllSoftware.entidades.Transaction;
import com.example.sprint3dllSoftware.repositorio.RepositorioTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ServicioImpTransaction implements ServicioTransaction {

    @Autowired
    RepositorioTransaction repositorioTransaction;

    @Override
    public Transaction guardarTransaction(Transaction transaction) {
        return repositorioTransaction.save(transaction);
    }

    @Override
    public Transaction consultarTransactionPorId(Integer id) {
        return repositorioTransaction.findById(id).get();
    }

    @Override
    public Transaction actualizarTransaction(Transaction transaction) {
        return repositorioTransaction.save(transaction);
    }

    @Override
    public void eliminarTransaction(Integer id) {
        repositorioTransaction.deleteById(id);
    }

}
