# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-developing-web-applications)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Spring boot CLI
https://docs.spring.io/spring-boot/docs/current/reference/html/cli.html


### Spring Help init
spring init - Initialize a new project using Spring Initializr (start.spring.io)

usage: spring init [options] [location]


|Option                       |Description|
|------                       |-----------|
|-a, --artifactId <String>    |Project coordinates; infer archive name (for example 'test')|
|-b, --boot-version <String>  |Spring Boot version (for example '1.2.0.RELEASE')|
|--build <String>             |Build system to use (for example 'maven' or 'gradle') (default: maven)|
|-d, --dependencies <String>  |Comma-separated list of dependency identifiers to include in the generated project|
|--description <String>       |Project description|
|-f, --force                  |Force overwrite of existing files|
|--format <String>            |Format of the generated content (for example 'build' for a build file, 'project' for a project archive) (default: project)|
|-g, --groupId <String>       |Project coordinates (for example 'org.test')|
|-j, --java-version <String>  |Language level (for example '1.8')|
|-l, --language <String>      |Programming language  (for example 'java')|
|--list                       |List the capabilities of the service. Use it to discover the dependencies and the types that are available|
|-n, --name <String>          |Project name; infer application name|
|-p, --packaging <String>     |Project packaging (for example 'jar')|
|--package-name <String>      |Package name|
|-t, --type <String>          |Project type. Not normally needed if you use --build and/or --format. Check the capabilities of the service (--list) for more details|
|--target <String>            |URL of the service to use (default: https://start.spring.io)|
|-v, --version <String>       |Project version (for example '0.0.1-SNAPSHOT')|
|-x, --extract                |Extract the project archive. Inferred if a location is specified without an extension|

#### examples:

* To list all the capabilities of the service:
  * $ spring init --list

* To creates a default project:
  * $ spring init

* To create a web my-app.zip:
  * $ spring init -d=web my-app.zip

* To create a web/data-jpa gradle project unpacked:
  * $ spring init -d=web,jpa --build=gradle my-dir

#### command
spring init --build maven --language java --version 2.5.2 --packaging jar --java-version 11 --groupId taskagile --artifactId app --name TaskAgile --description "Open source task management tool" --package-name com.taskagile --dependencies web,thymeleaf,jpa,devtools