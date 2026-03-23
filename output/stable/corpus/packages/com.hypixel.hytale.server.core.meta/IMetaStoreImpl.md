# IMetaStoreImpl

Type: interface | Package: com.hypixel.hytale.server.core.meta | Implements: IMetaStore<K>

public interface IMetaStoreImpl<K> extends IMetaStore<K>

Defines the contract for IMetaStoreImpl operations. Extends `IMetaStore` with encoding, decoding, and registry access capabilities for meta object persistence.

## Methods

- IMetaRegistry<K> getRegistry()
- void decode(BsonDocument var1, ExtraInfo var2)
- BsonDocument encode(ExtraInfo var1)
- void forEachUnknownEntry(BiConsumer<String, BsonValue> var1)

Known implementors: AbstractMetaStore

Also in this package: AbstractMetaStore, ArrayMetaStore, DynamicMetaStore, IMetaRegistry, IMetaStore, MetaEntryConsumer, MetaEntryConsumer, MetaKey, MetaRegistry, MetaRegistryEntry, PersistentMetaKey

Complete API:
  IMetaRegistry<K> getRegistry()
  void decode(BsonDocument var1, ExtraInfo var2)
  BsonDocument encode(ExtraInfo var1)
  void forEachUnknownEntry(BiConsumer<String,BsonValue> var1)
