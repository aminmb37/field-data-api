# Yara Field Data API

Yara Field Data API Exercise Project

How to run the project:
You can run the project simply by running this command on your shell (with docker installed and running on your system): 
docker run -p 8080:8080 aminmb/field-data-api

How to test the project:
After running the project, you can test the project simply by going to this link:
http://localhost:8080/swagger-ui.html

Project GitHub Link:
https://github.com/aminmb37/field-data-api

Assumptions, Limitations and Facts:
1. I used Springboot 2.3.4 and Java 11 for this project.
2. I used an embedded H2 database file (Field.mv.db).
3. I used JPA/hibernate to interact with the database.
4. I used the data.sql to populate the data in the database when the project is built.
5. I defined four tables in the database:
    a. boundary for storing boundary information
    b. field for storing field data (related with boundary table with boundary_id)
    c. geo_property for storing property (related with boundary table with boundary_id)
    d. coordinate for storing coordinate of a boundary (related with boundary table with boundary_id)
5. I used Swagger2 for documenting and testing the API.
6. I created a free account on the https://agromonitoring.com/ website and used my Personal API Key
   to define some Polygons through calling the provided API.
7. Unfortunately, free account holders are not allowed to fetch Weather History Data (401 Status Code)!
   Because of that, I couldn't able to complete the getWeatherHistory endpoint!
8. If you call the getWeatherHistory service you will get back a 401 error!
   But it will definitely create a Polygon on the https://agromonitoring.com/.
9. I added another endpoint to just test the Polygon Creation on https://agromonitoring.com/.
   Please kindly note that creating a Polygon has a limitation as well. (Number of created polygons per month: < 20)