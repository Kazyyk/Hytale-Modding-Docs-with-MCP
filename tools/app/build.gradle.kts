plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.vineflower)
    implementation(libs.javaparser)
    implementation(libs.gson)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

application {
    mainClass = "com.hytale.indexer.Main"
    applicationDefaultJvmArgs = listOf("-Xmx4g")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
