val moduleVersion = "1.6.1"
project.version = moduleVersion

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = Version.compileSdk

    defaultConfig {
        minSdk = Version.minSdk
        targetSdk = Version.targetSdk
        version = moduleVersion
    }

    kotlinOptions {
        // Needed for all xxx.lib modules to prevent duplicate file "META-INF/*lib.kotlin_module"
        moduleName = "com.cyrillrx.logger"
        jvmTarget = Version.jvmTarget
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
