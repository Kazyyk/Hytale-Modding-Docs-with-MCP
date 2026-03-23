# CommandInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple | Extends: SimpleInstantInteraction

public class CommandInteraction extends SimpleInstantInteraction

Interaction that executes a server command as the owning player. When triggered, retrieves the `Player` component from the owning entity and passes the configured command string to `CommandManager.handleCommand()`.

## Fields

- CODEC | BuilderCodec<CommandInteraction> | Codec with inherited `Command` string field.
- command | String | The command to execute.

## Methods

- protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
- @Nonnull String toString()

Also in this package: ApplyEffectInteraction, RemoveEntityInteraction, SendMessageInteraction

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public String toString()

Fields:
public static final BuilderCodec<CommandInteraction> CODEC
private String command
