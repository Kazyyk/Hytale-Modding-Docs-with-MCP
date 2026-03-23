# WrappedCodec

Type: class | Package: com.hypixel.hytale.codec

public class WrappedCodec<T> implements Codec<T>

Codec decorator that wraps another codec, allowing interception or modification of the encode/decode process.

Known implementors: ArrayCodec, BsonFunctionCodec, EnumMapCodec, Float2ObjectMapCodec, Int2ObjectMapCodec, MapCodec, MergedEnumMapCodec, Object2DoubleMapCodec, Object2FloatMapCodec, Object2IntMapCodec, ObjectMapCodec, SetCodec, Short2ObjectMapCodec, WeightedMapCodec

Also in this package: Codec, DirectDecodeCodec, DocumentContainingCodec, EmptyExtraInfo, ExtraInfo, InheritCodec, KeyedCodec, PrimitiveCodec, RawJsonCodec, RawJsonInheritCodec, VersionedExtraInfo

Complete API:
  Codec<T> getChildCodec()
