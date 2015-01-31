# Introduction

To install all dependencies (and an artifact) into your local maven, use

    curl https://raw.githubusercontent.com/mlesniak/runner/master/install-maven.sh|sh

Afterwards, you can bootstrap a new application with

    mvn archetype:generate -B                               \
      -DarchetypeGroupId=com.mlesniak.runner                \
      -DarchetypeArtifactId=quickstart                      \
      -DarchetypeVersion=1.0-SNAPSHOT                       \
                                                            \
      -DgroupId=com.mlesniak.example                        \
      -DartifactId=test                                     \
      -Dversion=1.0-SNAPSHOT


# Example

See [sonar-report](http://www.github.com/mlesniak/sonar-report) for an example.