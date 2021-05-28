package com.shcherbakova.app.controller;

import com.shcherbakova.app.persistance.model.Book;
import com.shcherbakova.app.persistance.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public ModelAndView books() {
        ModelAndView mv = new ModelAndView("books");
        mv.addObject("allBooks", bookRepository.findAll());
        return mv;
    }

    @GetMapping("/new")
    public String newBook(Model model){
        model.addAttribute("book", new Book());
        return "newBook";
    }


    @PostMapping("/submitted")
    public String submit(@ModelAttribute Book book) {
        bookRepository.save(book);
        return "redirect:/books";
    }
}
