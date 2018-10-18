<h1>Spring application context build programatically</h1>

<h3>pom.xml</h3>

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.1.1.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.1.1.RELEASE</version>
</dependency>
```

<h3>Person.java</h3>

```java
public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void printPerson(){
        System.out.println("Name:"+this.name+" Age:"+this.age);
    }
}
```

<h3>Main.java</h3>

```java
GenericApplicationContext context = new GenericApplicationContext();

BeanDefinitionBuilder beanBuilder = BeanDefinitionBuilder.rootBeanDefinition(Person.class)
    .addConstructorArgValue(23).addConstructorArgValue("Alpar");

context.registerBeanDefinition("personBean", beanBuilder.getBeanDefinition());
context.refresh();

Person person = context.getBean("personBean", Person.class);
person.printPerson();
```
