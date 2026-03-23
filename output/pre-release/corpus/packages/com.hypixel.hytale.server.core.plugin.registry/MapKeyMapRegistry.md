# MapKeyMapRegistry

Type: class | Package: com.hypixel.hytale.server.core.plugin.registry | Implements: IRegistry

public class MapKeyMapRegistry<V> implements IRegistry

Plugin registry for registering entries into a `MapKeyMapCodec`. Maps a class, string ID, and codec together. The unregister callback acquires the global asset write lock and only runs during non-shutdown unloads.

## Constructors

- MapKeyMapRegistry(List<BooleanConsumer> unregister, MapKeyMapCodec<V> mapCodec) | Creates a registry backed by the given codec map and unregister list.

## Methods

- register(@Nonnull Class<T> tClass, @Nonnull String id, @Nonnull Codec<T> codec) | MapKeyMapRegistry<V> | Registers a class-ID-codec triple with an unregister callback.
- shutdown() | void | No-op shutdown hook.
