# Course-API

Course-API is a RESTful web service built with the spring framework. 

This web service can be run without a container, and executed as a jar file in the enviornment of your choice.

## Installation

You can download this web service as a .rar, by heading to the releases tab.

Alternatively, you can package it yourself using [maven](https://maven.apache.org/index.html).
To install using maven, navigate to the installed directory and run,
```bash
mvn clean install
```

## Usage

### Run the .rar executable

### Send HTTP requests to your database
I will be using [Postman](https://www.postman.com/) in these examples, but any tool for simulating HTTP requests will work!

In this REST API, topics are mapped to courses in a many to one relationship. (one topic can have many courses)
#### POST
Example of entering a Topic into our database
![post request, topic](https://github.com/MichaelGombos/course-api/blob/main/Documentation/1PostTopic.gif?raw=true)
Example of entering a Course into our database (Remember, Many to One!)
![post request, course](https://github.com/MichaelGombos/course-api/blob/main/Documentation/2PostCourse.gif?raw=true)
#### PUT
Example of updating a course in our database
![put request, course](https://github.com/MichaelGombos/course-api/blob/main/Documentation/3PutCourse.gif?raw=true)
#### GET
Example of retrieving information about a single topic in our database
![get request, topic single](https://github.com/MichaelGombos/course-api/blob/main/Documentation/4GetSingleTopic.gif?raw=true)
Example of retrieving information about ALL topic in our database
![get request, topic many](https://github.com/MichaelGombos/course-api/blob/main/Documentation/5GetAllTopics.gif?raw=true)
#### DELETE
![delete request, topic one](https://github.com/MichaelGombos/course-api/blob/main/Documentation/6DeleteTopics.gif?raw=true)
Example of removing a topic from our database

## License
[The Unlicense](https://choosealicense.com/licenses/mit/)
