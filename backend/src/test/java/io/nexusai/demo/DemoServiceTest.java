package io.nexusai.demo;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DemoServiceTest {
 private final DemoService service=new DemoService();
 @Test void sampleWorkflow(){assertEquals(List.of("trim: hi","uppercase: HI","length: 2"),service.execute(" hi ","trim,uppercase,length"));}
 @Test void rejectsNull(){assertThrows(IllegalArgumentException.class,()->service.execute(null,"test"));}
}
