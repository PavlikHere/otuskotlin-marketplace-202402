rootProject.name = "otuskotlin-marketplace-202402"

include("m1l1-first")

pluginManagement {
    val kotlinVersion : String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}