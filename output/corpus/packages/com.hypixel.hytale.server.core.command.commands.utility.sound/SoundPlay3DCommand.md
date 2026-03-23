# SoundPlay3DCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.sound | Extends: AbstractTargetPlayerCommand

public class SoundPlay3DCommand extends AbstractTargetPlayerCommand

## Fields

- private final RequiredArg<SoundEvent> soundEventArg
- private final DefaultArg<SoundCategory> categoryArg
- private final RequiredArg<RelativeVector3i> positionArg
- private final FlagArg allFlag

## Methods

- @Override protected void execute(CommandContext context, Ref<EntityStore> sourceRef, Ref<EntityStore> ref, PlayerRef playerRef, World world, Store<EntityStore> store)
