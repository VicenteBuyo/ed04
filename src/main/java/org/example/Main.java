package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        IAgenda IAgendaContactos = new Agenda();

        initAgenda(IAgendaContactos);

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Contacto c : IAgendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }







        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Contacto c : IAgendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }

    private static void initAgenda(IAgenda IAgendaContactos) {
        // Añadir contactos a la agenda.

        IAgendaContactos.addContact("John Doe", "1234567890");
        IAgendaContactos.addContact("Jane Doe", "9876543210");
        IAgendaContactos.addContact("Mary Jane", "1122334455");
        // Añadir un nuevo teléfono a un contacto existente.
        IAgendaContactos.addContact("John Doe", "6543219876");
        // Eliminar un contacto de la agenda.
        IAgendaContactos.removeContact("Jane Doe");
        // Modificar el teléfono de un contacto existente en la agenda.
        IAgendaContactos.modifyPhoneNumber("John Doe", "1234567890", "6666666666");
    }
}