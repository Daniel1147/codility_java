#!/bin/bash

ROOT_PACKAGE=codility
# ROOT_PACKAGE=leetcode
# ROOT_PACKAGE=random
DESC=classes

TEST_DIR=src/test
TEST_ROOT=$TEST_DIR/java/$ROOT_PACKAGE
MAIN_DIR=src/main
MAIN_ROOT=$MAIN_DIR/java/$ROOT_PACKAGE
# JUNIT_RUNNER="org.junit.runner.JUnitCore"
# CLASS_PATH=$DESC:$CLASSPATH
SOLUTION_TEMPLATE=$MAIN_DIR/resource/template/SolutionTemplate.java
TEST_TEMPLATE=$TEST_DIR/resource/template/TestSolutionTemplate.java
