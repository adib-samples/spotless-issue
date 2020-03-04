plugins {
    application
    `java-library-conventions`
    id("org.springframework.boot") version "2.2.2.RELEASE"
}

application {
    mainClassName = "com.example.Application"
}

dependencies {
    implementation(project(":core"))
    implementation(project(":email"))
    implementation(project(":security"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    testImplementation("org.flywaydb:flyway-core")
    testImplementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testRuntimeOnly("org.postgresql:postgresql")
}
