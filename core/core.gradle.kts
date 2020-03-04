plugins {
    `java-library-conventions`
    `java-test-fixtures-conventions`
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-cache")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.github.bbottema:emailaddress-rfc2822")
    implementation("org.flywaydb:flyway-core")
    implementation("org.freemarker:freemarker")
    runtimeOnly("com.h2database:h2")
}
