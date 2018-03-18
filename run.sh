#!/bin/bash

# set -v

CLASSPATH=classes

if [ -z "$TARGET" ]; then
    echo 'undefined TARGET'
    exit 1
fi

javac -d $CLASSPATH -g $(dirname $TARGET)/*.java
java -cp $CLASSPATH codility/${TARGET%.*}
