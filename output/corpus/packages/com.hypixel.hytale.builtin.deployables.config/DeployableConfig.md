# DeployableConfig

Type: class | Package: com.hypixel.hytale.builtin.deployables.config

public abstract class DeployableConfig

Abstract base configuration for all deployable types. Defines common properties: ID, model, model scale, max live count, live duration, invulnerability, sound events (deploy/despawn/die/ambient), particles, hitbox collision, debug visuals, wall placement, and stat values. Codec-registered via `CodecMapCodec` with a `Type` discriminator.
