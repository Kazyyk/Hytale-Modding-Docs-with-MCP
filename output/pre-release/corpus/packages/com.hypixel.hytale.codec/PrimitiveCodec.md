# PrimitiveCodec

Type: class | Package: com.hypixel.hytale.codec

public abstract class PrimitiveCodec<T> implements Codec<T>

Abstract base class for codecs that handle primitive or simple value types. Provides common BSON/JSON encode/decode patterns for non-object values.

Known implementors: BooleanCodec, ByteCodec, DoubleCodec, FloatCodec, IntegerCodec, LongCodec, ShortCodec

Also in this package: Codec, DirectDecodeCodec, DocumentContainingCodec, EmptyExtraInfo, ExtraInfo, InheritCodec, KeyedCodec, RawJsonCodec, RawJsonInheritCodec, VersionedExtraInfo, WrappedCodec
