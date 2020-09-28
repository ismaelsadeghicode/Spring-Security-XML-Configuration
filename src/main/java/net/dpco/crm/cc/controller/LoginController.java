package net.dpco.crm.cc.controller;

import net.dpco.crm.cc.pojos.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rest")
public class LoginController {
//
//    @Autowired
//    private DAO_DBUtil daoDbUtil;

    @RequestMapping(value = "test" ,method = RequestMethod.GET)
    public @ResponseBody String dateSystem(){
//        return daoDbUtil.getSysDate();
        return "daoDbUtil.getSysDate();";
    }

    @RequestMapping(value = "employee",method = RequestMethod.POST)
    public @ResponseBody Employee dateSystem(@RequestBody Employee employee){
//        return daoDbUtil.getSysDate();
        return employee;
    }
}
