# Gradle Lifecycle Phases and Object Model

### Run Example

- copy 'init.d' folder to the 'USER_HOME/.gradle/' directory
- or execute build with the command: 'gradle -i --init-script ./init.d/init.gradle'

### Key Interfaces

- **Script** - implemented by every gradle script
- **Project** - implemented by every 'build.gradle' script
- **Settings** - implemented by every 'settings.gradle' script
- **Gradle** - global root interface, accessible by every other interface
- **Task** - implemented by every task
- **Action** - implemented by every action

### Lifecycle Phases

- **Initialization** - maps to one or more 'init.gradle' and 'settings.gradle' script files
- **Configuration** - maps to 'build.gradle' script file (create, configure tasks)
- **Execution** - maps to 'build.gradle' script file (execute tasks)

### Gradle Object Model Schema

![Gradle Object Model](https://github.com/Yoh0xFF/gradle-example/blob/main/gradle-lifecycle/gradle-lifecycle-phases-and-object-model.png?raw=true "Gradle Object Model")
