plugins {
    `java-library-conventions`
    `java-test-fixtures-conventions`
}

dependencies {

    implementation(project(":core"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-mail")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    annotationProcessor(platform(project(":platform")))
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    testImplementation(testFixtures(project(":core")))
    testImplementation("com.icegreen:greenmail")
}
