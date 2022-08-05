# org.dspace:oclc-harvester2

The oclc-harvester2 Open Source Software (OSS) project is a Java application that provides an OAI-PMH harvester framework.

This codebase is adapted to DSpace, based on two prior projects:
* https://github.com/OCLC-Research/oaiharvester2/ - The original codebase, built by OCLC under Apache 2.0 license
* https://github.com/sasund/oai-harvester2 - A fork/update of that OCLC codebase to adapt it to Maven build process and update dependencies to use only Java API from JRE.

This codebase is a fork of https://github.com/sasund/oai-harvester2, and adapts that project more directly to DSpace.

Updates for DSpace include:
* Minor updates have been made to the codebase to ensure the tests utilize the DSpace demo server
* Updates to POM to ensure the entire project can be released to Maven Central (as `org.dspace:oclc-harvester2`)
* Add GitHub action to automatically rebuild / test any changes

### Maven repository
https://search.maven.org/artifact/org.dspace/oclc-harvester2

```
<dependency>
  <groupId>org.dspace</groupId>
  <artifactId>oclc-harvester2</artifactId>
   <version>1.0.0</version>
</dependency>
```
