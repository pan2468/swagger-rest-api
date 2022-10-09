package com.sprint.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController("/api")
public class APiController {

    @GetMapping("getApi")
    public ResponseEntity<HashMap> getApi(@RequestParam(value="param1")String param1){
        HashMap map = new HashMap();
        map.put("param1",param1);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}