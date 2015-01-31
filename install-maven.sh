#!/bin/sh

rm -rf /tmp/execute-maven-plugin
rm -rf /tmp/runner

git clone https://github.com/mlesniak/execute-maven-plugin.git /tmp/execute-maven-plugin
git clone https://github.com/mlesniak/runner.git /tmp/runner

cd /tmp/execute-maven-plugin
mvn clean install -DskipTests

cd /tmp/runner
mvn install -DskipTests
cd parent
mvn install -DskipTests
cd ../archetype
mvn install

cat <<EOF
Finished. You can bootstrap a new project with

mvn archetype:generate -B                               \\
  -DarchetypeGroupId=com.mlesniak.runner                \\
  -DarchetypeArtifactId=quickstart                      \\
  -DarchetypeVersion=1.0-SNAPSHOT                       \\
                                                        \\
  -DgroupId=com.mlesniak.example                        \\
  -DartifactId=test                                     \\
  -Dversion=1.0-SNAPSHOT

EOF