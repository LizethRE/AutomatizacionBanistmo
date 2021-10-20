package com.banistmo.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@run",
        glue = "com/banistmo/reto/stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {}