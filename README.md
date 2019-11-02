# FlairsTech Challenge

I applied at [FlairsTech](https://flairstech.com/) a while ago. I recently received this challenge to work on as part of the process.

## Challenge Statement

1. Create a spring boot docker application with Jre8
2. Application required to download [image database](https://github.com/ghusta/docker-postgres-world-db) during build and connect to it during runtime
3. Implement an endpoint which when given country code should return country information
    Example  GET- http:/localhost:8080/BHR should return:
    ```json
    {
      "name": "Bahrain"
      "continent": "Asia"
      "population":617000
      "life_expectancy":73
      "country_language":"Arabic"
    }
    ```
4. Create Unit Tests for the following tests
  - If non existent code is called then return error message:"INVALID_COUNTRY_CODE" and http response should be internal server error
  - If database is down then the error message should be "INTERNAL_ERROR" and http response should be internal server error

### List of commands to test the app

- mvn clean package -DskipTests (To build the project)
- docker-compose up