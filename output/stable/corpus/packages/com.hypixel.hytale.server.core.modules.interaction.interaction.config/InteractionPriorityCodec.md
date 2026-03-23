# InteractionPriorityCodec

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Implements: Codec<InteractionPriority>

public class InteractionPriorityCodec implements Codec<InteractionPriority>

Custom codec that decodes an InteractionPriority from either an integer (default value) or a map of named priority slots.

## Key Methods

- public InteractionPriority decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- public BsonValue encode(@Nonnull InteractionPriority priority, ExtraInfo extraInfo)
- public InteractionPriority decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- public Schema toSchema(@Nonnull SchemaContext context)

Also in this package: Interaction, InteractionCamera, InteractionCameraSettings, InteractionConfiguration, InteractionEffects, InteractionPriority, InteractionRules, InteractionTypeUtils, RootInteraction, SimpleInstantInteraction, SimpleInteraction

Complete API:
  public InteractionPriority decode(BsonValue bsonValue, ExtraInfo extraInfo)
  public BsonValue encode(InteractionPriority priority, ExtraInfo extraInfo)
  public InteractionPriority decodeJson(RawJsonReader reader, ExtraInfo extraInfo)
  public Schema toSchema(SchemaContext context)

Fields:
private static final EnumMapCodec<PrioritySlot,Integer> MAP_CODEC
