object App {
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Versions{
    const val kotlin         = "1.7.20"
    const val gradle         = "7.2.2"
    const val sqlDelight     = "1.5.3"

    const val compose         = "1.2.0"
    const val coil            = "1.4.0"
    const val activityCompose = "1.5.1"
    const val navigation      = "2.5.1"

    const val material        = "1.6.1"

    const val coroutines = "1.6.4"
    const val koin       = "3.1.6"
    const val ktor       = "2.1.3"

    const val minSdk     = 23
    const val compileSdk = 32
    const val targetSdk  = 32

    const val kotlinxSerializationCore = "1.3.3"
    const val kotlinxCoroutinesCore    = "1.6.3-native-mt"
}

object Libraries {
    const val kotlin              = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
    const val gradle              = "com.android.tools.build:gradle:${Versions.gradle}"
    const val sqlDelight          = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"

    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val koinAndroid       = "io.insert-koin:koin-android:${Versions.koin}"
    const val koinCore          = "io.insert-koin:koin-core:${Versions.koin}"
    const val ktorCore          = "io.ktor:ktor-client-core:${Versions.ktor}"
    //const val ktorSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
    const val ktorAndroid       = "io.ktor:ktor-client-android:${Versions.ktor}"
    const val ktorContentNego       = "io.ktor:ktor-client-content-negotiation:${Versions.ktor}"
    const val ktorJsonSerialization       = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktor}"

    object Compose {
        const val activity         = "androidx.activity:activity-compose:${Versions.activityCompose}"
        const val ui               = "androidx.compose.ui:ui:${Versions.compose}"
        const val material         = "androidx.compose.material:material:${Versions.compose}"
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
        const val navigation       = "androidx.navigation:navigation-compose:${Versions.navigation}"
        const val coil             = "io.coil-kt:coil-compose:${Versions.coil}"
    }

    object Common {
        const val sqlDelight               = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
        const val sqlDelightExtension      = "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
        const val kotlinxSerializationCore = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinxSerializationCore}"
        const val kotlinxCoroutinesCore    = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutinesCore}"
    }

    object Android {
        const val sqlDelight = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
    }

    object IOs {
        const val ktorClient = "io.ktor:ktor-client-ios:${Versions.ktor}"
        const val sqlDelight = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
    }
}

object SupportLibraries {
    const val material = "com.google.android.material:material:${Versions.material}"
}
