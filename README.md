# Event Driven Development with Java and RabbitMQ

# 1. Overview

This repository contains the instructions to create and implement an event driven development (EDD) using Spring Boot and RabbitMQ.

This example of EDD contains the producer and listener. The producer will be the responsible to send user to the queue using a REST controller, the listener will be listening messages from the queue in RabbitMQ and will process the messages, once a message is read the output will be "Welcome to the system, user".

# 2. Environment Prerequisites

## Windows
1. Install Chocolatey.
	[Documentation](https://chocolatey.org/install)
Read the documentation and install chocolatery package manager into you computer.

2. Install RabbitMQ
  [Documentation](https://community.chocolatey.org/packages/rabbitmq)
Once you have installer Chocolatey, open a new command line and execute the bellow command. 
    ```
    choco install rabbitmq
    ```
4. Install IntelliJ Community Edition
   [Documentation](https://www.jetbrains.com/es-es/idea/download/?section=windows)
You can use other IDE if you want, IntelliJ is recommended.
## MacOs
## Linux
