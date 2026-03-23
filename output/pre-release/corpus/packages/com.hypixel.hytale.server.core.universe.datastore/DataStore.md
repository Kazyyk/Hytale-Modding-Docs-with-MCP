# DataStore

Type: interface | Package: com.hypixel.hytale.server.core.universe.datastore

public interface DataStore<T>

## Methods

- BuilderCodec<T> getCodec()
- @Nullable T load(String var1) throws IOException
- void save(String var1, T var2)
- void remove(String var1) throws IOException
- List<String> list() throws IOException
- @Nonnull default Map<String,T> loadAll() throws IOException
- default void saveAll(Map<String,T> objectsToSave)
- default void removeAll() throws IOException
