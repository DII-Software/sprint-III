package com.example.sprint3dllSoftware.controlador;

import com.example.sprint3dllSoftware.Servicios.ServicioImpEmployee;
import com.example.sprint3dllSoftware.Servicios.ServicioImpEmpresa;
import com.example.sprint3dllSoftware.entidades.Employee;
import com.example.sprint3dllSoftware.entidades.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RequestMapping("/employee")
@Controller

public class ControladorEmployee {
    @Autowired
    private ServicioImpEmployee sie;
    @Autowired
    private ServicioImpEmpresa servicioImpEmpresa;

    @GetMapping
    public List<Employee> listar() {
        return sie.listarEmployee();
    }

    @GetMapping("/{id}")
    public Employee consultar(@PathVariable("id")Integer id){
        return sie.consultarEmployeePorId(id);
    }

    @PostMapping("/GuardarEmpleado")
    public Employee insertar(Employee emp, RedirectAttributes redirectAttributes){
        List<Empresa> empresas=servicioImpEmpresa.listarEmpresa();
        Empresa empresa=null;
        for(Empresa em:empresas){
            if(em.getId(em) == emp.getEmpresa().getIdVoid()){
                empresa=em;
            }
        }
        if(empresa!=null){
            emp.setEmpresa(empresa);
            System.out.println("Empleado a guardar: "+emp);
            redirectAttributes.addFlashAttribute("mensaje","saveOK");
            return sie.guardarEmployee(emp);
        }else if(empresa==null){
            redirectAttributes.addFlashAttribute("mensaje","saveError");
            return null;
        }
        return emp;
    }

    @PutMapping
    public Employee actualizar (@RequestBody Employee emp){
        return sie.actualizarEmployee(emp);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Employee emp){
        sie.eliminarEmployee(emp.getIdEmpleado());
    }

//    @PatchMapping("/{id}")
//    public Employee actualizarpor(@PathVariable ("id")Integer id, @RequestBody Map<Object, Object> objectMap){
//        return sie.actualizarPorId(id, objectMap);
//    }

}
