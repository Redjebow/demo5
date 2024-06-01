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


    @GetMapping("/fact")
    public ResponseEntity<Cat> getCatInfo() {
        Cat cat = catClient.getCatsInfo();
        return ResponseEntity.ok(cat);
    }

    @GetMapping("/breed")
    public ResponseEntity<BreedsResponse> getCatBreed() {
        BreedsResponse breedInfo = catClient.getCatsBreeds();
        return ResponseEntity.ok(breedInfo);
    }
    @GetMapping("/facts")
    public ResponseEntity<CatResponse> getAllCatsFacts() {
        CatResponse catInfo = catClient.getAllCatsInfo();
        return ResponseEntity.ok(catInfo);
    }
}
