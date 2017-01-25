package seedu.addressbook;

import java.util.Comparator;
import static seedu.addressbook.AddressBook.PERSON_DATA_INDEX_NAME;

/**
 * This class is used to compare people used in the AddressBook class.
 * It is pulled out in a separate class, even though AddressBook
 * is procedurally written, as Java requires a comparator object for its
 * sort method. All this class does it implement the compare method
 * of a Comparator for comparing people.
 */
class PersonCompare implements Comparator<String[]> {
    @Override
    public int compare(String[] person1, String[] person2) {
        return person1[PERSON_DATA_INDEX_NAME].toLowerCase()
                .compareTo(person2[PERSON_DATA_INDEX_NAME].toLowerCase());
    }
}