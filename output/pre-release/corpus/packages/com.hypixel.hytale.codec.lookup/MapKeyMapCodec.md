# MapKeyMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: ACodecMapCodec<String, T, Codec<? extends T>>

public class MapKeyMapCodec<T> extends ACodecMapCodec<String, T, Codec<? extends T>>

Codec map variant that uses the BSON document's map key (rather than a nested field) as the discriminator. When an object has a single key-value pair, the key selects the codec and the value is decoded with it.

Also in this package: ACodecMapCodec, AMapProvidedMapCodec, BuilderCodecMapCodec, CodecMapCodec, CodecPriority, MapProvidedMapCodec, ObjectCodecMapCodec, Priority, StringCodecMapCodec, TypeMap, UnknownIdException

Complete API:
  public void register(Class<T> tClass, String id, Codec<T> codec)
  public void unregister(Class<T> tClass)
  public V decodeById(String id, BsonValue value, ExtraInfo extraInfo)
  protected String getIdForKey(Class<? extends V> key)
  public MapKeyMapCodec.TypeMap<V> createMap()
  public void handleUnknown(MapKeyMapCodec.TypeMap<V> map, String key, BsonValue value, ExtraInfo extraInfo)
  public void handleUnknown(MapKeyMapCodec.TypeMap<V> map, String key, RawJsonReader reader, ExtraInfo extraInfo)
  protected void encodeExtra(BsonDocument document, MapKeyMapCodec.TypeMap<V> map, ExtraInfo extraInfo)
  public Class<? extends V> getKeyForId(String id)
  protected MapKeyMapCodec.TypeMap<V> emptyMap()
  protected MapKeyMapCodec.TypeMap<V> unmodifiableMap(MapKeyMapCodec.TypeMap<V> m)

Fields:
private static final HytaleLogger LOGGER
private static final Set<Reference<MapKeyMapCodec.TypeMap<?>>> ACTIVE_MAPS
private static final ReferenceQueue<MapKeyMapCodec.TypeMap<?>> MAP_REFERENCE_QUEUE
private static final StampedLock DATA_LOCK
protected final Map<String,Class<? extends V>> idToClass
protected final Map<Class<? extends V>,String> classToId
