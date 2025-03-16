package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto en la agenda.
 * Un contacto tiene un nombre y una lista de números de teléfono asociados.
 *
 * @author Vicente Buyo
 * @version 1.0
 * @since 2024-03-16
 */
class Contacto {

    /** Nombre del contacto. */
    private String name;

    /** Lista de números de teléfono del contacto. */
    private List<String> phones;

    /**
     * Constructor de la clase Contacto.
     * Inicializa un contacto con un nombre y un número de teléfono.
     *
     * @param name Nombre del contacto.
     * @param phone Número de teléfono principal del contacto.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return El nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de números de teléfono del contacto.
     *
     * @return Lista de números de teléfono asociados al contacto.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}
