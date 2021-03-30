package fit.restapi.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fit.core.IrpfCalculator;
import fit.restapi.view.PersonVm;

@RestController
@CrossOrigin(origins = "*") 
@RequestMapping("/irpf")
public class IrpfController {
    @PostMapping("/calculate")
    public PersonVm calculate(@RequestBody PersonVm person) {
        var irpf = new IrpfCalculator(2021, person.getTotalSalary(), person.getDependentsNumber()).calculate();
        person.setIrpf(irpf);

        return person;
    }

    @GetMapping("/table")
    public Map<String, String> getTable() {
        var map = new HashMap<String, String>();
    
        map.put("<= 0.00", "0.0");
        map.put("<= 922.67", "0.075");
        map.put("<= 1847.07", "0.15");
        map.put("<= 2760.70", "0.225");
        map.put("> 2760.70", "0.275");

        return map;
    }
}
