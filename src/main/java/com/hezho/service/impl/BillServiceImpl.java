package com.hezho.service.impl;

import com.hezho.bean.Bills;
import com.hezho.dao.BillsMapper;
import com.hezho.service.BillsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BillServiceImpl implements BillsService {
    @Resource
    private BillsMapper billsMapper;

    @Override
    public List<Bills> getBills() {
        return billsMapper.getBills();
    }
}
