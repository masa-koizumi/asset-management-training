@RestController
@RequestMapping("/assets")
public class AssetController {

    @Autowired
    AssetRepository repository;

    @GetMapping
    public List<Asset> list() {
        return repository.findAll();
    }
}
