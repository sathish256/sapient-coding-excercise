## sapient-coding-excercise
Sample Project for Sapient coding excercise

## Controlling Services
### Start
```
dos
cd sapient-coding-excercise/product-catalogue-service
mvn spring-boot:run
```
### API-endpoints
```
POST - http://localhost:8045/api/v1/catalogue @ResponseBody(#ref Product)
GET - http://localhost:8045/api/v1/catalogue/{productId}
GET - http://localhost:8045/api/v1/catalogue?type={type}
PUT - http://localhost:8045/api/v1/catalogue  @ResponseBody(#ref Product)
DELETE - http://localhost:8045/api/v1/catalogue/{productId}
```
### #Ref - Product.json
```
{
    "productId": 1,
    "productName": "iPhone",
    "productType": "Electronics",
    "inStockQuantity": 25,
    "retailPrice": 25.5
}
```
