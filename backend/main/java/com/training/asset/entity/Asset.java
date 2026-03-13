@Entity
public class Asset {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String category;

    private String status;

}
