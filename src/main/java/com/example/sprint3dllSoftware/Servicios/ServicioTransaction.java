package com.example.sprint3dllSoftware.Servicios;

import com.example.sprint3dllSoftware.entidades.Transaction;

import java.util.List;
import java.util.Map;

public interface ServicioTransaction {
    public Transaction guardarTransaction (Transaction transaction);
    public Transaction consultarTransactionPorId(Integer idTransaction);
    public Transaction actualizarTransaction (Transaction idTransaction);
    public void eliminarTransaction (Integer idTransaction);
}
