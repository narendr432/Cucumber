#!/bin/bash
set -ex
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo apt install ./google-chrome-stable_current_amd64.deb
gradle_tasks="clean test"
base_gradle_parameters="\"-Dcucumber.options=--tags @smoke\"" #${TEST_GROUP}
gradle_parameters="$base_gradle_parameters"
chmod +x ./gradlew # making executable
echo "----------------> "$gradle_tasks $gradle_parameters $env_url
echo "$gradle_tasks $gradle_parameters $env_url" | xargs ./gradlew
