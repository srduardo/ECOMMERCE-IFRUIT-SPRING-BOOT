package com.ifruitcommerce.ifruit.resources;

import com.ifruitcommerce.ifruit.entities.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
    @GetMapping
    public ResponseEntity findAll(){
        Payment p = new Payment();
        return ResponseEntity.ok().body(p);
    }
}
