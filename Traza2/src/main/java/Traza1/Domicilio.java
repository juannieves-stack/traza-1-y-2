package Traza1;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Domicilio {
    private String calle;
    private int numero;
    private int cp;
    @ManyToOne
    private Localidad localidad;
}

