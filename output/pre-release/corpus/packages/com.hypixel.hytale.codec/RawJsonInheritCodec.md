# RawJsonInheritCodec

Type: class | Package: com.hypixel.hytale.codec

public interface RawJsonInheritCodec<T> extends InheritCodec<T>

Combines `InheritCodec` and `RawJsonCodec` to support both inheritance-based decoding and raw JSON stream decoding.

## Methods

- T decodeAndInheritJson(RawJsonReader reader, T parent, ExtraInfo extraInfo)

Known implementors: InheritCodec

Also in this package: Codec, DirectDecodeCodec, DocumentContainingCodec, EmptyExtraInfo, ExtraInfo, InheritCodec, KeyedCodec, PrimitiveCodec, RawJsonCodec, VersionedExtraInfo, WrappedCodec

Complete API:
  T decodeAndInheritJson(RawJsonReader var1, T var2, ExtraInfo var3)
  void decodeAndInheritJson(RawJsonReader var1, T var2, T var3, ExtraInfo var4)
