// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}

buildscript {
    val compose_version by extra("1.4.2")
    val camerax_version by extra("1.0.0-rc01")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}