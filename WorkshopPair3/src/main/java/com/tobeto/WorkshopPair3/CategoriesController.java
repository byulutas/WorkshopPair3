package com.tobeto.WorkshopPair3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categories")
public class CategoriesController {

    @PostMapping("add")//api/categories/add
    public String add(){

        return "Kategori başarıyla eklenmiştir.";
    }

    @PutMapping("update")//api/categories/update
    public String update(){

        return "Kategori başarıyla güncellenmiştir.";
    }

    @DeleteMapping("delete")//api/categories/delete
    public String delete(){

        return "Kategori başarıyla silinmiştir.";
    }

    @GetMapping("getById") //api/categories/getById
    public String getByİd(){

        return "İstediğiniz kategoriye ait biligiler başarıyla listelenmiştir.";
    }

    @GetMapping("getAll") //api/categories/getAll
    public String getAll(){

        return "Tüm kategoriler başarıyla listelenmiştir.";
    }
}
