#!/bin/bash

git show --name-only | grep "(ingraph-compiler|opencypher-report)/"
[ "$TRAVIS_BRANCH" = "master" -a "$TRAVIS_PULL_REQUEST" = "false" -a $? -ne 0 ]
