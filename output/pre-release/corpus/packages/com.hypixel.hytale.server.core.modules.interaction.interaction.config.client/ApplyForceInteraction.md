# ApplyForceInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInteraction

public class ApplyForceInteraction extends SimpleInteraction

Applies one or more forces to the interacting entity with configurable direction, magnitude, and velocity change type (Set or Add). Supports waiting for ground contact, entity collision, or a timer before branching to different follow-up interactions (`GroundNext`, `CollisionNext`, or the default `Next`). Forces can be adjusted by the player's vertical look angle with optional clamping. Includes configurable raycast distance and mode for collision detection, ground/collision check delays, and velocity configuration. Requires client-side synchronization.

## Codec

`ApplyForceInteraction.CODEC` -- `BuilderCodec<ApplyForceInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
