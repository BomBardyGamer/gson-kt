plugins {
    kotlin("jvm") version "1.5.10"
    id("org.jetbrains.dokka") version "1.4.32"
    id("org.cadixdev.licenser") version "0.6.0"
    `maven-publish`
    signing
}

group = "me.bardy"
version = "1.3"

repositories {
    mavenCentral()
}

dependencies {
    api(kotlin("stdlib"))
    api("com.google.code.gson:gson:2.8.7")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    testImplementation(kotlin("test-junit5"))
}

kotlin {
    explicitApi()
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.create<Jar>("sourcesJar") {
    from(sourceSets.main.get().allSource)
    archiveClassifier.set("sources")
}

tasks.create<Jar>("javadocJar") {
    from(tasks["dokkaJavadoc"])
    archiveClassifier.set("javadoc")
}

publishing {
    repositories {
        maven {
            val releases = uri("https://repo.kryptonmc.org/releases")
            val snapshots = uri("https://repo.kryptonmc.org/snapshots")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshots else releases

            credentials {
                username = if (project.hasProperty("maven.username")) project.property("maven.username").toString() else System.getenv("MAVEN_USERNAME")
                password = if (project.hasProperty("maven.password")) project.property("maven.password").toString() else System.getenv("MAVEN_PASSWORD")
            }
        }
    }

    publications {
        create<MavenPublication>("mavenKotlin") {
            artifactId = "gson-kt"

            from(components["kotlin"])
            artifact(tasks["sourcesJar"])
            artifact(tasks["javadocJar"])

            pom {
                name.set("GsonKt")
                description.set("A collection of useful Kotlin extensions for working with Gson")
                url.set("https://github.com/BomBardyGamer/gson-kt")
                packaging = "jar"

                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }

                developers {
                    developer {
                        id.set("bombardygamer")
                        name.set("Callum Seabrook")
                        email.set("callum.seabrook@prevarinite.com")
                        timezone.set("Europe/London")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/BomBardyGamer/gson-kt.git")
                    developerConnection.set("scm:git:ssh://github.com:BomBardyGamer/gson-kt.git")
                    url.set("https://github.com/BomBardyGamer/gson-kt")
                }
            }
        }
    }
}

signing {
    sign(publishing.publications["mavenKotlin"])
}

license {
    header.set(project.resources.text.fromFile("HEADER.txt"))
    newLine.set(false)
}
