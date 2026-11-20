package com.se190886.mvc.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class TestController {


    @GetMapping("/view-content")
    public ResponseEntity<String> getContent(){
        return ResponseEntity.ok("demo github webhook ");
    }


    @GetMapping("/view-shoes-detail")
    public ResponseEntity<String> getShoesById(@RequestParam String shoeId){
        return ResponseEntity.ok("this is the information of shoeId:" +shoeId);
    }

    @GetMapping("/update")
    public ResponseEntity<String> updateShoesById(@RequestParam String shoeId){
        return ResponseEntity.ok("this is the information of shoeId:" +shoeId);
    }
    @GetMapping("/delete")
    public ResponseEntity<String> deleteShoeById(@RequestParam String shoeId){
        return ResponseEntity.ok("this is the information of shoeId:" +shoeId);
    }

    @GetMapping("/change-status")
    public ResponseEntity<String> changeStatus(@RequestParam String shoeId){
        return ResponseEntity.ok("this is the information of shoeId:" +shoeId);
    }


    /**
     * 
     * 
     * asdsadasd
     * asd
     * asda
     * sd
     * 
     */

    /**
     *
     *
     * asdsadasd
     * asd
     * asda
     * sd
     *
     */
}
