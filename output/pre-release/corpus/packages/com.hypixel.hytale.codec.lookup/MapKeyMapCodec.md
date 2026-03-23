# MapKeyMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: ACodecMapCodec<String, T, Codec<? extends T>>

public class MapKeyMapCodec<T> extends ACodecMapCodec<String, T, Codec<? extends T>>

Codec map variant that uses the BSON document's map key (rather than a nested field) as the discriminator. When an object has a single key-value pair, the key selects the codec and the value is decoded with it.
