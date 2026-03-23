# ObjectCodecMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: ACodecMapCodec<K, T, Codec<? extends T>>

public class ObjectCodecMapCodec<K, T> extends ACodecMapCodec<K, T, Codec<? extends T>>

Generic-keyed polymorphic codec map. Unlike `CodecMapCodec` (which is always string-keyed), this variant supports any key type `K` with a corresponding key codec.
