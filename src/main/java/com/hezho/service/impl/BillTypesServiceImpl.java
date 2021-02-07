package com.hezho.service.impl;

import com.hezho.bean.Billtype;
import com.hezho.dao.BillsMapper;
import com.hezho.dao.BilltypeMapper;
import com.hezho.service.BillTypesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BillTypesServiceImpl implements BillTypesService {
    @Resource
    BilltypeMapper billtypeMapper;

    @Override
    public List<Billtype> getTypes() {
        return billtypeMapper.getBilltype();
    }
}
