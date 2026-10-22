// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.ktlint) apply true
    alias(libs.plugins.detekt) apply true
    alias(libs.plugins.kover) apply false
}

detekt {
    basePath = projectDir
}
