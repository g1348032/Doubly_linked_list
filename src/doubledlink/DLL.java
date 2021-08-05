/**
 * @author 30038637 Takuya Hasama 21/07/2021
 */
package doubledlink;

public class DLL {

    Country head;
    Country tail;

    class Country {

        private Country next;
        private Country prev;
        private String name;
        private City city;

        public Country() {
        }

        public Country(String name, Country next, Country prev, String cityName) {
            this.name = name;
            this.next = next;
            this.prev = prev;
            city = new City(cityName);
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city.cName;
        }

        private class City {

            private String cName;

            public City() {
            }

            public City(String cName) {
                this.cName = cName;
            }

            public String getCName() {
                return cName;
            }
        }
    }

    /**
     * adds name and city at the starting of the linked list
     *
     * @param name
     * @param city
     */
    public void addFirst(String name, String city) {
        Country tmp = new Country(name, head, null, city);
        if (head != null) {
            head.prev = tmp;
        }
        head = tmp;
        if (tail == null) {
            tail = tmp;
        }
        System.out.println("Country : " + name + "  City : " + city);

    }

    /**
     * adds name and city at the end of the linked list
     *
     * @param name
     * @param city
     */
    public void addNext(String name, String city) {

        Country tmp = new Country(name, null, tail, city);
        if (tail != null) {
            tail.next = tmp;
        }
        tail = tmp;
        if (head == null) {
            head = tmp;
        }
        System.out.println("Country : " + name + "  City : " + city);

    }

    /**
     * this method walks forward through the linked list
     */
    public void iterateForward() {

        System.out.println("##############################");
        System.out.println("iterating forward..");
        Country tmp = head;
        while (tmp != null) {
            System.out.println("Country : " + tmp.getName() + "  City : " + tmp.getCity());
            tmp = tmp.next;
        }
    }

    /**
     * this method walks backward through the linked list
     */
    public void iterateBackward() {

        System.out.println("##############################");
        System.out.println("iterating backword..");
        Country tmp = tail;
        while (tmp != null) {
            System.out.println("Country : " + tmp.getName() + "  City : " + tmp.getCity());
            tmp = tmp.prev;
        }
    }

}
