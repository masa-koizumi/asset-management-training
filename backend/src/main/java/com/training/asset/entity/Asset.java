@Entity
public class Asset {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String category;
    private String status;

    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
