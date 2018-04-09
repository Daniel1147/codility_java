#!/bin/bash

ROOT_PACKAGE=codility
DESC=classes

TEST_DIR=src/test/java/$ROOT_PACKAGE
MAIN_DIR=src/main/java/$ROOT_PACKAGE
JUNIT_RUNNER="org.junit.runner.JUnitCore"
CLASS_PATH=$DESC:$CLASSPATH
