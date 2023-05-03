class Driver extends Account {
    public Driver(String name, String document, String email, String passwor){
        super(name, document, email, passwor);
    }
    void printDataDriver(){
        System.out.println("Document driver: " + document + "Name driver: " + name + " E-mail: " + email + "Password: " + password);
    }
}