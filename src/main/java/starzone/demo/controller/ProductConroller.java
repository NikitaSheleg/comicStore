package starzone.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import starzone.demo.entity.Product;
import starzone.demo.service.implementations.ProductServiceImpl;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductConroller {
    @Autowired
    ProductServiceImpl productService;

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product/index";
    }



}
