# AMapProvidedMapCodec

Type: class | Package: com.hypixel.hytale.codec.lookup | Extends: java.lang.Object | Implements: Codec<T>

public abstract class AMapProvidedMapCodec<K, T> implements Codec<T>

Abstract codec that resolves keys from a provided map at decode time. Decodes values by looking up the discriminator key in a dynamically supplied map rather than a fixed registry. Used where the set of available codecs varies by context.
