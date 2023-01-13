/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.final_exam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpEntity;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mladi 20200140035 mauladina yuni pratiwi
 */
@RestController
@CrossOrigin
public class SuratController {
    Surat data = new Surat(); //mendeklarasikan entitas
    SuratJpaController control = new SuratJpaController(); //mendeklarasikan jpa controller
    
    @GetMapping(value = "/GET", produces = APPLICATION_JSON_VALUE)
    public List<Surat> getData() {
        List<Surat> buffer = new ArrayList<>(); //mendeklarasikan daftar variabel baru
        buffer = control.findSuratEntities();
        
        return buffer; //check data
    }
    
    @PostMapping(value = "/POST", consumes = APPLICATION_JSON_VALUE)
    public String sendData (HttpEntity<String> datasend) throws JsonProcessingException{
        String feedback = "Do nothing";
        ObjectMapper mapper = new ObjectMapper();
        data = mapper.readValue(datasend.getBody(), Surat.class);
        try {
            control.create(data);
            feedback = data.getJudul()+ "saved";
        } catch (Exception error) {
            feedback = error.getMessage();
        }
        return feedback;
        
    
    }
    
    @PutMapping(value = "/PUT", consumes = APPLICATION_JSON_VALUE)
    public String editData (HttpEntity<String> datasend) throws JsonProcessingException{
        String feedback = "Do nothing";
        ObjectMapper mapper = new ObjectMapper();
        data = mapper.readValue(datasend.getBody(), Surat.class);
        try {
            control.edit(data);
            feedback = data.getJudul() + "Edited";
        } catch (Exception error) {
            feedback = error.getMessage();
        }
        return feedback;
            
    }
    
    @DeleteMapping(value = "/DELETE", consumes = APPLICATION_JSON_VALUE)
    public String deleteData (HttpEntity<String> datasend) throws JsonProcessingException{
        String feedback = "Do nothing";
        ObjectMapper mapper = new ObjectMapper();
        data = mapper.readValue(datasend.getBody(), Surat.class);
        try {
            control.destroy(data.getId());
            feedback = "Data has been Deleted";
        } catch (Exception error) {
            feedback = error.getMessage();
        }
        return feedback;
    }
}
