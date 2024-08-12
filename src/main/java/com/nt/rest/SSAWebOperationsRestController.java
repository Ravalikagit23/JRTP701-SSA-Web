package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/ssa-web-api")
public class SSAWebOperationsRestController {
    @GetMapping("/find/{ssn}")
    public ResponseEntity<String> getStateBySSN(@PathVariable Integer ssn){
        if(String.valueOf(ssn).length()!=9)
            return new ResponseEntity<String>("Invalid ssn", HttpStatus.BAD_REQUEST);
        int stateCode=ssn%100;
        String stateName=null;
        if(stateCode==01)
            stateName="Washington" ;
        else
        if(stateCode==02)
            stateName="Ohio";
        else if(stateCode==03)
            stateName="Texas";
       else if(stateCode==04)
            stateName="California";

        else if(stateCode==05)
            stateName="Florida";
        else stateName="Invalid SSN";




return new ResponseEntity<String>(stateName,HttpStatus.OK);

    }

}
