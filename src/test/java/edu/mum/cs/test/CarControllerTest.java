package edu.mum.cs.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import edu.mum.cs.cs544.examples.Car;
import edu.mum.cs.cs544.examples.CarService;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {TestContext.class, WebAppContext.class})
@WebAppConfiguration
public class CarControllerTest {

	private MockMvc mockMvc;
	 
    @Autowired
    private CarService carService;
 
    //Add WebApplicationContext field here
 
    //The setUp() method is omitted.
 
    @Test
    public void findAll_ShouldAddTodoEntriesToModelAndRenderTodoListView() throws Exception {
       
 
//        Car car = new Car();
//        
//        when(carService.findById(1L)).thenReturn(car);
// 
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("todo/list"))
//                .andExpect(forwardedUrl("/WEB-INF/jsp/todo/list.jsp"))
//                .andExpect(model().attribute("todos", hasSize(2)))
//                .andExpect(model().attribute("todos", hasItem(
//                        allOf(
//                                hasProperty("id", is(1L)),
//                                hasProperty("description", is("Lorem ipsum")),
//                                hasProperty("title", is("Foo"))
//                        )
//                )))
//                .andExpect(model().attribute("todos", hasItem(
//                        allOf(
//                                hasProperty("id", is(2L)),
//                                hasProperty("description", is("Lorem ipsum")),
//                                hasProperty("title", is("Bar"))
//                        )
//                )));
// 
//        verify(carService, times(1)).findAll();
//        verifyNoMoreInteractions(carService);
    }

}
