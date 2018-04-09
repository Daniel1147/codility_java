#!/bin/bash

set -u

source ./config.sh

# NPACKAGE: new package name

TEMPLATE_PACKAGE=min_max_division
TEMPLATE_SOLUTION=Solution.java
TEMPLATE_TEST=TestMinMaxDivision.java

mkdir $MAIN_ROOT/$NPACKAGE
mkdir $TEST_ROOT/$NPACKAGE

cp $SOLUTION_TEMPLATE $MAIN_ROOT/$NPACKAGE/Solution.java
cp $TEST_TEMPLATE $TEST_ROOT/$NPACKAGE/TestSolution.java
