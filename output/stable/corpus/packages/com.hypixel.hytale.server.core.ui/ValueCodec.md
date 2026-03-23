# ValueCodec

Type: class | Package: com.hypixel.hytale.server.core.ui | Implements: Codec<Value<T>>

public class ValueCodec<T> implements Codec<Value<T>>

## Fields

- public static final ValueCodec<Object> REFERENCE_ONLY
- public static final ValueCodec<String> STRING
- public static final ValueCodec<LocalizableString> LOCALIZABLE_STRING
- public static final ValueCodec<Integer> INTEGER
- public static final ValueCodec<PatchStyle> PATCH_STYLE
- protected Codec<T> codec

## Constructors

- ValueCodec(Codec<T> codec)

## Methods

- public Value<T> decode(BsonValue bsonValue, ExtraInfo extraInfo)
- public BsonValue encode(@Nonnull Value<T> r, ExtraInfo extraInfo)
- @Nonnull @Override public Schema toSchema(@Nonnull SchemaContext context)

Also in this package: Anchor, Area, DropdownEntryInfo, ItemGridSlot, LocalizableString, LocalizableStringCodec, PatchStyle, Value

Complete API:
  public Value<T> decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(Value<T> r, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)

Fields:
public static final ValueCodec<Object> REFERENCE_ONLY
public static final ValueCodec<String> STRING
public static final ValueCodec<LocalizableString> LOCALIZABLE_STRING
public static final ValueCodec<Integer> INTEGER
public static final ValueCodec<PatchStyle> PATCH_STYLE
protected Codec<T> codec
