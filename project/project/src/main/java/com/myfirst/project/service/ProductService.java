package com.myfirst.project.service;

import com.myfirst.project.domain.Product;
import com.myfirst.project.repository.ProductRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService
{

@Autowired
ProductRepository productRepository;

//adding product
public Product addProduct(Product product)
{ return productRepository.save(product);}
//Fetching a Product
public Optional<Product> getProduct(Long id)
{ return productRepository.findById(id);}
//deleting a Product
public void deleteProduct(Long id)
{ productRepository.deleteById(id);}
//showing all products
public List<Product> allProducts()
{return productRepository.findAll();}

//Updating Product Retail Price
public JSONObject UpdateProduct(Long id, Long value)
{
    String result;
    JSONObject jsonObject;
    Product Product1 = productRepository.getOne(id);
    if (productRepository.existsById(id)) {
        Product1.setRetailPrice(value);
        productRepository.save(Product1);
        result = "{\"Status\" : \"OK \"}";}
    else{result="{\"Status\" : \"KO\" }";}
    jsonObject = new JSONObject(result);
    return jsonObject;

}

}
