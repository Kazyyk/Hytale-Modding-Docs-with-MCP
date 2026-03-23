# StringCodecMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: ACodecMapCodec<String, T, Codec<? extends T>>

public class StringCodecMapCodec<T> extends ACodecMapCodec<String, T, Codec<? extends T>>

String-keyed codec map that decodes from a plain string value rather than a BSON document. When the input is a string, it is used directly as the lookup key. When the input is a document, it falls back to the standard key-field lookup.

Known subclasses: AssetCodecMapCodec, BuilderCodecMapCodec, CodecMapCodec

Also in this package: ACodecMapCodec, AMapProvidedMapCodec, BuilderCodecMapCodec, CodecMapCodec, CodecPriority, MapKeyMapCodec, MapProvidedMapCodec, ObjectCodecMapCodec, Priority, TypeMap, UnknownIdException

Complete API:
  public StringCodecMapCodec<T,C> register(Priority priority, String id, Class<? extends T> aClass, C codec)
  public void remove(Class<? extends T> aClass)
  public T decodeJson(RawJsonReader reader, ExtraInfo extraInfo)

Fields:
protected final StampedLock stampedLock
protected final StringTreeMap<C> stringTreeMap
