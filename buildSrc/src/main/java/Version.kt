import org.gradle.api.JavaVersion

object Version {
    const val kotlin = "1.5.21"

    const val compileSdk = 30
    const val buildToolsVersion = "30.0.2"

    const val minSdk = 21
    const val targetSdk = 30

    const val jvmTarget = "11"
    val java = JavaVersion.VERSION_11
}
