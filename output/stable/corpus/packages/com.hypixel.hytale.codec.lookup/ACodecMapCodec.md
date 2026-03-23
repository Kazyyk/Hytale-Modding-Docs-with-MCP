# ACodecMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: java.lang.Object | Implements: Codec<T>, ValidatableCodec<T>, InheritCodec<T>

public abstract class ACodecMapCodec<K, T, C extends Codec<? extends T>> implements Codec<T>, ValidatableCodec<T>, InheritCodec<T>

Abstract base class for polymorphic codec maps that dispatch deserialization based on a discriminator key in the BSON document. Maintains concurrent bidirectional mappings between keys, classes, and codecs. Supports priority-ordered default codecs, inheritance-aware decoding, and JSON schema generation.
