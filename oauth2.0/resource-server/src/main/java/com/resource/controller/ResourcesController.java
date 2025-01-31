package com.resource.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resource.dto.ProductDTO;

@RestController
@RequestMapping("/resource")
public class ResourcesController {

	@GetMapping("/products")
	public List<ProductDTO> authorize(
	// implement token request
	) {

		List<ProductDTO> products = new ArrayList<ProductDTO>();

		for (long i = 0; i <= 3; i++) {
			ProductDTO product = new ProductDTO();
			product.setId(i);
			product.setDisplayName("Product " + i);
			product.setDescription("Some Description");
			
			Random r = new Random();
			double p = 1D + (99.99D - 1D) * r.nextDouble();
			product.setPrice(p);

			products.add(product);
		}
		return products;
	}

}
