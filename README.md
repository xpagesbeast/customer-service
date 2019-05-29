# customer-service
SpringBoot Simple Customer Service App uses MySQL

**Database setup

Create a schema called 'customer'.  This will be the database.

Create a table called 'customer'.  This will be the table to store the records (data).

create table customer(
id int NOT NULL AUTO_INCREMENT,
name varchar(50),
address varchar(100),
PRIMARY KEY (ID)
)

Create a user called 'test' with password 'test'.  The application is setup to login with test.

Give the user 'test' access to the schema 'customer'.  Use select all in MySQL Manager to allow user 'test' full access.

If you already have a MySQL environment and want to use it.  Simply edit the file application.properties.

spring.datasource.name=customer-datasource

spring.datasource.url=jdbc:mysql://localhost:3306/customer?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC

spring.datasource.username=

spring.datasource.password=


**Testing with Postman

GET HTTP VERB

Get all Customers localhost:8080/customers

Get Customer with id 1 localhost:8080/customers/1

Get Customer with id 2 localhost:8080/customers/2

POST HTTP VERB (set body to raw application/json)

localhost:8080/customers

{
	"firstName":"Bruce",
	"lastName":"Wayne"
}

After send, Bruce Wayne will be created.

Sample output:
{
    "_embedded": {
        "customers": [
            {
                "name": "Target",
                "address": "5555 Touhy, Niles, IL",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/customers/1"
                    },
                    "customer": {
                        "href": "http://localhost:8080/customers/1"
                    }
                }
            },
            {
                "name": "Walmart",
                "address": "5454 Touhy, Niles, IL",
                "_links": {
                    "self": {
                        "href": "http://localhost:8080/customers/2"
                    },
                    "customer": {
                        "href": "http://localhost:8080/customers/2"
                    }
                }
            }
        ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/customers"
        },
        "profile": {
            "href": "http://localhost:8080/profile/customers"
        }
    }
}
