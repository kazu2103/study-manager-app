plugins {
    id("application") 
    id("java") 
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("io.micronaut.platform:micronaut-platform:4.1.3"))
    implementation("io.micronaut.starter:micronaut-starter-aws-cdk:4.1.2") {
      exclude(group = "software.amazon.awscdk", module = "aws-cdk-lib")
    }
    implementation("software.amazon.awscdk:aws-cdk-lib:2.93.0")
    testImplementation(platform("io.micronaut.platform:micronaut-platform:4.1.3"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
}
application {
    mainClass.set("com.kazu.studyManager.Main")
}
tasks.withType<Test> {
    useJUnitPlatform()
}

