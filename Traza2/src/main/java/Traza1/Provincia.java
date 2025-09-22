package Traza1;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Provincia {
    private String nombre;
    @ManyToOne
    private Pais pais;
    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL)
    private Set<Localidad> localidades = new HashSet<>();
}
