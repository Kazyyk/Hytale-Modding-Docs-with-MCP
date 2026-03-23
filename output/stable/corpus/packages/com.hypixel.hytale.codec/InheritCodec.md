# InheritCodec

Type: interface | Package: com.hypixel.hytale.codec | Extends: Codec<T>

public interface InheritCodec<T> extends Codec<T>

Codec extension supporting asset inheritance. Decodes a child value that inherits default field values from a parent instance.

## Methods

- T decodeAndInherit(RawJsonReader reader, T parent, ExtraInfo extraInfo)

Known implementors: ACodecMapCodec, AssetCodec, BuilderCodec

Also in this package: Codec, DirectDecodeCodec, DocumentContainingCodec, EmptyExtraInfo, ExtraInfo, KeyedCodec, PrimitiveCodec, RawJsonCodec, RawJsonInheritCodec, VersionedExtraInfo, WrappedCodec

Complete API:
  T decodeAndInherit(BsonDocument var1, T var2, ExtraInfo var3)
  void decodeAndInherit(BsonDocument var1, T var2, T var3, ExtraInfo var4)
