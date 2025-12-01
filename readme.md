# Java Project Template with FreeMarker

This project is a Java application template that demonstrates the use of the FreeMarker library for generating dynamic HTML content.

## Project Structure

- `src/main/java/Main.java`: The main application class that configures FreeMarker and renders the template.
- `src/main/java/User.java`: The user data model.
- `src/main/resources/templates/`: The directory containing FreeMarker templates (`.ftl`).
  - `login.ftl`: Login form template.
  - `register.ftl`: Registration form template.
- `pom.xml`: The Maven configuration file that manages project dependencies.

## Technologies Used

- **Java**: The main programming language.
- **FreeMarker**: A template engine for generating dynamic content.
- **Maven**: A tool for dependency management and project building.

## How to Run

1. **Clone the repository:**
   ```bash
   git clone <repository-address>
   ```
2. **Build the project using Maven:**
   ```bash
   mvn clean install
   ```
3. **Run the application:**
   Run the `main` method in the `Main.java` class. The application will render the `register.ftl` template and display the result in the console. You can change the template to `login.ftl` in `Main.java` to see a different form.
