# Populatron

## Objectives

- Practice outside-in testing with TDD
- Refactor code into testable units
- Isolate and mock hard-to-test final JVM classes
- Isolate and mock dependencies that use IO
- Isolate application from entry point 
- Use mockito to mock classes
- Use behavior-based and state-based testing techniques
- Use Guice to inject dependencies

## Rationale

Real-life applications are complex. Naive programmers programmers will create complex monoliths which are hard to test.

Adherents to TDD will create complex applications composed of simple modules.

This exercise gives students an isolated practice problem to hone their skills.

## Background

In this repository you will find a csv file containing information on the cities in the world.

You will also find a gradle project with a single entry point and a single integration test.

The test follows the out-side in paradigm, and the current state is green.

Now it is time for you to refactor this monolith into smaller classes, writing unit tests for each one as you go.

## TODO

1. Isolate the entry point from the application class. No notion command line arguments or console output should leak into the application class itself. If this was turned into a web-based app tomorrow, it should be easy as pie.
1. Isolate file IO from the app. Disk access is brittle (incorrect paths, disk full, access denied). Refactor file IO into it's own class so it can be mocked.
1. Re-wire your app and tests to use Google Guice to inject dependencies.
1. Use mockito to mock and inject your file IO class.
1. Isolate your CSV parsing logic from your app by refactoring it into a parser that returns an generic list of POJOs. Use reflection to initialize the POJOs.
1. Isolate your CSV parser from reflection logic and file IO. The parser should only be concerned with parsing.

## Stretch

1. Write a pure unit test for your file IO module using PowerMock to mock the JDK IO classes.
1. Refactor all your tests to use behavior based testing and mock all dependencies.