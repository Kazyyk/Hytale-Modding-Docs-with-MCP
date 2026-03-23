# InteractionPriorityCodec

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Implements: Codec<InteractionPriority>

public class InteractionPriorityCodec implements Codec<InteractionPriority>

Custom codec that decodes an InteractionPriority from either an integer (default value) or a map of named priority slots.

## Key Methods

- public InteractionPriority decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)
- public BsonValue encode(@Nonnull InteractionPriority priority, ExtraInfo extraInfo)
- public InteractionPriority decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)
- public Schema toSchema(@Nonnull SchemaContext context)
