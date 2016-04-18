

# Introduction #

This document describes how to set up a development environment suitable for working on the TèksMe components. It is also an interesting setup for working on components that make use of the TèksMe cloud communication services.

**Note**: this guideline is not intended for people who just want to use these tools: the target audience are those who want to contribute to their development by adding features, fixing bugs, etc.

We assume some familiarity with SVN concepts and some experience working with the Eclipse workbench. Although one could use [Yoxos](http://eclipsesource.com/en/yoxos) and create a custom Eclipse download, we will just use Eclipse's update feature and install things as we go.

# Software Environment #

In order to develop on components, you need Eclipse and an installed Java Runtime. We recommend installing Java 6 (also known as Java 1.6).

# Install Maven 3 #

[Download Maven 3](http://maven.apache.org) from Apache, unpack it and put the bin folder on your path. Check the installation by typing "mvn -version” in a shell. You should something like this:

```

mvn --version
Apache Maven 3.0 (r1004208; 2010-10-04 07:50:56-0400)
Java version: 1.6.0_20
Java home: /System/Library/Frameworks/JavaVM.framework/Versions/1.6.0/Home
Default locale: en_US, platform encoding: MacRoman
OS name: "mac os x" version: "10.6.4" arch: "x86_64" Family: "mac"

```

# Setting up the Eclipse Workspace #

## Installing the Eclipse Modeling package ##

The first thing you'll need is the Eclipse Helios (3.6.1) for your platform. Here is a pointer (if you don't have it yet) to the download page: http://www.eclipse.org/downloads/

Grab the Eclipse Modeling Tools (includes Incubating components) flavor at the very bottom and unpack the archive into a convenient path.

To keep your Eclipse up-to-date, you can update plugins by software updater (help-->software updates...)

## Installing the Web, XML, and Java EE Development Tools ##

Just go to “Install New Software…” option in “Help” menu of Eclipse and in the drop down menu, drag down to the Helios line, which points to the site containing popular software installs for this (Helios) version of Eclipse.

Now, you may want to expand the “Web, XML, and Java EE Development” entry. Select the following tools:

  * Eclipse Java EE Developer Tools
  * Eclipse Web Developer Tools, including HTML, CSS, XHTML, etc
  * Eclipse XML Editors and Tools
  * JavaServer Faces Tools (JSF) Project
  * Web Page Editor

Also, please expand the “  EclipseRT Target Platform Components” entry and select the following tools:

  * Equinox Target Components
  * Jetty Target Components

And expanding the “General Purpose Tools”, select the following:
  * Jetty OSGi tooling for PDE

Please hit “Next” twice and follow the menus to install this component into Eclipse. When done, Eclipse will suggest that you restart the IDE, so please go-ahead and do it.

## Installing EMF (Eclipse Modeling Framework) Teneo ##

Teneo is a Model-Relational mapping and runtime database persistence solution for the Eclipse Modeling Framework (EMF). Teneo integrates EMF with both Hibernate and EclipseLink. The EMF - Hibernate integration supports persisting of basic EObjects, ELists with 1:n, n:m, one-way, two-way and contained relations. EMF Objects can be retrieved using HQL queries.

Just go to “Install New Software…” option in “Help” menu of Eclipse and in the drop down menu, drag down to the Helios line, which points to the site containing popular software installs for this (Helios) version of Eclipse.

Now, you may want to expand the “Modeling” entry. Click on “EMF Teneo Hibernate SDK” and you are ready to go. Follow the installations steps and when done, Eclipse will suggest that you restart the IDE, so please do that.

To run Teneo you need the following software:

  * EMF 2.5 (Teneo 1.1.`*`) or 2.6 (Teneo 1.2.`*`)
  * Hibernate 3.6.0 and its dependencies
  * Apache commons logging
  * JDBC driver

To download and install these dependencies, use the following update site:

  * Hibernate and other dependencies: http://www.elver.org/eclipse/update

Go to the  “Install New Software…” option in “Help” menu of Eclipse, click on the “Add...” button and in the “Add Repository” popup put the information above. Please select all entries but HSQLDB. Follow the installations steps and when done, Eclipse will AGAIN suggest that you restart the IDE, so please do that.

## Installing the Subversive Plug-in ##

Subversion support is needed simply because the sources are kept in an SVN repository. Eclipse does not support SVN out of the box; a plug-in is required to make it work. Details on how to use SVN with Eclipse can be found on the Internet; here we will merely go trough the installation process.

The following instructions will guide you on how to install the [subversive Eclipse plug-in](http://www.eclipse.org/subversive/) that allows Eclipse to use SVN.

Just go to “Install New Software…” option in “Help” menu of Eclipse and in the drop down menu, drag down to the Helios line, which points to the site containing popular software installs for this (Helios) version of Eclipse.  Eclipse will now look for all of the software packages that are available.  This step can take considerable time and you may see Pending…. or some other such message for a while in the window. Be patient.

Now, you may want to expand the “Collaboration” entry.  When that expands, scroll down and select the “Subversive SVN Team Provider” entry, and follow the next menus to install this component into Eclipse.  When done, Eclipse will suggest that you restart the IDE, so please do that.

After restart, select Help... Check for updates and follow the instructions to install the update to the SVN plugin.  When done, Eclipse will suggest that you restart the IDE, so do that once again.

The very first time you use Eclipse’s SVN explorer, you may be asked to install a “SVN Connector”. In that case, choose the most recent (highest revision number) of the SVN Kit choices that are offered to you.  These are pure Java components, so they work with any operating system or platform. Restart Eclipse, and then retry whatever you were doing.

You should be ready to access your repository. Follow the http://code.google.com/p/teksme/source/checkout site instructions carefully and get help if you need it.

## Installing Apache Maven plug-in ##

Go to “Eclipse Marketplace…” option in “Help” menu of Eclipse . The first time you open the Eclipse Marketplace, you will be asked to select a Marketplace. Select the Eclipse Marketplace.

Maven Integration for Eclipse is separated into two components: the Core of Maven Integration for Eclipse and an optional package of extra-unsupported components. To install the core component of Maven Integration for Eclipse, open the Eclipse Marketplace, select the Search tab, and search for "Maven Integration”. Click on the Install button to the right of “Maven Integration for Eclipse”. Select the required component "Maven Integration for Eclipse (Required)", and follow the next menus to install this component into Eclipse.

## Installing Maven 2 Eclipse Tycho extension ##

Tycho is focused on a Maven-centric, manifest-first approach to building Eclipse plug-ins, features, update sites, RCP applications and OSGi bundles. Tycho is a set of Maven plugins and extensions for building Eclipse plugins and OSGi bundles with Maven.

This Eclipse plug-in lets you import Tycho and maven-bundle-plugin projects as Maven  projects into eclipse workspace. For maven-bundle-plugin projects it  will automatically generate bundle manifest during import.

Projects get both PDE and Maven natures/builders configured, so you can  mix and match Tycho and maven-bundle-plugin as part of the same  workspace. You can also enable Maven-specific behavior, like code  generation, for Tycho projects.

To install, just go to “Install New Software…” option in “Help” menu of Eclipse and click on the “Add...” button and in the “Add Repository” popup put the following information:

  * Name: M2E Tycho Project Configurations and Location: https://repository.sonatype.org/content/repositories/forge-sites/m2eclipse-tycho/0.4.4/N/0.4.4.201102021112

Follow the installations steps and when done, Eclipse will suggest that you restart the IDE, so please do that.

## Installing Dependencies using Eclipse Orbit ##

This project provide a repository of bundled versions of third party libraries that are approved for use in one or more Eclipse projects. The repository will maintain old versions of such libraries to facilitate rebuilding historical output.

### Apache Commons and Javax.`*` dependencies ###

To install it, go to the “Install New Software…” option in “Help” menu of Eclipse and click on the “Add...” button and in the “Add Repository” popup put the following information:

  * Name: Orbit repository and Location: http://download.eclipse.org/tools/orbit/downloads/drops/S20110124210048/repository

Select the following entries from the list:

  * Java XML Streaming API
  * Java Server Pages Standard Tag Library API Bundle
  * Java Persistence API
  * geronimo Javax Transaction API 1.1.1 spec
  * Apache Commons Collections
  * Apache Commons Codec Plug-in

Follow the installations steps and when done, Eclipse will suggest that you restart the IDE, so please do that.

# Installing RabbitMQ #

RabbitMQ provides robust messaging for applications. It is easy to use, fit for purpose at cloud scale and supported on all major operating systems and developer platforms.

## Mac OS X with `MacPorts` ##

Users of Mac OS X who do not use MacPorts can use the Generic Unix installation instructions instead. You can find it here: http://www.rabbitmq.com/install.html#generic-unix

A portfile for the RabbitMQ server is included in MacPorts. From the MacPorts home page:

  * The MacPorts Project is an open-source community initiative to design an easy-to-use system for compiling, installing, and upgrading either command-line, X11 or Aqua based open-source software on the Mac OS X operating system.

RabbitMQ maintains a dedicated MacPorts repository, which you should use to install the latest RabbitMQ server version via MacPorts, as officially released MacPorts packaging may not always contain the lastest released version of RabbitMQ.
(NB It can take a very long time to install other macport updates - see `man port` for options).

### Install the Server ###

Installation of the version of the RabbitMQ server distributed with MacPorts is as simple as (`sudo port sync` followed by)

```
sudo port install rabbitmq-server
```

### Run RabbitMQ Server ###

To start the server, you can either use launchctl (see the instructions emitted during the `sudo port install` step) or you can start it from the command line with `sudo rabbitmq-server -detached`.

The `rabbitmq-server`, `rabbitmqctl`, and other RabbitMQ-related scripts on the path automatically (through sudo) run in the context of the rabbitmq user, so that the Erlang cookie can be read from (sudo) `$MACPORTS_PREFIX/var/lib/rabbitmq/.erlang.cookie`.

See the General Linux installation section for further information.


# More information #

  * Maven Integration (M2E) http://eclipse.org/m2e
  * Apache Maven http://maven.apache.org/
  * Tycho - Building Eclipse plug-ins with maven http://www.eclipse.org/tycho/
  * Subversive - SVN Team Provider http://www.eclipse.org/subversive/
  * RabbitMQ http://www.rabbitmq.com/