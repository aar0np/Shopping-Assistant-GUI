# DSAlbums
An implementation of the Java client for the Data API, using a dataset of music albums. This is a companion repository for the "[Using the Data API on HCD](https://www.youtube.com/watch?v=LbcsVfm4A-k)" video on the [DataStax Developers](https://www.youtube.com/@DataStaxDevs) YouTube channel.

## Known issues
 - Menu resizes horizontally based on the contents.

## Requirements
<img src="dsalbums.png" width="300" align=right />

 - Java 21 (JRE)
 - Environment variables
     - `LANGFLOW_URL`
 - A vector database which supports the Cassandra binary protocol:
    - Astra DB
    - DSE 6.9
    - HCD 1.0
 - Product data CSV found in [data/products.csv](data/products.csv)

## Database Schema

This is automatically created.

## To build:

### Build Requirements

 - Maven

The [pom.xml](pom.xml) file can be adjusted to build with earlier versions of Java, but it is not recommended to go below 17.

### Build command

    mvn clean install

### Running the build

    java -jar target/shoppingassistant-0.0.1-SNAPSHOT.jar
