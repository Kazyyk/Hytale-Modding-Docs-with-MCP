# CodecMapRegistry

Type: class | Package: com.hypixel.hytale.server.core.plugin.registry | Implements: IRegistry

public class CodecMapRegistry<T, C extends Codec<? extends T>> implements IRegistry

Plugin registry for registering codec entries into a `StringCodecMapCodec`. Each registration maps a string ID and class to a codec, with an unregister callback that acquires the global asset write lock during cleanup. Supports optional `Priority` for ordering. Contains the inner `Assets` subclass for `JsonAsset`-specific registration using `BuilderCodec`.

## Constructors

- CodecMapRegistry(List<BooleanConsumer> unregister, StringCodecMapCodec<T, C> mapCodec) | Creates a registry backed by the given codec map and unregister list.

## Methods

- register(String id, Class<? extends T> aClass, C codec) | CodecMapRegistry<T, C> | Registers a codec entry by ID and class.
- register(@Nonnull Priority priority, @Nonnull String id, Class<? extends T> aClass, C codec) | CodecMapRegistry<T, C> | Registers with explicit priority ordering.
- shutdown() | void | No-op shutdown hook.

## Inner Classes

- Assets<T, C> | Subclass for `JsonAsset`-typed registrations using `AssetCodecMapCodec` and `BuilderCodec`.

Known subclasses: Assets

Also in this package: AssetRegistry, Assets, IRegistry, MapKeyMapRegistry

Complete API:
  public CodecMapRegistry<T,C> register(String id, Class<? extends T> aClass, C codec)
  public CodecMapRegistry<T,C> register(Priority priority, String id, Class<? extends T> aClass, C codec)
  public void shutdown()

Fields:
protected final StringCodecMapCodec<T,C> mapCodec
protected final List<BooleanConsumer> unregister
