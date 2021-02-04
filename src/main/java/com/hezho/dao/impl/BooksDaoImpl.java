//package com.hezho.dao.impl;
//
//import com.hezho.bean.Books;
//import com.hezho.dao.BooksDao;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//@Repository
//public class BooksDaoImpl implements BooksDao {
//    @Resource // 该对象来源于配置文件
//    private SqlSessionTemplate sqlSessionTemplate;
//
//    @Override
//    public List<Books> getAll() {
//        return sqlSessionTemplate.selectList("com.hezho.dao.BooksDao.getAll");  // 接口 + 方法名
//    }
//}
