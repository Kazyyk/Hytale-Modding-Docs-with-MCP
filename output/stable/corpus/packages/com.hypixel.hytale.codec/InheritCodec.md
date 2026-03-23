# InheritCodec

Type: interface | Package: com.hypixel.hytale.codec | Extends: Codec<T>

public interface InheritCodec<T> extends Codec<T>

Codec extension supporting asset inheritance. Decodes a child value that inherits default field values from a parent instance.

## Methods

- T decodeAndInherit(RawJsonReader reader, T parent, ExtraInfo extraInfo)
