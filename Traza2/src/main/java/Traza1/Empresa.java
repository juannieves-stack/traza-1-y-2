package Traza1;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
    private String nombre;
    private String razonSocial;
    private int cuit;
    private String logo;
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private Set<Sucursal> sucursales = new HashSet<>();
}
