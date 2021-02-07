package com.hezho.controller;

import com.hezho.bean.Bills;
import com.hezho.bean.Billtype;
import com.hezho.service.BillTypesService;
import com.hezho.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BillsController {
    @Autowired
    private BillTypesService billTypesService;
    @Autowired
    private BillsService billsService;
    @RequestMapping("/gettypes")
    public String getTypes(ModelMap modelMap){
        List<Bills> billsList = billsService.getBills();
        List<Billtype> billtypeList = billTypesService.getTypes();
        modelMap.addAttribute("types",billtypeList);
        modelMap.addAttribute("bills",billsList);
        return "show";
    }
}
