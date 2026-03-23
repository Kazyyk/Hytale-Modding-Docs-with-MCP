# ObjectCodecMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: ACodecMapCodec<K, T, Codec<? extends T>>

public class ObjectCodecMapCodec<K, T> extends ACodecMapCodec<K, T, Codec<? extends T>>

Generic-keyed polymorphic codec map. Unlike `CodecMapCodec` (which is always string-keyed), this variant supports any key type `K` with a corresponding key codec.

Also in this package: ACodecMapCodec, AMapProvidedMapCodec, BuilderCodecMapCodec, CodecMapCodec, CodecPriority, MapKeyMapCodec, MapProvidedMapCodec, Priority, StringCodecMapCodec, TypeMap, UnknownIdException

Complete API:
  public ObjectCodecMapCodec<K,T> register(K id, Class<? extends T> aClass, Codec<? extends T> codec)
  public ObjectCodecMapCodec<K,T> register(Priority priority, K id, Class<? extends T> aClass, Codec<? extends T> codec)
