package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.ArticleDao;
import com.example.demo.entity.Article;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/article")
public class ArticleContrller {

    @Resource
    private ArticleDao dao;

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public ResponseEntity<Page<Article>> list(int pages,int size) {
        Page<Article> page = new Page<>(pages, size);
        articleService.page(page);

        return ResponseEntity.ok(page);
    }
    @PostMapping
    public String addArticle(@RequestBody Article article) {
        return dao.insert(article)==1?"添加成功":"添加失败";
    }

    @PutMapping
    public String upArticle(@RequestBody Article article){
        return dao.updateById(article)==1?"更新成功":"更新失败";
    }

    @DeleteMapping("/{id}")
    public String deleteArticle(@PathVariable int id){
        return dao.deleteById(id)==1?"删除成功":"删除失败";
    }
}

