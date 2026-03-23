# Registry

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class Registry<T>

Generic bidirectional registry mapping objects to sequential integer IDs.

## Key Methods

- public int getIdOrRegister(T object)
- public T getObject(int id)
- public int size()
- public List<T> getAllValues()
- public void forEach(@Nonnull BiConsumer<Integer, T> consumer)
