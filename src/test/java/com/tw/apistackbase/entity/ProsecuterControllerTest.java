package com.tw.apistackbase.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tw.apistackbase.controller.ProsecutorController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProsecutorController.class)
@ActiveProfiles(profiles = "test")
public class ProsecuterControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    ProsecutorRepo prosecutorRepo;

    @Test
    void should_get_all_prosecutors() throws Exception{
        List<Prosecutor> prosecutors =  new ArrayList<>();
        Prosecutor me = new Prosecutor("1","Martin",69, "Male", 1, "2069-69-69");
        Prosecutor me1 = new Prosecutor("2","Iyan",69, "Male", 1, "2069-69-69");
        prosecutors.add(me);
        prosecutors.add(me1);
        //given
        when(prosecutorRepo.findAll()).thenReturn(prosecutors);
        //when
        ResultActions result = mvc.perform(get("/api/prosecutors"));
        //then
        result.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$", hasSize(2)))
        ;
    }

    @Test
    void should_add_prosecutor() throws Exception {

        Prosecutor me = new Prosecutor("1","Martin",69, "Male", 1, "2069-69-69");
        //given
        when(prosecutorRepo.save(me)).thenReturn(me);
        //when
        ResultActions result = mvc.perform(post("/api/prosecutor")
        .content(new ObjectMapper().writeValueAsString(me))
        .contentType(MediaType.APPLICATION_JSON));
        //then
        result.andExpect(status().isCreated())
                .andDo(print())
        ;
    }
}
