
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.7)
 
2022-05-13 22:33:05.367  INFO 13062 --- [           main] h.nathyelson.sts.PrimeiraApiApplication  : Starting PrimeiraApiApplication v0.0.1-SNAPSHOT using Java 11.0.9 on Wnathyelson-PC with PID 13062
 (/home/wnathyelson/StsProjects/primeira-api/target/primeira-api-0.0.1-SNAPSHOT.jar started by wnathyelson in /home/wnathyelson/StsProjects/primeira-api/target)
2022-05-13 22:33:05.371  INFO 13062 --- [           main] h.nathyelson.sts.PrimeiraApiApplication  : No active profile set, falling back to 1 default profile: "default"
2022-05-13 22:33:06.082  INFO 13062 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2022-05-13 22:33:06.142  INFO 13062 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 48 ms. Found 1 JPA repository interfaces.
2022-05-13 22:33:06.746  INFO 13062 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-05-13 22:33:06.760  INFO 13062 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-05-13 22:33:06.761  INFO 13062 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.62]
2022-05-13 22:33:06.871  INFO 13062 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-05-13 22:33:06.872  INFO 13062 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1435 ms
2022-05-13 22:33:07.047  INFO 13062 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2022-05-13 22:33:07.288  INFO 13062 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2022-05-13 22:33:07.348  INFO 13062 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2022-05-13 22:33:07.427  INFO 13062 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.8.Final
2022-05-13 22:33:07.656  INFO 13062 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2022-05-13 22:33:07.815  INFO 13062 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
Hibernate: drop table if exists cliente CASCADE 
Hibernate: create table cliente (id bigint generated by default as identity, nome varchar(255) not null, primary key (id))
2022-05-13 22:33:08.365  INFO 13062 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation:
 [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2022-05-13 22:33:08.377  INFO 13062 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.springframework.boot.loader.jar.Handler (file:/home/wnathyelson/StsProjects/primeira-api/target/primeira-api-0.0.1-SNAPSHOT.jar) to constructor sun.net.www.protocol.jar.Handler()
WARNING: Please consider reporting this to the maintainers of org.springframework.boot.loader.jar.Handler
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
2022-05-13 22:33:08.713  WARN 13062 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during
 view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2022-05-13 22:33:09.120  INFO 13062 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-05-13 22:33:09.134  INFO 13062 --- [           main] h.nathyelson.sts.PrimeiraApiApplication  : Started PrimeiraApiApplication in 4.299 seconds (JVM running for 4.833)
