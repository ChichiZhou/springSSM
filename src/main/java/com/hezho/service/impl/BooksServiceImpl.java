package com.hezho.service.impl;

import com.hezho.bean.Books;
import com.hezho.dao.BooksDao;
import com.hezho.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    @Resource
    private BooksDao booksDao;
    @Override
    public List<Books> getAllBooks() {
        return booksDao.getAll();
    }
}
