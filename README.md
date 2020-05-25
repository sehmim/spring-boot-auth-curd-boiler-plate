# SpringBootAuthBoilerPlate

Spring CURD application with protected routes and JWT auth flow

## MVC
### Backend:  

- Authentication: 
    - Pulled from some database that validates account (More details TBA) 
    - Creates session token 
- Authorization:  
    - Database Schema has admin level, use it to create user hierarchy 

- Database:  

    - Local mongoDB server (For now) 

- API:  
    - ENDPOINTS: 
        - `"/api/auth/login"`:  POST: Returns: session Token, username and role 

            - Body: `{ "email" : "sEmail", "password": "sID" }`

            - Validates User 

            - Returns: `RESPONSE: { "role" : "ADMIN", "username" : "sEmail", "jwt"  : "hashednumber"  }` 
        - `"/api/auth/register"` : POST: Returns: message and User that gets added 

            - HEADER: Session Token 

            - Post Body: `{ "username" : "", "role" : "", email: "", password: "" …. } `

         - `"/api/products"` : GET: Returns: All products in the product collection 

 
