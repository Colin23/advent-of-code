plugins {
    java
    idea
    id("io.freefair.lombok") version "8.10"
}

group = "com.colinmoerbe"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21 // Gradle should use Java 21 features and Syntax when compiling
    toolchain {
        // Gradle checks for a local Java 21 version and uses it if one is found.
        // If there's no local version, the build crashes. The foojay-resolver-convention plugin is needed then.
        languageVersion.set(JavaLanguageVersion.of(21))
        vendor = JvmVendorSpec.ADOPTIUM // Gradle uses Eclipse Temurin (AdoptOpenJDK HotSpot)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}
