package Traza2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ArticuloInsumo extends Articulo {
    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;
    @ManyToOne
    private UnidadMedida unidadMedida;
}

