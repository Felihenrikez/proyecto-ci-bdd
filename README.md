# Proyecto CI/CD con Pruebas Automatizadas

## Objetivo del proyecto

Demostrar la implementación de integración continua (CI) con pruebas unitarias automatizadas usando Java, Maven y GitHub Actions. El proyecto incluye una calculadora simple con tests que se ejecutan automáticamente en cada commit.

## Comandos usados

```bash
# Compilar el proyecto
mvn clean compile

# Ejecutar pruebas
mvn test

# Empaquetar
mvn package

# Git - crear ramas
git checkout -b develop
git checkout -b QA
```

## Estructura del proyecto

```
proyecto-ci-bdd/
├── src/
│   ├── main/java/com/empresa/app/
│   │   └── Calculator.java          # Clase con métodos sum() y subtract()
│   └── test/java/com/empresa/app/
│       └── CalculatorTest.java      # Tests unitarios automatizados
├── .github/workflows/
│   └── ci.yml                       # Pipeline de GitHub Actions
├── pom.xml                          # Configuración Maven con JUnit 5
├── .gitignore                       # Archivos ignorados por Git
└── README.md                        # Documentación
```

## Explicación del pipeline

El pipeline CI se ejecuta automáticamente en:
- **Push**: Cada vez que se sube código
- **Pull Request**: Antes de fusionar cambios

**Pasos del pipeline:**
1. **Checkout**: Descarga el código fuente
2. **Setup Java**: Configura JDK 11 con Temurin
3. **Run Tests**: Ejecuta `mvn test` para validar el código
4. **Publish Test Results**: Genera reportes navegables de tests en GitHub Actions

## Qué valida cada test

### CalculatorTest.java

- **shouldSumTwoNumbers()**: Valida que `sum(2, 3)` retorne `5`
- **shouldSubtractTwoNumbers()**: Valida que `subtract(3, 2)` retorne `1`

Cada test verifica que las operaciones matemáticas básicas funcionen correctamente y fallan si hay errores en la lógica.