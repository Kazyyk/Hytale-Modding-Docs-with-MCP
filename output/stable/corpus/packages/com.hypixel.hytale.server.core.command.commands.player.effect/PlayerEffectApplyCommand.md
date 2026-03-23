# PlayerEffectApplyCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.player.effect | Extends: AbstractPlayerCommand

public class PlayerEffectApplyCommand extends AbstractPlayerCommand

Console command handling PlayerEffectApply operations.

## Constants

- private static final float DEFAULT_DURATION

## Fields

- @Nonnull private final RequiredArg<EntityEffect> effectArg

## Methods

- public PlayerEffectApplyCommand()
- @Override protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)

Also in this package: PlayerEffectApplyOtherCommand, PlayerEffectClearCommand, PlayerEffectClearOtherCommand, PlayerEffectSubCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final float DEFAULT_DURATION
private final RequiredArg<EntityEffect> effectArg
private final DefaultArg<Float> durationArg
