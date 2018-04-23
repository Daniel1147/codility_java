#!/bin/bash

set -u

source ./config.sh

if [ -z ${NEW_PACKAGE+x} ]; then
    read -p $'new package name(NEW_PACKAGE): \n' NEW_PACKAGE
fi

mkdir "$MAIN_ROOT/$NEW_PACKAGE"
mkdir "$TEST_ROOT/$NEW_PACKAGE"

cp $SOLUTION_TEMPLATE "$MAIN_ROOT/$NEW_PACKAGE/Solution.java"
cp $TEST_TEMPLATE "$TEST_ROOT/$NEW_PACKAGE/TestSolution.java"
export TEST_CLASS="$ROOT_PACKAGE.$NEW_PACKAGE.TestSolution"
