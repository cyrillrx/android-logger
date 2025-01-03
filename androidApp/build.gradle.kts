plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.cyrillrx.companion.android"
    compileSdk = Version.COMPILE_SDK

    defaultConfig {
        applicationId = "com.cyrillrx.companion.android"
        minSdk = Version.MIN_SDK
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = Version.java
        targetCompatibility = Version.java
    }
    kotlinOptions {
        jvmTarget = Version.JVM_TARGET
    }
}

dependencies {
    implementation(projects.logger.lib)
    implementation(projects.tracker.lib)

    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.androidx.activity.compose)
    debugImplementation(libs.compose.ui.tooling)
}