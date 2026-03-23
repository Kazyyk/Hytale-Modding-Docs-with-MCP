# IMetaRegistry

Type: interface | Package: com.hypixel.hytale.server.core.meta

public interface IMetaRegistry<K>

Defines the contract for IMetaRegistry operations. Manages registration, creation, and enumeration of meta objects keyed by `MetaKey`.

## Methods

- <T> T newMetaObject(MetaKey<T> var1, K var2)
- void forEachMetaEntry(IMetaStore<K> var1, IMetaRegistry.MetaEntryConsumer var2)
- @Nullable PersistentMetaKey<?> getMetaKeyForCodecKey(String var1)
- <T> MetaKey<T> registerMetaObject(Function<K, T> var1, boolean var2, String var3, Codec<T> var4)
- default <T> MetaKey<T> registerMetaObject(Function<K, T> supplier, String keyName, Codec<T> codec)
- default <T> MetaKey<T> registerMetaObject(Function<K, T> supplier)
- default <T> MetaKey<T> registerMetaObject()

Known implementors: MetaRegistry

Also in this package: AbstractMetaStore, ArrayMetaStore, DynamicMetaStore, IMetaStore, IMetaStoreImpl, MetaEntryConsumer, MetaEntryConsumer, MetaKey, MetaRegistry, MetaRegistryEntry, PersistentMetaKey

Complete API:
  T newMetaObject(MetaKey<T> var1, K var2)
  void forEachMetaEntry(IMetaStore<K> var1, IMetaRegistry.MetaEntryConsumer var2)
  PersistentMetaKey<?> getMetaKeyForCodecKey(String var1)
  MetaKey<T> registerMetaObject(Function<K,T> var1, boolean var2, String var3, Codec<T> var4)
  default MetaKey<T> registerMetaObject(Function<K,T> supplier, String keyName, Codec<T> codec)
  default MetaKey<T> registerMetaObject(Function<K,T> supplier)
  default MetaKey<T> registerMetaObject()
