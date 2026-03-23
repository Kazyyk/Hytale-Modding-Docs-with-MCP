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

Also in this package: BsonDocumentCodec, EnumCodec, EnumStyle, StringIntegerCodec, UUIDBinaryCodec

Complete API:
  public InetSocketAddress decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(InetSocketAddress r, ExtraInfo extraInfo)
  public InetSocketAddress decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)
  private static InetSocketAddress decodeString(String value, int defaultPort)

Fields:
private static final Pattern ADDRESS_PATTERN
private final int defaultPort
