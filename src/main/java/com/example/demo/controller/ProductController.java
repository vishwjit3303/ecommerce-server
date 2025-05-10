//package com.example.demo.controller;
//
//
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.model.Product;
//import com.example.demo.service.ProductService;
//
//@RestController
//@RequestMapping("/api/products")
//public class ProductController {
//
//    private final ProductService productService;
//
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping
//    public ResponseEntity<Page<Product>> getProducts(
//            @RequestParam(required = false, defaultValue = "") String category,
//            @RequestParam(required = false) List<String> color,
//            @RequestParam(required = false) List<String> size,
//            @RequestParam(required = false, defaultValue = "0") Integer minPrice,
//            @RequestParam(required = false, defaultValue = "100000") Integer maxPrice,
//            @RequestParam(required = false, defaultValue = "0") Integer minDiscount,
//            @RequestParam(required = false, defaultValue = "priceLowToHigh") String sort,
//            @RequestParam(required = false, defaultValue = "available") String stock,
//            @RequestParam(required = false, defaultValue = "0") Integer pageNumber,
//            @RequestParam(required = false, defaultValue = "10") Integer pageSize
//    ) {
//        Sort.Direction direction = Sort.Direction.ASC;
//        String sortBy = "price";
//
//        if ("priceHighToLow".equalsIgnoreCase(sort)) {
//            direction = Sort.Direction.DESC;
//        } else if ("priceLowToHigh".equalsIgnoreCase(sort)) {
//            direction = Sort.Direction.ASC;
//        } else if ("discount".equalsIgnoreCase(sort)) {
//            sortBy = "discountPersent";
//        } else if ("newest".equalsIgnoreCase(sort)) {
//            sortBy = "createdAt";
//            direction = Sort.Direction.DESC;
//        }
//
//        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(direction, sortBy));
//
//        Page<Product> productsPage = productService.findProductsByFilters(
//                category,
//                color,
//                size,
//                minPrice,
//                maxPrice,
//                minDiscount,
//                stock,
//                pageable
//        );
//
//        return ResponseEntity.ok(productsPage);
//    }
//}
