# DiskDataStore

Type: class | Package: com.hypixel.hytale.server.core.universe.datastore | Implements: DataStore

public class DiskDataStore<T> implements DataStore

## Fields

- private static final String EXTENSION
- private static final int EXTENSION_LEN
- private static final String EXTENSION_BACKUP
- private static final String GLOB
- private static final String GLOB_WITH_BACKUP
- private final HytaleLogger logger
- private final Path path
- private final BuilderCodec<T> codec

## Methods

- @Nonnull public Path getPath()
- @Override public BuilderCodec<T> getCodec()
- @Nullable @Override public T load(String id) throws IOException
- @Override public void save(String id, T value)
- @Override public void remove(String id) throws IOException
- @Nonnull @Override public List<String> list() throws IOException
- @Nonnull @Override public Map<String,T> loadAll() throws IOException
- @Override public void removeAll() throws IOException
- @Nullable protected T load0(Path path) throws IOException
- @Nonnull protected static Path getPathFromId(Path path, String id)
- @Nonnull protected static Path getBackupPathFromId(Path path, String id)
- @Nonnull protected static String getIdFromPath(Path path)

Also in this package: DataStore, DataStoreProvider, DiskDataStoreProvider

Complete API:
  public Path getPath()
  public BuilderCodec<T> getCodec()
  public T load(String id)
  public void save(String id, T value)
  public void remove(String id)
  public List<String> list()
  public Map<String,T> loadAll()
  public void removeAll()
  protected T load0(Path path)
  protected static Path getPathFromId(Path path, String id)
  protected static Path getBackupPathFromId(Path path, String id)
  protected static String getIdFromPath(Path path)

Fields:
private static final String EXTENSION
private static final int EXTENSION_LEN
private static final String EXTENSION_BACKUP
private static final String GLOB
private static final String GLOB_WITH_BACKUP
private final HytaleLogger logger
private final Path path
private final BuilderCodec<T> codec
