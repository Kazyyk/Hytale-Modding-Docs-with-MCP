# MapProvidedMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: AMapProvidedMapCodec<String, T>

public class MapProvidedMapCodec<T> extends AMapProvidedMapCodec<String, T>

Concrete string-keyed map-provided codec. Resolves the codec for a BSON document by looking up the discriminator key in a dynamically supplied `Map<String, T>`.
