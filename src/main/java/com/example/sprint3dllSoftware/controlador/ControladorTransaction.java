package com.example.sprint3dllSoftware.controlador;


import com.example.sprint3dllSoftware.Servicios.ServicioImpTransaction;
import com.example.sprint3dllSoftware.entidades.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/transaction")
@RestController
public class ControladorTransaction {
    @Autowired
    private ServicioImpTransaction sit;

    @GetMapping("/{id}/movements/{idMovements}")
    public void listarMovimientosById(@PathVariable("id")Integer id,@PathVariable("idMovements")Integer idMovements){
        sit.consultarTransactionPorId(id);
    }

    @PostMapping("/{id}/movements")
    public void insertarMovimiento(@RequestBody Transaction transaction){
        sit.guardarTransaction(transaction);
    }
    @PutMapping("/{id}/movements")
    public void actualizarMovimiento(@RequestBody Transaction transaction){
        sit.actualizarTransaction(transaction);
    }

    @DeleteMapping("/{id}/movements")
    public void eliminarMovimientosById(@PathVariable("id")Integer id){
        sit.eliminarTransaction(id);
    }

}
