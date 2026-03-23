# ACodecMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: java.lang.Object | Implements: Codec<T>, ValidatableCodec<T>, InheritCodec<T>

public abstract class ACodecMapCodec<K, T, C extends Codec<? extends T>> implements Codec<T>, ValidatableCodec<T>, InheritCodec<T>

Abstract base class for polymorphic codec maps that dispatch deserialization based on a discriminator key in the BSON document. Maintains concurrent bidirectional mappings between keys, classes, and codecs. Supports priority-ordered default codecs, inheritance-aware decoding, and JSON schema generation.

Known subclasses: ObjectCodecMapCodec, StringCodecMapCodec

Also in this package: AMapProvidedMapCodec, BuilderCodecMapCodec, CodecMapCodec, CodecPriority, MapKeyMapCodec, MapProvidedMapCodec, ObjectCodecMapCodec, Priority, StringCodecMapCodec, TypeMap, UnknownIdException

Complete API:
  public ACodecMapCodec<K,T,C> register(K id, Class<? extends T> aClass, C codec)
  public ACodecMapCodec<K,T,C> register(Priority priority, K id, Class<? extends T> aClass, C codec)
  public void remove(Class<? extends T> aClass)
  public C getDefaultCodec()
  public C getCodecFor(K key)
  public C getCodecFor(Class<? extends T> key)
  public Class<? extends T> getClassFor(K key)
  public K getIdFor(Class<? extends T> key)
  public Set<K> getRegisteredIds()
  public T decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public T decodeAndInherit(BsonDocument document, T parent, ExtraInfo extraInfo)
  public void decodeAndInherit(BsonDocument document, T t, T parent, ExtraInfo extraInfo)
  public BsonValue encode(T t, ExtraInfo extraInfo)
  public T decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public T decodeAndInheritJson(RawJsonReader reader, T parent, ExtraInfo extraInfo)
  public void decodeAndInheritJson(RawJsonReader reader, T t, T parent, ExtraInfo extraInfo)
  public void validate(T t, ExtraInfo extraInfo)
  public void validateDefaults(ExtraInfo extraInfo, Set<Codec<?>> tested)
  public Schema toSchema(SchemaContext context)
  protected void mutateChildSchema(String key, SchemaContext context, BuilderCodec<? extends T> c, ObjectSchema objectSchema)

Fields:
protected final String key
protected final Codec<K> keyCodec
protected final Map<K,C> idToCodec
protected final Map<Class<? extends T>,K> classToId
protected final Map<K,Class<? extends T>> idToClass
protected AtomicReference<ACodecMapCodec.CodecPriority<C>[]> codecs
protected final boolean allowDefault
protected final boolean encodeDefaultKey
