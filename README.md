# ci-lab
laboratorio de integración continua


## Parte 1: GitHub Actions Build

- Configura una action importando el plugin Maven, tal como lo mostró el profesor
- Modifica el archivo `maven-publish.yml` dejándolo así:

```
name: Maven Package

on: push

jobs:
  build:

    runs-on: ubuntu-latest
    permissions:
      contents: read
      packages: write

    steps:
    - uses: actions/checkout@v3
    - name: Set up JDK 11
      uses: actions/setup-java@v3
      with:
        java-version: '11'
        distribution: 'temurin'
        server-id: github # Value of the distributionManagement/repository/id field of the pom.xml
        settings-path: ${{ github.workspace }} # location for the settings.xml file

    - name: Build with Maven
      run: mvn -B package --file pom.xml # or verify
```

## Parte 2: Corre tests

- Haz un push en tu repo para gatillar el action (modifica un archivo por ejemplo si estás usando GitHub directamente)
- Luego reemplaza `package` por `verify`
- Modifica los tests para que fallen y haz un push
- Modifica los tests para que pasen y haz un push

## Parte 3: publica el package

- Revisa en contenido de settings.xml en la carpeta .m2
- Modifica el archivo `maven-publish.yml` y déjalo así:


```
# This workflow will build a package using Maven and then publish it to GitHub packages when a release is created
# For more information see: https://github.com/actions/setup-java/blob/main/docs/advanced-usage.md#apache-maven-with-a-settings-path

name: Maven Package

on: push

jobs:
  build:

    runs-on: ubuntu-latest
    permissions:
      contents: read
      packages: write

    steps:
    - uses: actions/checkout@v3
    - name: Set up JDK 11
      uses: actions/setup-java@v3
      with:
        java-version: '11'
        distribution: 'temurin'
        server-id: github # Value of the distributionManagement/repository/id field of the pom.xml
        settings-path: ${{ github.workspace }} # location for the settings.xml file

    - name: Build with Maven
      run: mvn -B verify --file pom.xml
      
    - name: Create staging directory
      run: mkdir staging && cp target/*.jar staging
    
    - name: Store artifact
      uses: actions/upload-artifact@v3
      with:
        name: Package
        path: staging

    - name: Publish to GitHub Packages Apache Maven
      run: mvn deploy -s .m2/settings.xml
      env:
         GITHUB_TOKEN: ${{ github.token }}

```

IMPORTANTE: recuerda modificar las referencias a los repos en los archivos maven `pom.xml`.


# Nota

Hay un bug en github en que si publicas el mismo nombre de artefacto, aunque esté en otro repo, puede fallar la publicación, si eso te pasa cambia el valor en `<groupId>` en el archivo `pom.xml`.
Ver https://github.com/orgs/community/discussions/23474

