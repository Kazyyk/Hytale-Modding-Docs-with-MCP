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

Known implementors: DiskDataStore

Also in this package: DataStoreProvider, DiskDataStore, DiskDataStoreProvider

Complete API:
  BuilderCodec<T> getCodec()
  T load(String var1)
  void save(String var1, T var2)
  void remove(String var1)
  List<String> list()
  default Map<String,T> loadAll()
  default void saveAll(Map<String,T> objectsToSave)
  default void removeAll()
