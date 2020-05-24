#SpringBootAuthBoilerPlate

Spring CURD application with proteched routes and JWT auth flow

###Endpoints

`http://localhost:8080/api/auth/login` \
Open to anyone \
Returns 
`{ role : '', username : 'something at email', JWT: '''}` \
Needs to be logged in and be an admin or manager \
`http://localhost:8080/api/auth/register` \
Needs to be Logged in and send JWT in header
`http://localhost:8080/api/products/**`

### Poop
