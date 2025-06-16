package com.in.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class VendorRestController {


	@GetMapping("/data")
	public String viewData() {
		return "FROM VENDOR.. ";
	}
}
