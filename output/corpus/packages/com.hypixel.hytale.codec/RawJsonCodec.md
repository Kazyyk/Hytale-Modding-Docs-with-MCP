# RawJsonCodec

Type: interface | Package: com.hypixel.hytale.codec

public interface RawJsonCodec<T>

Interface for codecs that can decode directly from a raw JSON stream (`RawJsonReader`) without first parsing to BSON.

## Methods

- T decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
