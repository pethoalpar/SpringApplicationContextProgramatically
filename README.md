<h1>Spring application context build programatically</h1>

<h3>pom.xml</h3>

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>4.3.9.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>4.3.9.RELEASE</version>
</dependency>
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
