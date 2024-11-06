package ch.hearc.jee2024.hellospring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/body")
public class CustomBodyController {

    @GetMapping()
    public CustomResponse sendCustomBody(){
            return new CustomResponse("ok","ok");
    }

    @PostMapping()
    public CustomResponse reiceiveCustomBody(@RequestBody CustomResponse response){
        return response;
    }

}
