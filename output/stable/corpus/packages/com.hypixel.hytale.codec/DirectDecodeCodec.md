# DirectDecodeCodec

Type: interface | Package: com.hypixel.hytale.codec | Extends: Codec<T>

public interface DirectDecodeCodec<T> extends Codec<T>

Extension of `Codec` that supports in-place decoding into an existing object instance rather than creating a new one.

## Methods

- void decode(BsonValue bsonValue, T target, ExtraInfo extraInfo)

Known implementors: BuilderCodec

Also in this package: Codec, DocumentContainingCodec, EmptyExtraInfo, ExtraInfo, InheritCodec, KeyedCodec, PrimitiveCodec, RawJsonCodec, RawJsonInheritCodec, VersionedExtraInfo, WrappedCodec

Complete API:
  void decode(BsonValue var1, T var2, ExtraInfo var3)
