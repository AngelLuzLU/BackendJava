package practicaHarry;

public class TestPersonajeHP {
    public static void main(String[] args) {
        PersonajeHP harryPotter = new PersonajeHP(
                "Harry James Potter",
                "Gryffindor",
                "Hombre",
                "Dementor",
                "Ciervo Macho",
                "Ingles",
                "Mestizo",
                "Casado",
                41
        );
        System.out.println(harryPotter);

        PersonajeHP hermione = new PersonajeHP(
                "Hermione Jean Granger",
                "Gryffindor",
                "Mujer",
                "Desconocido",
                "Nutria",
                "Inglesa",
                "Nacida de Muggles",
                "Casada",
                42
        );
        System.out.println(hermione);

        PersonajeHP ron = new PersonajeHP(
                "Ronald Bilius Weasley",
                "Gryffindor",
                "Hombre",
                "Acromantula(Aragog)",
                "Perro(Jack Russel Terrier)",
                "Ingles",
                "Sangre Pura",
                "Casado",
                42
        );
        System.out.println(ron);

        PersonajeHP dumbledore = new PersonajeHP(
                "Albus Percival Wulfric Brian Dumbledore",
                "Gryffindor",
                "Hombre",
                "Cuerpo inerte de Ariana(su hermana)",
                "Fenix",
                "Ingles",
                "Mestizo",
                "Soltero",
                115
        );
        System.out.println(dumbledore);

        PersonajeHP malfoy = new PersonajeHP(
                "Draco Lucius Malfoy",
                "Slytherin",
                "Hombre",
                "Voldemort",
                "Desconocido",
                "Ingles",
                "Sangre Pura",
                "Viudo",
                41
        );
        System.out.println(malfoy);
    }
}
