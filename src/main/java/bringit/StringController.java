package bringit;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
public class StringController {

    private static Logger log = Logger.getLogger(StringController.class);

    @RequestMapping(value = "/bring/it", method = RequestMethod.GET)
    @ResponseBody
    public StringObject bringIt(@RequestParam String name) {
        log.info("accepting request with name " + name);
        return new StringObject(name);
    }

    @RequestMapping(value = "/bring/it", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody
    public StringObject bringIt(@RequestBody StringObject object) {

        return object;
    }
}
