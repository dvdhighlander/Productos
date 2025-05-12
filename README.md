Se neceistan las siguientes versiones para funcionar:
MySQL 8 : se utilizo esta base de datos, se puede cambiar pero habria que cambiar la configuración
Java 17
Springboot ultima version
Maven ultima version

Se debe configurar los datos de conexxion a la BD a la BD local propia
Hay un archivo con los scripts para crear las tablas de la BD

Estan expuestos los siguientes Endpoints (estas url estan escritas en este README con loaclhost:8080 pero puede cambiaarse a la URL de donde se despliegue):
1. http://localhost:8080/Category  : Método GET - Obtiene todas las Categorias
2. http://localhost:8080/Category/ID  : Método GET - Obtiene una categoria por ID, se cambia la palabra ID de la url por el número Id de la categoria
3. http://localhost:8080/Category: Método POST -  Crea nueva categoria, reuqiere para el body un JSON con el siguiente formato:
    {
        "categoryName": "CLOUD",
        "description": "Categoria Cloud",
        "picture": "picture 2"
    }
4. http://localhost:8080/Supplier : Método GET - Obtiene todos los proveedores
5. http://localhost:8080/Supplier : Método POST - Crea un nuevo proveedor, requiere para el body un JSON con el sigueinte formato:
	{
        "companyName": "Almacenes Piso 3",
        "contactName": "Juana Maria",
        "contactTitle": "Miss",
        "address": "Calle 13 65 - 33",
        "city": "Bogota",
        "region": "Cundinamarca",
        "postalCode": 556654,
        "country": "Colombia",
        "phone": 3015454964,
        "fax": "435564-655",
        "homePage": "www.segundopiso.com"
    }
6. http://localhost:8080/Products : Método POST - Crea un nuevo producto, requiere para el body un JSON con el siguieten formato, y que existan una categoria y un proveedor:
	{
        "productName": "Producto 1",
        "quantityPerUnit": 3,
        "unitPrice": 300,
        "unitsInStock":153000,
        "unitsOnOrder":300,
        "reorderLevel": "300",
        "discontinued": false,
        "supplierID": 6,
        "cattegoryID": 1
    }
7. http://localhost:8080/Products?page=1&pageSize=10 : Método GET - Obtiene la lista de los productos, se utiliza un paginador, por lo que necesita como parametros el número página que se quiere traer y el tamaño de la página ( cantidad de productos mostrados por página).
8. http://localhost:8080/Products/ID : Método GET - Obtiene el producto por ID, se cambia la palabra ID de la url por el número Id del producto
