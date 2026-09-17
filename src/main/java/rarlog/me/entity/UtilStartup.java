package rarlog.me.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "util_startup")
public class UtilStartup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "garage_init")
    private boolean garageInit;

    @Column(name = "solr_init")
    private boolean solrInit;

    @Column(name = "db_init")
    private boolean dbInit;

}
