package com.hezho.controller;

import com.hezho.bean.Books;
import com.hezho.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作用是匹配请求，调取service方法
 */
@Controller
public class BooksController {
    @Resource
    private BooksService booksService;
    @RequestMapping("/getAllBooks")
    // 需要后台给前端传值
    public String getBooks(ModelMap modelMap){
        List<Books> books = booksService.getAllBooks();
        modelMap.addAttribute("booklist",books);
        return "show";
    }
}
