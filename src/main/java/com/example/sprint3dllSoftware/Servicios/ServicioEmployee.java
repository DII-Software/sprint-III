package com.example.sprint3dllSoftware.Servicios;

import com.example.sprint3dllSoftware.entidades.Employee;

import java.util.List;
import java.util.Map;

public interface ServicioEmployee {

    public List<Employee>listarEmployee();
    public Employee actualizarPorId (Integer doc, Map<Object, Object> objectMap);
    public Employee guardarEmployee (Employee employee);

    Employee consultarEmployeePorId(Integer documento);

    public Employee actualizarEmployee (Employee employee);
    public void eliminarEmployee (Integer documento);

}


