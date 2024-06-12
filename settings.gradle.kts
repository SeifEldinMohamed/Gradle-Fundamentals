pluginManagement {
    repositories.gradlePluginPortal()
    // repositories.mavenCentral()
//    repositories.google()
//
//    repositories.maven("https://my.location/repo"){
//        credentials.username = "..."
//        credentials.password = "..."
//    }
   includeBuild("gradle/plugins")
}


dependencyResolutionManagement {
    repositories.mavenCentral()
//    repositories.google()
//    repositories.maven("https://my.location/repo"){
//        credentials.username = "..."
//        credentials.password = "..."
//    }

    // to tell gradle that there is another Gradle build somewhere that can potentially build
    // a component we need
  //  includeBuild("../my-other-project")
}


// given a fixed name to the build ( not necessary needed) but it's helpful because the name sometimes turns up in reports.
rootProject.name = "my-project"
   // if we don't set a name it's derived from folder name.


// app
// presentation
// domain
// data

// to have these components in terms of created subprojects by using include()

include("app")
include("presentation")
include("domain")
include("data")