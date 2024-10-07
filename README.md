# Portfolio Spring Backend

This repository holds the Spring backend developed for my Portfolio Website, available at https://nathanhutch.dev. 

The structure of the repository can be split up into 4 sections:
* Models
* Controllers
* Service
* Repositories

While each of these sections was needed for my implementation with MongoDB, the Repositories and some lines in the Models are MongoDB-specific therefore would not be needed with an Adobe Experience Manager CMS.

## Models

The models act as the data structure for the data stored on the backend, including different attributes and types for each attribute. My implementation includes some specific MongoDB such as `@Document("projects")`, to tell Spring what collection in MongoDB this model represents

## Controllers

The controller is the main REST API endpoint to access the data. The structure of this file includes the HTTP method and endpoint definition, where `@GetMapping("/work")` would be a GET request function available at www.domain.com/work. This function is defined in the Service explained next

## Service

The service acts as the main interaction method for accessing database values. In my implementation, this includes initialising the MongoDB repositories so functions can be used to access the data from the database. My implementation only makes use of the `.findall()` function, which returns the whole collection for the collection specified, however there are several other default functions defined by the repository, as well as providing a platform to define your own filters and functions

In general, this would be the layer where you actually access the data and return it to the Controller.

## Repositories

These are interfaces that extend MongoRepository, a MongoDB specific for accessing MongoDB from Spring. This interface provides default functions as well as the opportunity to develop custom functions.
