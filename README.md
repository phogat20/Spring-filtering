# Spring-filtering

# Two Types:
 1. Static filtering(In model class)
   - Same filtering for a bean across different REST API.
   - @JsonIgnoreProperties, @JsonIgnore
   
   
 2. Dynamic filtering(In controller)
   - Customize filtering for a bean for specific REST API.
   - @JsonFilter
 
 <hr>
- @JsonIgnore is a Jackson annotation in Java used to indicate that a particular property or field should be ignored during serialization and deserialization of JSON data.

 <hr>

- @JsonIgnoreProperties is a Jackson annotation in Java used to indicate that certain properties or fields of a class should be ignored during serialization and deserialization of JSON data.
<hr>

- @JsonFilter is a Jackson annotation in Java that allows you to dynamically filter properties during serialization and deserialization of JSON data.

@JsonFilter("myFilter")
public class Person {
    private String name;
    private int age;
    private String address;

    // Getters and setters omitted for brevity
}

SimpleFilterProvider filterProvider = new SimpleFilterProvider()
    .addFilter("myFilter", SimpleBeanPropertyFilter.filterOutAllExcept("name", "age"));
<hr>
