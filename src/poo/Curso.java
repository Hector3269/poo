public class Curso {
    private int id;
    private String name;
    private String descripcion;
    private int numberCredits;
    private String version;

    public Curso(int id, String name, String descripcion, int numberCredits, String version) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.numberCredits = numberCredits;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getnumberCredits() {
        return numberCredits;
    }

    public void setnumberCredits(int numberCredits) {
        this.numberCredits = numberCredits;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void actualizarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void actualizarnumberCredits(int nuevosCreditos) {
        this.numberCredits = nuevosCreditos;
    }

    @Override
    public String toString() {
        return "cursos"+"\n"+
                "name: "+name + "| descripcion: " + descripcion + "| numero de creditos: " + numberCredits + "| versopn:"+version;
    }
}

