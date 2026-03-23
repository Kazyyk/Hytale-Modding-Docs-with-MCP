# RawJsonInheritCodec

Type: class | Package: com.hypixel.hytale.codec

public interface RawJsonInheritCodec<T> extends InheritCodec<T>

Combines `InheritCodec` and `RawJsonCodec` to support both inheritance-based decoding and raw JSON stream decoding.

## Methods

- T decodeAndInheritJson(RawJsonReader reader, T parent, ExtraInfo extraInfo)
