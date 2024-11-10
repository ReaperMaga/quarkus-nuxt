package me.reapermaga

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/products")
class ProductResource {

    @GET
    fun getProducts(): List<Product> {
        return listOf(
            Product("Apple", 1.0),
            Product("Banana", 2.0),
            Product("Orange", 3.0)
        )
    }
}