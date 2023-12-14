### `You are currently reading readme markdown (md) file (readme.md)`

# Springboot-Junit-Course
This repository is for proof of concept (POC) of Junit5, in reference to udemy course on Junit5 and Mockito.

JUnit5 lifecycle :

@BeforeAll --- Executed before all tests across all classes, in order initialise parameters required across the system to tests
@BeforeEach -- Executed before all tests across in specific class, in order initialise parameters required in the class to tests
@Test
@AfterEach --- Executed after all tests across all classes, in order to do cleanup across the system
@AfterAll ---- Executed after all tests across in specific class, in order to do cleanup required in the class

![Junit5 Lifecycle](https://github.com/SanketKutumbe/Springboot-Junit-Course/assets/30076041/9c5bb676-d693-4cd3-bf0b-ac1a53d1701f "Junit5 Lifecycle")

Points to remember:
1) JUnit creates a new instance of each test class before executing each test method
2) The @AfterEach annotation will make a method execute after each @Test method. Not after each Test class.


# TDD Lifecycle:

<img alt="TDD Lifecycle" src="C:\Users\sanket.kutumbe\Pictures\Screenshots\Screenshot 2023-12-14 101418.png" title="TDD Lifecycle"/>

