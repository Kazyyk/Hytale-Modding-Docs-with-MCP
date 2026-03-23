# UUIDBinaryCodec

Type: class | Package: com.hypixel.hytale.codec.codecs | Implements: Codec<UUID>

public class UUIDBinaryCodec implements Codec<UUID>

Codec for serializing and deserializing UUIDBinary values.

## Methods

- @Nonnull public UUID decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull UUID uuid, ExtraInfo extraInfo)
- @Nonnull public UUID decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- public static void writeLongToArrayBigEndian(@Nonnull byte[] bytes, int offset, long x)
- public static long readLongFromArrayBigEndian(@Nonnull byte[] bytes, int offset)
- @Nonnull public static UUID uuidFromBytes(@Nonnull byte[] bytes)
- @Nonnull public static UUID uuidFromHex(String src)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
