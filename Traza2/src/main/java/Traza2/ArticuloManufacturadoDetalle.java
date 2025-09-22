package Traza2;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloManufacturadoDetalle {
    private Long id;
    private int cantidad;
    @ManyToOne
    private ArticuloManufacturado articuloManufacturado;
    @ManyToOne
    private ArticuloInsumo articuloInsumo;
}

