package Traza1;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Localidad {
    private String nombre;
    @ManyToOne
    private Provincia provincia;
    @OneToMany(mappedBy = "localidad", cascade = CascadeType.ALL)
    private Set<Domicilio> domicilios = new HashSet<>();
}

