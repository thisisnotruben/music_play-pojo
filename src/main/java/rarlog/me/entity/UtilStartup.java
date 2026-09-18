package rarlog.me.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
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

    @Column(name = "auth_init")
    private boolean authInit;

}
