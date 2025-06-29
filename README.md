# RESTful API for a Personal Blog

## Description

This is a simple REST API for a personal blog site.  
It provides access to different news articles via a set of endpoints.

The project is built using **Java 21** and the **Spring Framework**, and follows the **MVC (Model-View-Controller)** architectural pattern.  
Articles are stored in a **local file** for now, making it lightweight and ideal for small-scale use or educational purposes.

## Features

- Return a list of all articles (with optional filters by tag or publishing date)
- Retrieve a single article by ID
- Create a new article
- Update an existing article by ID
- Delete an article by ID


## Installation

1. Install **Git**
2. Clone this repository:
   ```bash
   git clone https://github.com/your-username/personal-blog-api.git
   ```
3. Install Java 21 or later
4. Open the project in your IDE
5. Run the main file: PersonalBlog.java

## How to use
1. Start the server by running PersonalBlogApplication.java
2. Use a tool like Postman or cURL to interact with the API.


## Endpoints
| Method | Endpoint         | Description          |
| ------ | ---------------- | -------------------- |
| GET    | `/get_all_articles`      | Get all articles     |
| GET    | `get_article_by_id/{id}}` | Get article by ID    |
| POST   | `/create_article`      | Create a new article |
| PUT    | `/update_article/{id}` | Update article by ID |
| DELETE | `delete_article/{id}` | Delete article by ID |

## Technologies Used
- Java 21
- Spring Boot
- REST API
- File-based storage

## Future Improvements
- Integrate a real database like PostgreSQL or MongoDB
- Add authentication for article creation and deletion
- Implement pagination and advanced filtering
- Host API on a public platform (e.g. Heroku or Render)

## Author
@sunnybeatsza
