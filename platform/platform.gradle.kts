plugins {
    `java-platform`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(enforcedPlatform("org.springframework.boot:spring-boot-dependencies:2.2.5.RELEASE"))
    constraints {
        api(project(":core"))
        api(project(":email"))
        api(project(":security"))
        api(project(":app"))
        api("com.github.bbottema:emailaddress-rfc2822:2.1.4")
        api("com.icegreen:greenmail:1.5.11")
        api("nl.jqno.equalsverifier:equalsverifier:3.1.12")
        api("com.google.guava:guava:28.2-jre")
    }
}
