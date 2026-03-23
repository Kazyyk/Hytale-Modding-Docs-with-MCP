# MetaRegistry

Type: class | Package: com.hypixel.hytale.server.core.meta | Implements: IMetaRegistry<K>

public class MetaRegistry<K> implements IMetaRegistry<K>

Implements `IMetaRegistry` to provide MetaRegistry functionality.

## Fields

- private final Map<String, MetaRegistry.MetaRegistryEntry> parameterMapping
- private final List<MetaRegistry.MetaRegistryEntry> suppliers
- private final ReentrantReadWriteLock lock

## Methods

- @Override public <T> MetaKey<T> registerMetaObject(Function<K, T> function, boolean persistent, String keyName, @Nonnull Codec<T> codec)
- @Override public <T> T newMetaObject(@Nonnull MetaKey<T> key, K parent)
- @Override public void forEachMetaEntry(@Nonnull IMetaStore<K> store, @Nonnull final IMetaRegistry.MetaEntryConsumer consumer)
- @Nullable @Override public PersistentMetaKey<?> getMetaKeyForCodecKey(String codecKey)
