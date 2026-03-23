# AMapProvidedMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: java.lang.Object | Implements: Codec<T>

public abstract class AMapProvidedMapCodec<K, T> implements Codec<T>

Abstract codec that resolves keys from a provided map at decode time. Decodes values by looking up the discriminator key in a dynamically supplied map rather than a fixed registry. Used where the set of available codecs varies by context.

Known subclasses: MapKeyMapCodec, MapProvidedMapCodec

Also in this package: ACodecMapCodec, BuilderCodecMapCodec, CodecMapCodec, CodecPriority, MapKeyMapCodec, MapProvidedMapCodec, ObjectCodecMapCodec, Priority, StringCodecMapCodec, TypeMap, UnknownIdException

Complete API:
  public abstract M createMap()
  public void handleUnknown(M map, String key, BsonValue value, ExtraInfo extraInfo)
  public void handleUnknown(M map, String key, RawJsonReader reader, ExtraInfo extraInfo)
  public M decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(M map, ExtraInfo extraInfo)
  protected void encodeExtra(BsonDocument document, M map, ExtraInfo extraInfo)
  public M decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
  public void validate(M map, ExtraInfo extraInfo)
  public void validateDefaults(ExtraInfo extraInfo, Set<Codec<?>> tested)
  private Codec<V> getCodecFor(K key)
  protected abstract String getIdForKey(K var1)
  protected abstract K getKeyForId(String var1)
  protected abstract M emptyMap()
  protected abstract M unmodifiableMap(M var1)

Fields:
protected final Map<K,P> codecProvider
protected final Function<P,Codec<V>> mapper
protected final boolean unmodifiable
