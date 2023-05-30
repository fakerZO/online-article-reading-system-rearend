package com.example.demo.controller;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/book")
@RestController
public class BookContrller {
    @Resource
    private BookDao dao;

    @GetMapping
    public List getBook() {
        return dao.selectList(null);
    }

    @PostMapping
    public String addBook(@RequestBody Book book) {
        return dao.insert(book)==1?"添加成功":"添加失败";
    }

    @PutMapping
    public String upBook(@RequestBody Book book){
        return dao.updateById(book)==1?"更新成功":"更新失败";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        return dao.deleteById(id)==1?"删除成功":"删除失败";
    }
}
