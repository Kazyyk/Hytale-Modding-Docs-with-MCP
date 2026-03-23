# AmbienceEmitterAddCommand

Type: class | Package: com.hypixel.hytale.builtin.ambience.commands | Extends: AbstractPlayerCommand

public class AmbienceEmitterAddCommand extends AbstractPlayerCommand

Abstract base for related commands.

## Constructors

- AmbienceEmitterAddCommand() | Creates a new AmbienceEmitterAddCommand instance.

Also in this package: AmbienceClearCommand, AmbienceCommands, AmbienceEmitterCommands, AmbienceSetMusicCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final AssetArgumentType<SoundEvent,?> SOUND_EVENT_ASSET_TYPE
private static final Message MESSAGE_SERVER_COMMANDS_ERRORS_PLAYER_ONLY
private final RequiredArg<SoundEvent> soundEventArg
