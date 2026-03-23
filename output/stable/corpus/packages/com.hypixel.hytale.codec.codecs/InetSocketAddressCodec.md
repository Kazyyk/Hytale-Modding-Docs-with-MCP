# InetSocketAddressCodec

Type: class | Package: com.hypixel.hytale.codec.codecs | Implements: Codec<InetSocketAddress>

public class InetSocketAddressCodec implements Codec<InetSocketAddress>

Codec for serializing and deserializing InetSocketAddress values.

## Constants

- private static final Pattern ADDRESS_PATTERN

## Fields

- private final int defaultPort

## Methods

- public InetSocketAddressCodec(int defaultPort)
- @Nonnull public InetSocketAddress decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- @Nonnull public BsonValue encode(@Nonnull InetSocketAddress r, ExtraInfo extraInfo)
- @Nonnull public InetSocketAddress decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)
- @Nonnull private static InetSocketAddress decodeString(@Nonnull String value, int defaultPort)
