package com.tobeto.WorkshopPair3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
public class ProductsController {

    @PostMapping("add")//api/products/add
    public String add(){

        return "Ürün başarıyla eklenmiştir.";
    }

    @PutMapping("update")//api/products/delete
    public String update(){

        return "Ürün başarıyla güncellenmiştir.";
    }

    @DeleteMapping("delete")
    public String delete(){

        return "Ürün başarıyla silinmiştir.";
    }

    @GetMapping("getById") //api/products/getById
    public String getById(){

        return "İstediğiniz ürün ait biligiler başarıyla listelenmiştir.";
    }

    @GetMapping("getAll") //api/products/getAll
    public String getAll(){

        return "Tüm ürünler başarıyla listelenmiştir.";
    }
}
