# Item Repository

This repository can be utilized by following the steps below:

1. Open up your CouchDB Server: localhost:8091/ui/index.html#/overview/stats?scenarioZoom=minute&scenario=xb007zeca&statsHostname=all
2. Run the Spring Boot Application


Postman Collection that can be important.:

{
	"info": {
		"_postman_id": "a108a29e-479a-4d92-80c8-832674642921",
		"name": "Item",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "GET: Get Item",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/item?id=1",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"item"
					],
					"query": [
						{
							"key": "id",
							"value": "1"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "POST: Save Item",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"id\": 1,\r\n    \"name\" : \"Hammer\",\r\n    \"category\" : \"Tools\",\r\n    \"weight\" : \"2\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "localhost:8080/item",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"item"
					]
				}
			},
			"response": []
		}
	]
}