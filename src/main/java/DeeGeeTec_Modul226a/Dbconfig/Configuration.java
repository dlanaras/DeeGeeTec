package DeeGeeTec_Modul226a.Dbconfig;

import DeeGeeTec_Modul226a.HibernationType;

public class Configuration {
    public static String jdbcUrl = "localhost:3306";
    public static String dbname = "deegeetec";
    //Change here if u want jdbc or inmemory
    public static HibernationType hibernation = HibernationType.jdbc;
}
