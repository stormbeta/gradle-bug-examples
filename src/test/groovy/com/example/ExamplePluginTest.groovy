package com.example

import com.example.ExamplePlugin
import spock.lang.Specification
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.publish.ivy.plugins.IvyPublishPlugin

class ExamplePluginTest extends Specification {
  def "can apply example plugin before ivy-publish"() {
    setup:
    def project = ProjectBuilder.builder().build()
    expect:
    project.plugins.apply ExamplePlugin
    project.plugins.apply IvyPublishPlugin
  }
}
