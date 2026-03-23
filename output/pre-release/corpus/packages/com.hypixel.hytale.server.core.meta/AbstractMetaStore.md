# AbstractMetaStore

Type: class | Package: com.hypixel.hytale.server.core.meta | Implements: IMetaStoreImpl<K>

public abstract class AbstractMetaStore<K> implements IMetaStoreImpl<K>

Abstract base class providing shared logic for MetaStore implementations.

## Fields

- protected final K parent
- protected final IMetaRegistry<K> registry
- @Nonnull private final BsonDocument unknownValues
- @Nonnull private final IntSet notUnknownKeys
- @Nullable private BsonDocument cachedEncoded
- private boolean dirty
- private boolean bypassEncodedCache

## Methods

- public AbstractMetaStore(K parent, IMetaRegistry<K> registry, boolean bypassEncodedCache)
- protected abstract <T> T get0(MetaKey<T> var1)
- @Nonnull @Override public IMetaStoreImpl<K> getMetaStore()
- @Override public IMetaRegistry<K> getRegistry()
- @Override public void forEachUnknownEntry(BiConsumer<String, BsonValue> consumer)
- @Override public final void markMetaStoreDirty()
- @Override public final boolean consumeMetaStoreDirty()
- protected <T> T decodeOrNewMetaObject(MetaKey<T> key)
- protected <T> boolean tryDecodeUnknownKey(@Nonnull PersistentMetaKey<T> key)
- @Nonnull @Override public BsonDocument encode(final ExtraInfo extraInfo)
- @Override public void decode(@Nonnull BsonDocument document, ExtraInfo extraInfo)

Known subclasses: ArrayMetaStore, DynamicMetaStore

Also in this package: ArrayMetaStore, DynamicMetaStore, IMetaRegistry, IMetaStore, IMetaStoreImpl, MetaEntryConsumer, MetaEntryConsumer, MetaKey, MetaRegistry, MetaRegistryEntry, PersistentMetaKey

Complete API:
  protected abstract T get0(MetaKey<T> var1)
  public IMetaStoreImpl<K> getMetaStore()
  public IMetaRegistry<K> getRegistry()
  public void forEachUnknownEntry(BiConsumer<String,BsonValue> consumer)
  public final void markMetaStoreDirty()
  public final boolean consumeMetaStoreDirty()
  protected T decodeOrNewMetaObject(MetaKey<T> key)
  protected boolean tryDecodeUnknownKey(PersistentMetaKey<T> key)
  public BsonDocument encode(ExtraInfo extraInfo)
  public void decode(BsonDocument document, ExtraInfo extraInfo)

Fields:
protected final K parent
protected final IMetaRegistry<K> registry
private final BsonDocument unknownValues
private final IntSet notUnknownKeys
private BsonDocument cachedEncoded
private boolean dirty
private boolean bypassEncodedCache
