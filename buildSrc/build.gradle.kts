plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:3.27.1" )
    implementation("gradle.plugin.com.gorylenko.gradle-git-properties:gradle-git-properties:2.2.2")
}
