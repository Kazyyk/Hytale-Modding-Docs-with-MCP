# SendMessageInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple | Extends: SimpleInstantInteraction

public class SendMessageInteraction extends SimpleInstantInteraction

Interaction handler extending `SimpleInstantInteraction`.

## Fields

- key | String | String field.
- message | String | String field.

## Constructors

- SendMessageInteraction(@Nonnull String id, @Nonnull String message) | Creates a new SendMessageInteraction instance.
- SendMessageInteraction() | Creates a new SendMessageInteraction instance.

## Methods

- firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler) | void | protected method.
- toString() | String | public method.

Also in this package: ApplyEffectInteraction, RemoveEntityInteraction

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public String toString()

Fields:
public static final BuilderCodec<SendMessageInteraction> CODEC
private String key
private String message
