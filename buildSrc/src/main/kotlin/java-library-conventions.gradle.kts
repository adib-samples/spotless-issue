plugins {
    `java-library`
    jacoco
    checkstyle
    id("com.diffplug.gradle.spotless")
    id("com.gorylenko.gradle-git-properties")
}

val developmentOnly by configurations.creating // used by spring boot devtools
configurations {

    // don't allow version conflicts for production code
    compileClasspath {
        resolutionStrategy.failOnVersionConflict()
    }
    runtimeClasspath {
        extendsFrom(developmentOnly)
        resolutionStrategy.failOnVersionConflict()
    }

    // don't allow version conflicts for test code
    testCompileClasspath {
        resolutionStrategy.failOnVersionConflict()
    }
    testRuntimeClasspath {
        resolutionStrategy.failOnVersionConflict()
    }

    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation(platform(project(":platform")))
    implementation("org.springframework.boot:spring-boot-starter")
    api("com.google.guava:guava")
    testImplementation("nl.jqno.equalsverifier:equalsverifier")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}

tasks.test {
    useJUnitPlatform()
    finalizedBy("jacocoTestReport")
}

tasks.jacocoTestReport {
    reports {
        xml.isEnabled = true
        xml.destination = file("${buildDir}/jacoco/test.xml")
        html.isEnabled = true
        html.destination = file("${buildDir}/jacoco/html")
    }
}

tasks.jacocoTestCoverageVerification {
    violationRules {
        rule {
            limit {
                minimum = "0.1".toBigDecimal()
            }
        }
    }
}

tasks.compileJava {
    options.compilerArgs.add(element = "-parameters");
}

checkstyle {
    toolVersion = "8.28"
    configDirectory.set(rootProject.file("src/checkstyle"))
    isShowViolations = true
    maxErrors = 0
    maxWarnings = 0
    isIgnoreFailures = false
}

spotless {
    java {
        googleJavaFormat()
        @Suppress("INACCESSIBLE_TYPE")
        licenseHeaderFile("${rootDir}/src/spotless/demo.license.java")
    }
}
