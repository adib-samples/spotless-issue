# Build project to see deprecation warning from spotless

```
± |master ?:16 ✗| → ./gradlew clean build spotlessApply

> Task :app:test
2020-03-04 13:06:16.624  INFO 44676 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-03-04 13:06:16.624  INFO 44676 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-03-04 13:06:16.626  INFO 44676 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2020-03-04 13:06:16.629  INFO 44676 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

> Task :core:test
2020-03-04 13:06:24.687  INFO 44691 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2020-03-04 13:06:24.687  INFO 44691 --- [extShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-03-04 13:06:24.689  INFO 44691 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2020-03-04 13:06:24.692  INFO 44691 --- [extShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.2.2/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 25s
47 actionable tasks: 45 executed, 2 up-to-date
```
