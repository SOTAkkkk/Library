package com.example.Library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("list")
    public String List(Model model){
        model.addAttribute("bookList",bookService.findAll());
        return "list";
    }

    @GetMapping("add")
    public String add(Model model){
        model.addAttribute("book",new Book());
        return "add";
    }

    @PostMapping("add")
    public String add(Book book){
        bookService.addBok(book);
        return "redirect:list";
    }

}
