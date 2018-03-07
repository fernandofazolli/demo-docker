package br.com.fazolli.demodocker;

import org.springframework.web.bind.annotation.*;

/**
 * Created by fernandofazolli on 24/02/18.
 */
@RestController
@RequestMapping(value = "demodocker")
public class Controller {
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Example hello(@PathVariable("name") String name){
        return new Example(name);
    }

    class Example{
        private String message;

        public Example(String name) {
            this.message = "hello " + name;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
