package adt;

public interface DetailsADT<E> {
    void addPerson();

    E removePerson();

    int searchPerson(E item);

    void sortPerson();
}
