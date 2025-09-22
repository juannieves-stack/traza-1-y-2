package Traza2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    @OneToMany(mappedBy = "articuloManufacturado", cascade = CascadeType.ALL)
    private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Imagen> imagenes = new HashSet<>();
}

