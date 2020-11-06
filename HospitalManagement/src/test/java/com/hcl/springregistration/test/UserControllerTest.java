package com.hcl.springregistration.test;

/**
 * @author dharinishree.k
 *
 */
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.hcl.springregistration.controller.HomeController;
//import com.hcl.springregistration.controller.HomeController;
import com.hcl.hospitalmanagement.controller.UserControler;
import com.hcl.hospitalmanagement.model.User;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

public class UserControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new UserControler()).build();
    }

    @Test
    public void testHomePage() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
        		.post("/user/registration")
        .content(asJsonString(new User(5, "god@mail.com", "6666", 2)))
        .contentType(MediaType.APPLICATION_JSON)
       .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
               .andExpect(view().name("registrationSuccess"))
                  //.andExpect(redirectedUrl("user/registration"))
                //.andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
    @Test
    public void testHomePage1() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
        		.get("/user/registration")
        .content(asJsonString(new User()))
        .contentType(MediaType.APPLICATION_JSON)
       .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
               .andExpect(view().name("registrationFailed"))
                  //.andExpect(redirectedUrl("user/registration"))
                //.andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
   /* @Test
    public void testHomePage2() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
        		.post("/user/registration")
        .content(asJsonString(new User()))
        .contentType(MediaType.APPLICATION_JSON)
       .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
               .andExpect(view().name("register"))
                  //.andExpect(redirectedUrl("user/registration"))
                //.andDo(MockMvcResultHandlers.print())
                .andReturn();
    }*/
   

    /*@Test
    public void testMessagePage() throws Exception {
        this.mockMvc.perform(get("/message")).andExpect(status().isOk())
                .andExpect(content().string("Hello there!"));
    }*/
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
