package com.example.demo3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cat")
public class CatsController {

    private final CatClient catClient;

    @Autowired
    public CatsController(CatClient catClient) {
        this.catClient = catClient;
    }


    @GetMapping("/info")
    public ResponseEntity<CatInfo> getCatInfo() {
        CatInfo catInfo = catClient.getCatsInfo();
        return ResponseEntity.ok(catInfo);
    }
}
