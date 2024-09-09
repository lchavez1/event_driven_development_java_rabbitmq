# Event Driven Development with Java and RabbitMQ

# 1. Overview

This repository contains the instructions to create and implement an event driven development (EDD) using Spring Boot and RabbitMQ.

### What Is Event-Driven Architecture?

*Event-driven architecture (EDA) is a software design pattern that allows systems to detect, process, manage, and react to real-time events as they happen. With EDA, the second an event occurs, information about that event is sent to all the apps, systems, and people that need it in order to react in real time. From multiplayer games, online banking, and streaming services, to generative AI, over 72% of global organizations use EDA to power their apps, systems, and processes.* (Counfluent.io, s.f., event-driven-architecture).

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
3. Install IntelliJ Community Edition
   [Documentation](https://www.jetbrains.com/es-es/idea/download/?section=windows)
You can use other IDE if you want, IntelliJ is recommended.
## MacOs
## Linux

# 3. Build Instructions
1. Start the RabbitMQ server (http://localhost:15672).
2. Create the queue into RabbitMQ name = "user.queue", bind = "user.queue". [Documentation](https://www.cloudamqp.com/blog/part3-rabbitmq-for-beginners_the-management-interface.html).
3. Execute the event_driven_producer main class (event_driven_producer/src/main/java/com/luis/event_driven_producer/EventDrivenProducerApplication.java).
4. Go to Postman and send a POST request to "localhost:8080/user/{name} (eg. localhost:8080/user/Luis).
5. The listener should be listening and procesing the messages.

# 4. Instructions

## 4.1 Functional Requirements
In this [link](./functional_requirements_example.md) you will find the definition of all expected functionallity.

## 4.2 Business Rules

## 4.3 Technical Requirements

# 5. Testing and Validation Requisites

(Incluir pantallas)

# 6. Acceptance Criteria

## 6.1 Evaluation criteria

* **Functionality:** Does the application meet the specified requirements?
* **Code quality:** Is the code well structured, readable, and meets best practices?
* **Tests:** Are there unit tests for critical components and do they all pass 100%?
* **Documentation:** Is the project well documented and does it provide clear instructions for setup and use?
  
## 6.2 Expected documentation and deliverables

* Include clear instructions for API endpoints and data structures. (Especificar a que se refiere... swager?)
* Document any additional features or functionality implemented.

(Elaborar un poco mas las instrucciones aclarar que sea la rama main, del fork.) 
* Submit your project as a GitHub repository to your tutor, specify the appropriate branch.
* Include a clear README.md (especificar que es uno nuevo no el del code challenge, o especificar que secciones va a actualizar y que secciones del README original se mantienen. Definir que debe de contener el README.) file that explains your project, its features, and how to run it.
* Include Postman collection for easy review. (especificar ambos pantallazos y archivo. Detallar cada entregable)

# 7. Resources
[What Is Event-Driven Architecture?](https://www.confluent.io/es-es/learn/event-driven-architecture/#:~:text=Event-driven%20architecture%20%28EDA%29%20is%20a%20software%20design%20pattern,it%20in%20order%20to%20react%20in%20real%20time.)
