package ch.hearc.jee2024.hellospring;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.discovery.SelectorResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc //configuration automatique du mock
class HelloSpringApplicationTests {

    @Autowired
    private MockMvc mvc; //Objet permettant de "simuler" un serveur web

    @Test
    public void callHelloShouldReturnHelloworld() throws Exception {

        this.mvc.perform(get("/hello"))  //GET /hello
                .andExpect(status().isOk())         //Status code = 200
                .andExpect(content().string("Hello World!")); //Body = "Hello World!"
    }

}
