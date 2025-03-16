package org.example;

import java.util.*;

/**
 * Representa una agenda de contactos.
 * Permite gestionar una lista de contactos, añadiendo, eliminando y modificando contactos.
 *
 * @author Vicente Buyo
 * @version 1.0
 * @since 2024-03-16
 */
public class Agenda {

    /** Lista de contactos almacenados en la agenda. */
    private List<Contacto> contacts;

    /**
     * Constructor de la clase Agenda.
     * Inicializa la agenda con una lista vacía de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añade un nuevo contacto a la agenda.
     * Si el contacto ya existe, se agrega un nuevo número de teléfono a su lista de teléfonos.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de teléfono del contacto.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la agenda si existe.
     *
     * @param name Nombre del contacto a eliminar.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();
        while (it.hasNext()) {
            Contacto c = it.next();
            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica un número de teléfono de un contacto existente en la agenda.
     * Si el contacto y el número antiguo existen, se reemplaza por el nuevo número.
     *
     * @param name     Nombre del contacto.
     * @param oldPhone Número de teléfono actual a modificar.
     * @param newPhone Nuevo número de teléfono que reemplazará al anterior.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();
                int index = phones.indexOf(oldPhone);
                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos almacenados en la agenda.
     *
     * @return Lista de contactos en la agenda.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}
