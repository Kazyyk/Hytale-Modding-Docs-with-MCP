# ExplodeInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInstantInteraction

public class ExplodeInteraction extends SimpleInstantInteraction

Performs an explosion using a provided `ExplosionConfig`. Determines the explosion center from either a hit location, a collision block position, or the entity's transform position. Automatically detects whether the source entity is a projectile and constructs the appropriate `Damage.Source` (projectile or environment). Delegates to `ExplosionUtils.performExplosion()`.

## Codec

`ExplodeInteraction.CODEC` -- `BuilderCodec<ExplodeInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
