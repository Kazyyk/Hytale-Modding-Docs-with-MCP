# DiskDataStoreProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.datastore | Implements: DataStoreProvider

public class DiskDataStoreProvider implements DataStoreProvider

## Fields

- public static final String ID
- public static final BuilderCodec<DiskDataStoreProvider> CODEC
- private String path

## Methods

- @Nonnull @Override public DataStore<T> create(BuilderCodec<T> builderCodec)
- @Nonnull @Override public String toString()

Also in this package: DataStore, DataStoreProvider, DiskDataStore

Complete API:
  public DataStore<T> create(BuilderCodec<T> builderCodec)
  public String toString()

Fields:
public static final String ID
public static final BuilderCodec<DiskDataStoreProvider> CODEC
private String path
