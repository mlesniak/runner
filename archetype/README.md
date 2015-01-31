# Introduction

This project contains a maven archetype for the script runner.

    mvn archetype:generate -B                               \
      -DarchetypeGroupId=com.mlesniak.runner                \
      -DarchetypeArtifactId=quickstart                      \
      -DarchetypeVersion=1.0-SNAPSHOT                       \
                                                            \
      -DgroupId=com.mlesniak.example                        \
      -DartifactId=test                                     \
      -Dversion=1.0-SNAPSHOT
