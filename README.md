# OAIHarvester2

The OAIHarvester2 Open Source Software (OSS) project is a Java application that provides an OAI-PMH harvester framework.

This is a copy of the [original OAIHarvester2](http://www.oclc.org/research/activities/oaiharvester2.html) with some changes:
-   Build system changed to maven
-   Remove all dependencies and use only Java API from JRE.
-   clean up sources (ThreadLocal, StringBuilder instead of StringBuffer, Slf4j logger, etc.)
-   Rewrite all tests to use new junit and fix test URLs.

### Maven repository
There is no public maven repository with this bundle. You have to build and deploy it to your maven repository.
