
# java-services

Rest services using Java

## Tutorial link

https://spring.io/guides/gs/spring-boot/

## Careful

Remember add dependencies to use annotations and every implementation in springboot framework in build.gradle

'''
implementation 'org.springframework.boot:spring-boot-starter'
implementation 'org.springframework.boot:spring-boot-starter-web'
'''

## Gradle commands

'''
// Refresh dependencies
./gradlew build --refresh-dependencies
// Runs the application
./gradlew bootRun
// Run the tests
./gradlew test
'''

## Spring Boot Token based Authentication with Spring Security & JWT

[Spring Boot Token based Authentication with Spring Security & JWT](https://bezkoder.com/spring-boot-jwt-authentication/)

## MySQL

[commands](http://g2pc1.bu.edu/~qzpeng/manual/MySQL%20Commands.htm)

command

'''shell
mysql -u root -p
'''

## Logout storing token in a black list cache

We can log out storing the token on the black list cache.

When a user performs logout action, the client should call a server API and in this API will add this token into the blocklist sections either in the cache Redis or database. So the validating token process you check if the token is in blocklist or not.

[JWT logout](https://blog.usejournal.com/springboot-how-to-invalidate-jwt-token-such-as-logout-or-reset-all-active-tokens-73f55289d47b)