package com.demo.query;

import com.demo.query.service.DepositQueryGenerator;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    DepositQueryGenerator depositQueryGenerator;


    @GetMapping(value = "/status")
    public ResponseEntity<String> getStatus() {
        return new ResponseEntity<>("Alive.", HttpStatus.OK);
    }



    @GetMapping(value = "/getDepositQuery")
    public ResponseEntity<String> getDepostQuery() {
        //  this.producer.sendMessage(key, message);
        return new ResponseEntity<String>("Query", HttpStatus.OK);
    }




}
