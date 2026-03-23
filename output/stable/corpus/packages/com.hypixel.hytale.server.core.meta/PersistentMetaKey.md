# PersistentMetaKey

Type: class | Package: com.hypixel.hytale.server.core.meta | Extends: MetaKey<T>

public class PersistentMetaKey<T> extends MetaKey<T>

Extends `MetaKey` to provide PersistentMetaKey functionality.

## Fields

- private final String key
- private final Codec<T> codec

## Methods

- public String getKey()
- public Codec<T> getCodec()
- @Nonnull @Override public String toString()

Also in this package: AbstractMetaStore, ArrayMetaStore, DynamicMetaStore, IMetaRegistry, IMetaStore, IMetaStoreImpl, MetaEntryConsumer, MetaEntryConsumer, MetaKey, MetaRegistry, MetaRegistryEntry

Complete API:
  public String getKey()
  public Codec<T> getCodec()
  public String toString()

Fields:
private final String key
private final Codec<T> codec
