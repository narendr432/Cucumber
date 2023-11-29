#!/bin/bash

gradle_tasks="clean test"
base_gradle_parameters="-Ptest.group=${TEST_GROUP}"
gradle_parameters="$base_gradle_parameters"
chmod +x ./gradlew # making executable
echo "$gradle_tasks $gradle_parameters $env_url" | xargs ./gradlew


