package br.fatec.product.dtos;

public record ProductResponse(
   long id,
   String name,
   double price,
   String category
    // Add any other fields required by your application
) {

    
}
