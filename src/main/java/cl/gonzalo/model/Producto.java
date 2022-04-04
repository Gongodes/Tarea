package cl.gonzalo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

   private String descripcion;

   @Column(unique = true)
   private int codigoDepartamento;

   private int precio;

   @ManyToOne
   @JoinColumn(name = "proveedor_id")
   private Proveedor proveedor;
}
