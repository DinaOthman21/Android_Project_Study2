// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    //hilt
    id ("com.google.dagger.hilt.android") version "2.46" apply false
    id ("org.jetbrains.kotlin.plugin.serialization") version "1.8.21"
}