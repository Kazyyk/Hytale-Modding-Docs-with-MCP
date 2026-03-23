# SoundPlay2DCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.sound | Extends: AbstractTargetPlayerCommand

public class SoundPlay2DCommand extends AbstractTargetPlayerCommand

## Fields

- private final RequiredArg<SoundEvent> soundEventArg
- private final DefaultArg<SoundCategory> categoryArg
- private final FlagArg allFlag

## Methods

- @Override protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Also in this package: SoundCommand, SoundPlay3DCommand

Complete API:
  protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<SoundEvent> soundEventArg
private final DefaultArg<SoundCategory> categoryArg
private final FlagArg allFlag
