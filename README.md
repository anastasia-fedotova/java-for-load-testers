# Java for Load Testers Training #jet-infosystems
40 hrs.

# Objectives
- Know Java application corner cases for effective testing
- Develop Java-based load tests
 
# Agenda
## Java platform intro (1 hrs / including 0.5 hr practice)
- Platform Objectives
- Platform key features
- JVM, JRE, JDK
- JDK structure
- JDK installation
- Development cycle
- Build and run simple Java application
- Compilers in Java: compile-time and JIT, run-time optimizations
 
## Java application structure (2/1)
- Java application
- Class
- Class responsibility
- Class methods
- Method intention
- Developing simple application of two classes

### Compiling app
- Sourcepath
- Compile-time classpath 

### Running app
- Dynamic classloading
- Run-time classpath
- Packages
- Directive for namespace import
- Folders for packages
- JARs

### All together
- Build cycle
- Compiler arguments
- JVM arguments

## Intro to Maven (1/0.5)
- Build cycle
- Plugins
- pom.xml
- Dependencies
- Repo scopes

### Building simple application
- $M2_HOME
- mvn clean verify site

## Intro to git (2/0.5)
- Versioning value

### Local versioning cycle with DVCS
- Init
- Working dir
- Local repo
- Commit
- Branch
- Checkout

### Remote versioning cycle with DVCS
- Remote repos
- Origin
- Pulling
- Pushing
- Merging

### Configuration patterns
- Git flow
- Branch owners and policies
- Stable master
- Integration with dev
- Feature branches

### Working flow setup
- Clone trainers repo
- Group branch: actual agenda, examples
- Trainee pair branches: Pull Requests for review and feedback

## Java syntax for procedure style (3/1)
### Comments
- Single-line and multi-line
- JavaDoc

### Procedure style intro
- Intro to procedure style
- Class emulating packages
- Class methods declaration
- Class variables
- Class constants
- Java Dictionary for naming
- Naming convention
- Static import
- Static initializers

### Overloading
- Methods overloading

#### Lab: Procedure design for application
- FR: Chat application: send and receive messages, analytics, log messages, store messages for history, commands. 
- Architecture: client app, server app.
- TODO: classes and stubs for methods w/o parameters. 

### Call stack and Heap
- Local variables
- Parameters as local variables
- Primitive vs Reference types
- Call stack
- Method parameter passing styles

#### Lab: Components API
- Introduce parameters

## Built-in primitive types and operators (4/1)
### Primitives
- Primitive variable declaration and initialization
- Eight primitive types
- Types limits
- Primitive types literal values
- Primitive types casting: widening and narrowing
- Types overflow

#### Lab: Components API
- Parameters types recap

### Arithmetic operators
- Unary operators
- Binary operators
- Statement type
- Type promotions
- Increment and decrement: prefix and postfix forms
- Short ?= form
- Overloaded "+"

#### Lab: Analytics component
- FR: count all messages, count most frequent command. 

### Logic operators
- Operators
- Lazy and eager form
- Reference equality and value equality

### Ternary operator
- Ternary operator
- It's statement 

## Control flow structures (2/1)
### Branches
- if
- switch

#### Lab: Commands component
- Implement stubs for main commands 

### Cycles
- for
- do/while
- while/do
- foreach

#### Lab: Retry policy for transport 
- Implement error code and retrying policy for transport

### Procedure metrics
- Cyclomatic complexity

## Reference types (1/0)
- Reference
- _null_ literal
- Heap vs Stack
- Garbage collector
- JVisualVM's VisualGC demo

## Built-in reference types (4/1)
### Arrays
- Arrays and heap
- Arrays declaration
- Arrays initialization
- Immutability
- Array literals
- Multi-dimension arrays
- _foreach_ recap

#### Lab: multi-client application
- FR: Miltiply users can access application 

### Varargs
- Method declaration recap
- Varargs as arrays
- Limitations

#### Lab: Start-up parameters
- FR: show users messages that set up as start-up parameter vararg 

### Strings
- Literals
- String API
- String immutability
- String interning
- StringBuffer and StringBuilder
- Compiler optimizations for "+"

#### Lab: Implement commands
- Implement commands parser

### Primitive wrappers
- Wrappers
- Wrappers API
- Auto-boxing
- Immutability and interning

## OOAD intro (2/0)
### OOAD vs Procedure style
- Procedure style values
- Procedure style idioms supporting values

## OOAD
- OOAD recap
- OOAD values
- OOAD idioms supporting values

## Key concepts
- Responsibility
- State
- Encapsulation
- Polymorphism

## Java Syntax for OOP (8/2)
### Enums
- Enums syntax
- Using with _switch_

### Encapsulation
- Access modifiers
- Code reuse with _this_
- Encapsulation for packages
- Encapsulation for classes

### Instatiation
- Constructors
- Object Initializers

### Inheritance
- Inheritance implementation
- Code reuse with _super_
- Overriding methods
- Abstract classes

## Error handling with exceptions (3/1)
- Exceptions vs Error codes
- What is exception
- Exception handling
- Standard Java exception types

### Object
- toS

## Annotations and Reflection API intro (1/0)
- Annotations
- Reflection API overview

## Collection API (3/1)
- Collection types and implementations
- Iteration over collections

## Multi-threading in Java (8/3)
### Parallelism
- Thread definition
- Thread API

## Web Services (6/2)
- Key concepts
- HTTP protocol recap: operation, headers, payload, error codes
- Servlet container concept
- Web application concept

### SOAP services intro
- SOAP
- WSDL

# Reading List
[To Read](http://tinyurl.com/skilltrekreadinglist)