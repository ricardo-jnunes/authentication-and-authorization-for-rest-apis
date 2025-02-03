package com.resource.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resource.dto.AccessTokenPasswordCredentialsValidateRequest;
import com.resource.dto.ProductDTO;
import com.resource.services.AuthorizationServices;

@RestController
@RequestMapping("/resource")
public class ResourcesController {

	@Autowired
	AuthorizationServices authServices;

	@PostMapping("/products")
	public List<ProductDTO> listProducts(@RequestBody AccessTokenPasswordCredentialsValidateRequest request) {

		if (authServices.validateAccessToken(request)) {

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
		return null;
	}

}
