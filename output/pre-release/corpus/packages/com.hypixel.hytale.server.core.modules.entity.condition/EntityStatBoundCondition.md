# EntityStatBoundCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public abstract class EntityStatBoundCondition extends Condition

Abstract base for conditions that evaluate against a named entity stat. Lazily resolves the stat name to an index via `EntityStatType.getAssetMap()`. Subclasses implement `eval0(Ref, Instant, EntityStatValue)`.

## Static Fields

- public static final BuilderCodec<EntityStatBoundCondition> CODEC

## Relationships

- Extends Condition
