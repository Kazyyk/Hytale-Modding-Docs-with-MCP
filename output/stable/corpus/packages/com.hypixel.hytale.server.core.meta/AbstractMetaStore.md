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
