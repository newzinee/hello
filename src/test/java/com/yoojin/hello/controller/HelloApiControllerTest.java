package com.yoojin.hello.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author yj
 * @version 0.1.0
 * @since 2020/12/04
 */
@AutoConfigureMockMvc
@SpringBootTest
class HelloApiControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void hello() throws Exception {

        mockMvc.perform(get("/")
                .contentType(String.valueOf(MediaType.APPLICATION_JSON))
                .accept(String.valueOf(MediaType.APPLICATION_JSON)))
                .andExpect(status().isOk())
                .andDo(print());
    }

}