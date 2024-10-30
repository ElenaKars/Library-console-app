package repository;

import model.Reader;
import model.Role;
import utils.MyArrayList;
import utils.MyList;


public class ReaderRepositoryImpl implements ReaderRepository {

    private final MyList<Reader> readers;
    private int currentId = 1;

    public ReaderRepositoryImpl() {
        readers = new MyArrayList<>();
    }

    @Override
    public Reader addReader(String name, String email, Role role) {
        Reader reader = new Reader(currentId++, name, email, role);
        readers.add(reader);
        return reader;
    }

    @Override
    public Reader getReaderByName(String name) {
        for (Reader reader : readers) {
            if (reader.getName().equalsIgnoreCase(name)) {
                return reader;
            }
        }
        return null;
    }
    @Override
    public MyList<Reader> getReaders() {
        return  readers;
    }

}
