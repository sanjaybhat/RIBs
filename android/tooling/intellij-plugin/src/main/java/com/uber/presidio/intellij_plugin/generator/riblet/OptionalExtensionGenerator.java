package com.uber.presidio.intellij_plugin.generator.riblet;

import com.uber.presidio.intellij_plugin.generator.Generator;

public class OptionalExtensionGenerator extends Generator {

  private static final String TEMPLATE_NAME = "RibletOptionalExtension.java.template";

  public OptionalExtensionGenerator(String packageName, String ribletName) {
    super(packageName, ribletName, TEMPLATE_NAME);
  }

  @Override
  public String getClassName() {
    return String.format("%sOptionalExtension", getRibletName());
  }
}