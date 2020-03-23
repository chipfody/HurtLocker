import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class Main {

    public String readRawDataToString() throws Exception {
        ClassLoader classLoader = getClass ().getClassLoader ();
        String result = IOUtils.toString ( classLoader.getResourceAsStream ( "RawData.txt" ) );
        return result;
    }

    public static void main(String[] args) throws Exception {
        String output = (new Main ()).readRawDataToString ();
        System.out.println ( output );

    }

    public class groceryList {
        private String name;
        private Double price;
        private String type;
        private String expirationDate;

        public groceryList(String name, Double price, String type, String expirationDate) {
            this.name = name;
            this.price = price;
            this.type = type;
            this.expirationDate = expirationDate;
        }
            public String getName () {
                return name;
            }

            public void setName (String name){
                this.name = name;
            }

            public Double getPrice () {
                return price;
            }

            public void setPrice (Double price){
                this.price = price;
            }

            public String getType () {
                return type;
            }

            public void setType (String type){
                this.type = type;
            }

            public String getExpirationDate () {
                return expirationDate;
            }

            public void setExpirationDate (String expiration){
                this.expirationDate = expiration;
            }

    }
}
