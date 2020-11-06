/**
 * 
 */
package com.hcl.springregistration.test;

/**
 * @author dharinishree.k
 *
 */
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.hcl.hospitalmanagement.controller.HomeController;
//import com.hcl.springregistration.controller.HomeController;
//import com.hcl.springregistration.controller.UserControler;
import com.hcl.hospitalmanagement.model.User;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

public class MyControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
    }

    @Test
    public void testHomePage() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("/home"))
                 // .andExpect(redirectedUrl("user/register"))
                //.andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    /*@Test
    public void testMessagePage() throws Exception {
        this.mockMvc.perform(get("/message")).andExpect(status().isOk())
                .andExpect(content().string("Hello there!"));
    }*/
}
