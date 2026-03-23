# DynamicMetaStore

Type: class | Package: com.hypixel.hytale.server.core.meta | Extends: AbstractMetaStore<K>

public class DynamicMetaStore<K> extends AbstractMetaStore<K>

Extends `AbstractMetaStore` to provide DynamicMetaStore functionality.

## Fields

- @Nonnull private final Int2ObjectMap<Object> map

## Methods

- public DynamicMetaStore(K parent, IMetaRegistry<K> registry)
- public DynamicMetaStore(K parent, IMetaRegistry<K> registry, boolean bypassEncodedCache)
- @Override protected <T> T get0(@Nonnull MetaKey<T> key)
- @Override public <T> T getMetaObject(@Nonnull MetaKey<T> key)
- @Override public <T> T getIfPresentMetaObject(@Nonnull MetaKey<T> key)
- @Override public <T> T putMetaObject(@Nonnull MetaKey<T> key, T obj)
- @Override public <T> T removeMetaObject(@Nonnull MetaKey<T> key)
- @Nullable @Override public <T> T removeSerializedMetaObject(MetaKey<T> key)
- @Override public boolean hasMetaObject(@Nonnull MetaKey<?> key)
- @Override public void forEachMetaObject(@Nonnull IMetaStore.MetaEntryConsumer consumer)
- @Nonnull public DynamicMetaStore<K> clone(K parent)
- public void copyFrom(@Nonnull DynamicMetaStore<K> other)

Also in this package: AbstractMetaStore, ArrayMetaStore, IMetaRegistry, IMetaStore, IMetaStoreImpl, MetaEntryConsumer, MetaEntryConsumer, MetaKey, MetaRegistry, MetaRegistryEntry, PersistentMetaKey

Complete API:
  protected T get0(MetaKey<T> key)
  public T getMetaObject(MetaKey<T> key)
  public T getIfPresentMetaObject(MetaKey<T> key)
  public T putMetaObject(MetaKey<T> key, T obj)
  public T removeMetaObject(MetaKey<T> key)
  public T removeSerializedMetaObject(MetaKey<T> key)
  public boolean hasMetaObject(MetaKey<?> key)
  public void forEachMetaObject(IMetaStore.MetaEntryConsumer consumer)
  public DynamicMetaStore<K> clone(K parent)
  public void copyFrom(DynamicMetaStore<K> other)

Fields:
private final Int2ObjectMap<Object> map
