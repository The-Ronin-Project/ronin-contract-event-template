rootProject.name = "ronin-contract-event-template"

pluginManagement {
    plugins {
        id("com.projectronin.json.contract") version "2.0.0-feature-new-version-new-standards-SNAPSHOT"
    }

    repositories {
        maven {
            url = uri("https://repo.devops.projectronin.io/repository/maven-public/")
        }
        mavenLocal()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://repo.devops.projectronin.io/repository/maven-public/")
        }
        mavenLocal()
        gradlePluginPortal()
    }
}
