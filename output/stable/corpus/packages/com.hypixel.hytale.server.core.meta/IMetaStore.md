# IMetaStore

Type: interface | Package: com.hypixel.hytale.server.core.meta

public interface IMetaStore<K>

Defines the contract for IMetaStore operations.

## Methods

- default <T> T getMetaObject(MetaKey<T> key)
- @Nullable default <T> T getIfPresentMetaObject(MetaKey<T> key)
- @Nullable default <T> T putMetaObject(MetaKey<T> key, T obj)
- @Nullable default <T> T removeMetaObject(MetaKey<T> key)
- @Nullable default <T> T removeSerializedMetaObject(MetaKey<T> key)
- default boolean hasMetaObject(MetaKey<?> key)
- default void forEachMetaObject(IMetaStore.MetaEntryConsumer consumer)
- default void markMetaStoreDirty()
- default boolean consumeMetaStoreDirty()
