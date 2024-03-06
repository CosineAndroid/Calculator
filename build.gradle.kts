plugins {
    kotlin("jvm") version "1.7.21"
}

group = "kr.cosine.calculator"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}