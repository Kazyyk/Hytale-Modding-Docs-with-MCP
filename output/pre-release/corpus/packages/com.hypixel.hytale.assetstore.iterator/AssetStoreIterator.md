# AssetStoreIterator

Type: class | Package: com.hypixel.hytale.assetstore.iterator | Implements: Iterator, Closeable

public class AssetStoreIterator implements Iterator, Closeable

## Fields

- private final List<AssetStore<?,?,?>> list

## Methods

- @Override public boolean hasNext()
- @Nullable public AssetStore<?,?,?> next()
- public int size()
- public boolean isWaitingForDependencies(AssetStore<?,?,?> assetStore)
- public boolean isBeingWaitedFor(AssetStore<?,?,?> assetStore)
- @Override public void close()

Also in this package: CircularDependencyException

Complete API:
  public boolean hasNext()
  public AssetStore<?,?,?> next()
  public int size()
  public boolean isWaitingForDependencies(AssetStore<?,?,?> assetStore)
  public boolean isBeingWaitedFor(AssetStore<?,?,?> assetStore)
  public void close()

Fields:
private final List<AssetStore<?,?,?>> list
