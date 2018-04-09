#!/bin/bash

set -u

source ./config.sh

# NPACKAGE: new package name

TEMPLATE_PACKAGE=min_max_division
TEMPLATE_SOLUTION=Solution.java
TEMPLATE_TEST=TestMinMaxDivision.java

mkdir $MAIN_DIR/$NPACKAGE
mkdir $TEST_DIR/$NPACKAGE

cp $MAIN_DIR/$TEMPLATE_PACKAGE/$TEMPLATE_SOLUTION $MAIN_DIR/$NPACKAGE
cp $TEST_DIR/$TEMPLATE_PACKAGE/$TEMPLATE_TEST $TEST_DIR/$NPACKAGE/TestSolution.java
