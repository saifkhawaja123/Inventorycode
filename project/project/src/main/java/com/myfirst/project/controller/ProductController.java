package com.myfirst.project.controller;

import com.myfirst.project.domain.Product;
import com.myfirst.project.service.ProductService;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController
{
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Product addUserRecord(@RequestBody Product product)
    {
        return productService.addProduct(product);
    }
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Optional<Product> getProduct(@RequestParam(name = "id") Long id)
    {
        return productService.getProduct(id);
    }
    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public List<Product> getallProduct()
    {
      return productService.allProducts();
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public void deleteProduct(@RequestParam(name = "id") Long id)
    {
        productService.deleteProduct(id);
    }

    public JSONObject updateUser(@RequestBody Product product, @RequestParam(name = "id") Long id)
    { return productService.UpdateProduct(id,product.getRetailPrice()); }


}
