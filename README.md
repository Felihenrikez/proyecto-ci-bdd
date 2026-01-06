# Proyecto CI/BDD

Este es un proyecto de ejemplo que demuestra la integración continua (CI) con pruebas BDD (Behavior Driven Development) usando Java, Maven, JUnit y Cucumber.

## Estructura del Proyecto

```
proyecto-ci-bdd/
├── src/
│   ├── main/java/com/empresa/app/
│   │   └── Calculator.java
│   └── test/java/com/empresa/app/
│       ├── CalculatorTest.java
│       └── bdd/
│           ├── steps/
│           └── runners/
├── features/
│   └── login.feature
├── pom.xml
├── Jenkinsfile
├── .gitignore
└── README.md
```

## Tecnologías Utilizadas

- **Java 11**: Lenguaje de programación
- **Maven**: Gestión de dependencias y construcción
- **JUnit 5**: Framework de pruebas unitarias
- **Cucumber**: Framework de pruebas BDD
- **Jenkins**: Herramienta de CI/CD

## Comandos Útiles

### Compilar el proyecto
```bash
mvn clean compile
```

### Ejecutar pruebas
```bash
mvn test
```

### Empaquetar
```bash
mvn package
```

## Ramas

- `main`: Rama principal para producción
- `develop`: Rama de desarrollo
- `QA`: Rama para pruebas de calidad

## CI/CD

El proyecto incluye un `Jenkinsfile` que define el pipeline de CI/CD con las siguientes etapas:

1. **Checkout**: Descarga el código fuente
2. **Build**: Compila el proyecto
3. **Test**: Ejecuta las pruebas
4. **Package**: Empaqueta la aplicación
5. **Deploy**: Despliega según la rama (QA o Production)