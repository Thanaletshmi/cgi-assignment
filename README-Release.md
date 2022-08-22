# CGI Assessment 
#### [Version - 0.0.1]

## Pre-requisites :

```
[JDK 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
[Maven 3](https://maven.apache.org)
```

## Swagger UI :

```
Link - http://localhost:8080/swagger-ui.html
```

## Recipe and LogAnalyzer UI :

```
HomePage - http://localhost:4200
Recipe App - http://localhost:4200/recipe
LogAnalyzer App - http://localhost:4200/logs
```

### Recipe App

Two REST endpoints will read "receipe.json" in [src/main/resources] path, process and displays the recipes

1. **[ GET - /recipes ]** Display all the recipes

    Curl Command: ```curl -X GET "http://localhost:8080/recipes" -H "accept: */*" ```
  
    Request URL: ```http://localhost:8080/recipes```


2. **[ GET - /recipes/ingredients?value=[v1,v2,v3] ]** This endpoint takes array of ingredients as input 
and displays list of recipes which consists of all the given input ingredients.

    Curl Command: ```curl -X GET "http://localhost:8080/recipes/ingredients?ingredients=water&ingredients=rice" -H "accept: */*"```

    Request URL: ```http://localhost:8080/recipes/ingredients?ingredients=water&ingredients=rice```

**Sample Response** 

`
[
{
"title":"Plain Rice -- Make Ahead OAMC Throw It in the Freezer!!",
"href":"http://www.recipezaar.com/Plain-Rice-Make-Ahead-OAMC-Throw-It-in-the-Freezer-159839",
"ingredients":[
"rice",
"water"
],
"thumbnail":"http://img.recipepuppy.com/45331.jpg"
}
]
`

### Log Analyzer app

One REST endpoint will read the file "logFile-2018-09-10.log" [src/main/resources] path and perform below actions

- Accepts the log type as input in path variable, for eg., DEBUG, WARN or ERROR.
- Display top N recurring errors/info/debug/warn in sorted order with descriptions and number of times it occurred. 
- The most recurring one will be shown first


  **[ GET - /logs/{logType} ]**

   #### Sample:
   Curl Command: ``` curl -X GET "http://localhost:8080/logs/WARN" -H "accept: */*" ```

   Request URL: ``` http://localhost:8080/logs/WARN ```

   Response:
   `{
   "logType": "WARN",
   "logDataList": [
   {
   "logName": "Node:",
   "logMessage": "[127.0.0.1]:5701 [dev] [3.2.5] No join method is enabled! Starting standalone.",
   "logCount": 10
   },
   {
   "logName": "AnnotationConfigEmbeddedWebApplicationContext:",
   "logMessage": "Exception encountered during context initialization - cancelling refresh attempt",
   "logCount": 3
   }
   ]
   }`


## Unit Test

Unit test cases are written using Mockito

## Authors

* **Thanaletshmi S K** - *Initial work*