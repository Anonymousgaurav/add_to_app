pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
    }
    repositories {
        maven {
            url = uri("/Users/gauravswarankar/StudioProjects/flutter_add_to_app/build/host/outputs/repo")
            metadataSources {
                mavenPom()
            }
        }
        maven {
            url = uri("https://storage.googleapis.com/download.flutter.io")
        }
    }
}

rootProject.name = "native_kotlin"
include(":app")
 