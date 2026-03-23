# RawJsonCodec

Type: interface | Package: com.hypixel.hytale.codec

public interface RawJsonCodec<T>

Interface for codecs that can decode directly from a raw JSON stream (`RawJsonReader`) without first parsing to BSON.

## Methods

- T decodeJson(RawJsonReader reader, ExtraInfo extraInfo)

Known implementors: ArrayCodec, BooleanCodec, BuilderCodec, ByteCodec, Codec, DoubleArrayCodec, DoubleCodec, FloatArrayCodec, FloatCodec, IntArrayCodec, IntegerCodec, LongArrayCodec, LongCodec, RawJsonInheritCodec, ShortCodec, StringCodec

Also in this package: Codec, DirectDecodeCodec, DocumentContainingCodec, EmptyExtraInfo, ExtraInfo, InheritCodec, KeyedCodec, PrimitiveCodec, RawJsonInheritCodec, VersionedExtraInfo, WrappedCodec

Complete API:
  default T decodeJson(RawJsonReader reader)
  T decodeJson(RawJsonReader var1, ExtraInfo var2)
