package com.example

import org.gradle.api.Plugin
import org.gradle.api.Project

class ExamplePlugin implements Plugin<Project> {
  void apply(final Project project) {
    project.plugins.withId('ivy-publish') {
      project.plugins.hasPlugin('jacoco')
    }
    //Works if:
    //this part is removed
    //ivy-publish is applied before ExamplePlugin
    //build with Java 7 instead of Java 8
    //build with Gradle 2.3 instead of 2.4/2.5
    project.plugins.withId('maven-publish') {
      project.plugins.hasPlugin('jacoco')
    }
  }
}
