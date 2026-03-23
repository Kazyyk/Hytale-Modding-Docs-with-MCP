# MapProvidedMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: AMapProvidedMapCodec<String, T>

public class MapProvidedMapCodec<T> extends AMapProvidedMapCodec<String, T>

Concrete string-keyed map-provided codec. Resolves the codec for a BSON document by looking up the discriminator key in a dynamically supplied `Map<String, T>`.

Also in this package: ACodecMapCodec, AMapProvidedMapCodec, BuilderCodecMapCodec, CodecMapCodec, CodecPriority, MapKeyMapCodec, ObjectCodecMapCodec, Priority, StringCodecMapCodec, TypeMap, UnknownIdException

Complete API:
  public Map<String,V> createMap()
  protected String getIdForKey(String key)
  protected String getKeyForId(String id)
  protected Map<String,V> emptyMap()
  protected Map<String,V> unmodifiableMap(Map<String,V> m)

Fields:
private final Supplier<Map<String,V>> supplier
