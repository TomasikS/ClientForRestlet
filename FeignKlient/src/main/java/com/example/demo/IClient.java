/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author stefan.tomasik
 */
@FeignClient(name = "product-service", url = "localhost:8182/")
public interface IClient {

    @GetMapping(value = "all/")
    public List<Zaner> getZaners();

    @PostMapping("add/")
    public void addZaner();

}
