## Desription

The project have 3 variants. foo, bar and mixed which aggregates both. All of subprojects should be runnable by bootRun. With Spring Boot 1.5 everything works fine. If I switch spring boot to 2.0.1 spring boot gradle plugin is not building jar dependencies if they have "org.springframework.boot" plugin applied.

My temporary solution is removeing all places with 

```groovy
apply plugin: 'org.springframework.boot'

springBoot {
    mainClass = "com.example.springbootgradlepluginissue.App"
}

```
And just pasting it for subproject that I want to make executable at the time. This is not acceptable for long-term use.

## Reproduce issue
- Clone repository and cd into
```bash
git clone https://github.com/dagi12/spring-boot-gradle-plugin-issue.git && cd spring-boot-gradle-plugin-issue 
``` 

1. 
    Run bootRun on mixed project. Everything works perfect.
    ```bash
    ./gradlew mixed:bootRun
    ``` 

2.
    Switch plguin version to 2.0.1
    ```bash
    git checkout origin 2.0.1
    ```
3.
    Try to run again, build will fail because 2.0.1 is not building jar dependencies 
    
    ```bash
    ./gradlew clean mixed:bootRun
    ```