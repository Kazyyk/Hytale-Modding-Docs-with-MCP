# DirectDecodeCodec

Type: interface | Package: com.hypixel.hytale.codec | Extends: Codec<T>

public interface DirectDecodeCodec<T> extends Codec<T>

Extension of `Codec` that supports in-place decoding into an existing object instance rather than creating a new one.

## Methods

- void decode(BsonValue bsonValue, T target, ExtraInfo extraInfo)
