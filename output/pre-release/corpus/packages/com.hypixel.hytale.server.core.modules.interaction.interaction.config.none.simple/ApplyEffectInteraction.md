# ApplyEffectInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple | Extends: SimpleInstantInteraction

public class ApplyEffectInteraction extends SimpleInstantInteraction

Interaction handler extending `SimpleInstantInteraction`.

## Fields

- effectId | String | String field.
- entityTarget | InteractionTarget | InteractionTarget field.

## Methods

- firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler) | void | protected method.
- simulateFirstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler) | void | protected method.
- generatePacket() | Interaction | protected method.
- configurePacket(Interaction packet) | void | protected method.
- toString() | String | public method.
