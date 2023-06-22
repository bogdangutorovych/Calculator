package com.serviguidetech.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddEndpoint() throws Exception {
        int operand1 = 5;
        int operand2 = 3;
        int expectedResult = operand1 + operand2;

        ResultActions resultActions = mockMvc.perform(get("/add")
                        .param("operand1", String.valueOf(operand1))
                        .param("operand2", String.valueOf(operand2))
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(String.valueOf(expectedResult)));
    }

    @Test
    public void testSubtractEndpoint() throws Exception {
        int operand1 = 8;
        int operand2 = 4;
        int expectedResult = operand1 - operand2;

        ResultActions resultActions = mockMvc.perform(get("/subtract")
                        .param("operand1", String.valueOf(operand1))
                        .param("operand2", String.valueOf(operand2))
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(String.valueOf(expectedResult)));
    }
}
