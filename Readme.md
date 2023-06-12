# Readme

This repo includes code to reproduce the problem, 
that spring-data-jdbc from spring-boot versions > 3.0.5 does not call BeforeConvertCallback anymore.

## Steps to reproduce the worst case
 
- edit build.gradle with a spring-boot-version > 3.0.5
- run CustomerRepoTest in src/main/test/de/becoca/CustomerRepoTest
- this test uses testcontainers to start a postgres db

## Steps to reproduce the happy case

- edit build.gradle with a spring-boot-version = 3.0.5
- run CustomerRepoTest in src/main/test/de/becoca/CustomerRepoTest
- this test uses testcontainers to start a postgres db