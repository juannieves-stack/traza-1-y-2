package Traza1;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private boolean esCasaMatriz;
    @OneToOne
    private Domicilio domicilio;
    @ManyToMany
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Articulo> articulos = new HashSet<>();
}
