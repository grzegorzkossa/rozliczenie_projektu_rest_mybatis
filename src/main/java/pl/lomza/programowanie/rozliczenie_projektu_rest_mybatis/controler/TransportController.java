package pl.lomza.programowanie.rozliczenie_projektu_rest_mybatis.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransportController {

    @GetMapping("/")
    public String getTest() {
        return "Działa";
    }
}
