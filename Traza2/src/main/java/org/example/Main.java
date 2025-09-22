package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear país
        Pais argentina = new Pais("Argentina");

        // Crear provincias
        Provincia buenosAires = new Provincia("Buenos Aires", argentina);
        Provincia cordoba = new Provincia("Córdoba", argentina);

        // Crear localidades
        Localidad caba = new Localidad("CABA", buenosAires);
        Localidad laPlata = new Localidad("La Plata", buenosAires);
        Localidad cordobaCapital = new Localidad("Córdoba Capital", cordoba);
        Localidad villaCarlosPaz = new Localidad("Villa Carlos Paz", cordoba);

        // Crear domicilios
        Domicilio domicilioCaba = new Domicilio("Calle 1", 123, 1001, caba);
        Domicilio domicilioLaPlata = new Domicilio("Calle 2", 456, 1900, laPlata);
        Domicilio domicilioCordobaCapital = new Domicilio("Calle 3", 789, 5000, cordobaCapital);
        Domicilio domicilioVillaCarlosPaz = new Domicilio("Calle 4", 101112, 5152, villaCarlosPaz);

        // Crear sucursales
        Sucursal sucursal1 = new Sucursal("Sucursal CABA", LocalTime.of(9, 0), LocalTime.of(18, 0), true, domicilioCaba);
        Sucursal sucursal2 = new Sucursal("Sucursal La Plata", LocalTime.of(9, 0), LocalTime.of(18, 0), false, domicilioLaPlata);
        Sucursal sucursal3 = new Sucursal("Sucursal Córdoba Capital", LocalTime.of(9, 0), LocalTime.of(18, 0), false, domicilioCordobaCapital);
        Sucursal sucursal4 = new Sucursal("Sucursal Villa Carlos Paz", LocalTime.of(9, 0), LocalTime.of(18, 0), false, domicilioVillaCarlosPaz);

        // Crear categorías
        Categoria pizzas = new Categoria(1L, "Pizzas");
        Categoria lomos = new Categoria(2L, "Lomos");
        Categoria insumos = new Categoria(3L, "Insumos");

        // Crear unidades de medida
        UnidadMedida kilogramos = new UnidadMedida(1L, "Kilogramos");
        UnidadMedida litros = new UnidadMedida(2L, "Litros");
        UnidadMedida gramos = new UnidadMedida(3L, "Gramos");

        // Crear artículos insumo
        ArticuloInsumo sal = new ArticuloInsumo(1L, "Sal", 10.0, 5.0, 100, 50, true, gramos);
        ArticuloInsumo aceite = new ArticuloInsumo(2L, "Aceite", 20.0, 10.0, 50, 30, true, litros);
        ArticuloInsumo carne = new ArticuloInsumo(3L, "Carne", 50.0, 20.0, 30, 15, true, kilogramos);
        ArticuloInsumo harina = new ArticuloInsumo(4L, "Harina", 15.0, 10.0, 80, 40, true, kilogramos);

        // Crear artículos manufacturados
        ArticuloManufacturado pizzaHawaina = new ArticuloManufacturado(5L, "Pizza Hawaina", 300.0, "Pizza con piña y jamón", 20, "Hornear 15 minutos");
        ArticuloManufacturado lomoCompleto = new ArticuloManufacturado(6L, "Lomo Completo", 250.0, "Lomo con huevo y jamón", 15, "Freír 10 minutos");

        // Crear detalles de artículos manufacturados
        ArticuloManufacturadoDetalle detallePizzaHawaina1 = new ArticuloManufacturadoDetalle(1L, 1, pizzaHawaina, sal);
        ArticuloManufacturadoDetalle detallePizzaHawaina2 = new ArticuloManufacturadoDetalle(2L, 2, pizzaHawaina, harina);
        ArticuloManufacturadoDetalle detallePizzaHawaina3 = new ArticuloManufacturadoDetalle(3L, 1, pizzaHawaina, aceite);

        ArticuloManufacturadoDetalle detalleLomoCompleto1 = new ArticuloManufacturadoDetalle(4L, 1, lomoCompleto, sal);
        ArticuloManufacturadoDetalle detalleLomoCompleto2 = new ArticuloManufacturadoDetalle(5L, 1, lomoCompleto, aceite);
        ArticuloManufacturadoDetalle detalleLomoCompleto3 = new ArticuloManufacturadoDetalle(6L, 1, lomoCompleto, carne);

        // Asignar detalles a artículos manufacturados
        pizzaHawaina.getDetalles().add(detallePizzaHawaina1);
        pizzaHawaina.getDetalles().add(detallePizzaHawaina2);
        pizzaHawaina.getDetalles().add(detallePizzaHawaina3);

        lomoCompleto.getDetalles().add(detalleLomoCompleto1);
        lomoCompleto.getDetalles().add(detalleLomoCompleto2);
        lomoCompleto.getDetalles().add(detalleLomoCompleto3);

        // Asignar artículos a sucursales
        sucursal1.getArticulos().add(pizzaHawaina);
        sucursal1.getArticulos().add(lomoCompleto);
        sucursal2.getArticulos().add(pizzaHawaina);
        sucursal3.getArticulos().add(lomoCompleto);
        sucursal4.getArticulos().add(pizzaHawaina);
        sucursal4.getArticulos().add(lomoCompleto);

        // Crear empresas
        Empresa empresa1 = new Empresa("Empresa 1", "Empresa 1 S.A.", 123456789, "logo1.png");
        Empresa empresa2 = new Empresa("Empresa 2", "Empresa 2 S.A.", 987654321, "logo2.png");

        // Asignar sucursales a empresas
        empresa1.getSucursales().add(sucursal1);
        empresa1.getSucursales().add(sucursal2);
        empresa2.getSucursales().add(sucursal3);
        empresa2.getSucursales().add(sucursal4);

        // Mostrar artículos de una sucursal
        System.out.println("Artículos de la Sucursal CABA:");
        sucursal1.getArticulos().forEach(articulo -> System.out.println(articulo.getDenominacion()));
    }
}
