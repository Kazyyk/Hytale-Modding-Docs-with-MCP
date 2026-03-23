# RemoveEntityInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple | Extends: SimpleInstantInteraction

public class RemoveEntityInteraction extends SimpleInstantInteraction

Interaction handler extending `SimpleInstantInteraction`.

## Fields

- entityTarget | InteractionTarget | InteractionTarget field.

## Methods

- firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler) | void | protected method.
- simulateFirstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler) | void | protected method.
- generatePacket() | Interaction | protected method.
- configurePacket(Interaction packet) | void | protected method.
- toString() | String | public method.

Also in this package: ApplyEffectInteraction, SendMessageInteraction

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateFirstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<RemoveEntityInteraction> CODEC
private InteractionTarget entityTarget
