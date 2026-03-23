# CodecMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: ACodecMapCodec<String, T, Codec<? extends T>>

public class CodecMapCodec<T> extends ACodecMapCodec<String, T, Codec<? extends T>>

Concrete string-keyed polymorphic codec map. The most commonly used codec map variant, using string IDs as discriminator keys. Extends `ACodecMapCodec` with `String` key type.

Also in this package: ACodecMapCodec, AMapProvidedMapCodec, BuilderCodecMapCodec, CodecPriority, MapKeyMapCodec, MapProvidedMapCodec, ObjectCodecMapCodec, Priority, StringCodecMapCodec, TypeMap, UnknownIdException

Complete API:
  public CodecMapCodec<T> register(String id, Class<? extends T> aClass, Codec<? extends T> codec)
  public CodecMapCodec<T> register(Priority priority, String id, Class<? extends T> aClass, Codec<? extends T> codec)
