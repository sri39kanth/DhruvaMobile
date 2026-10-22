// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.ktlint) apply true
    alias(libs.plugins.detekt) apply true
    alias(libs.plugins.kover) apply false
    alias(libs.plugins.sonarqube) apply true
}

detekt {
    basePath = projectDir
}

sonar {
    properties {
        property("sonar.projectKey", "sri39kanth_DhruvaMobile")
        property("sonar.organization", "sri39kanth")
        property(
            "sonar.coverage.jacoco.xmlReportPaths",
            "$rootDir/app/build/reports/kover/reportDebug.xml",
        )
    }
}
