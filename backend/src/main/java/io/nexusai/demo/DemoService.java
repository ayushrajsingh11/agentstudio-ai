package io.nexusai.demo;
import java.util.*;
import org.springframework.stereotype.Service;
@Service public class DemoService {
 public List<String> execute(String input,String query){
  if(input==null||query==null||input.length()>50000||query.length()>2000)throw new IllegalArgumentException("Invalid input size");
  var value=input; var log=new ArrayList<String>(); for(String step:query.split(",")){value=switch(step.trim()){case "trim"->value.trim();case "uppercase"->value.toUpperCase(Locale.ROOT);case "length"->Integer.toString(value.length());default->throw new IllegalArgumentException("Unsupported step");};log.add(step.trim()+": "+value);}return log;
 }
}
