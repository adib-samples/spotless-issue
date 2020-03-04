plugins {
    `java-library-conventions`
}

dependencies {
    implementation(project(":core"))
    implementation(project(":email"))
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")

    testImplementation(testFixtures(project(":core")))
    testImplementation(testFixtures(project(":email")))
}
