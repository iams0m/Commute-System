package com.group.attendancemanagementsystem.controller.employee;

import com.group.attendancemanagementsystem.dto.employee.request.RegisterEmployeeRequest;
import com.group.attendancemanagementsystem.dto.employee.response.EmployeeFindAllResponse;
import com.group.attendancemanagementsystem.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/employee")
    public void registerEmployee(@RequestBody RegisterEmployeeRequest request) {
        employeeService.registerEmployee(request);
    }

    @GetMapping("/employee")
    public List<EmployeeFindAllResponse> findAllEmployee() {
        return employeeService.findAllEmployee();
    }
}
