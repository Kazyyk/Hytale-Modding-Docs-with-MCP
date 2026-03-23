# AmbienceSetMusicCommand

Type: class | Package: com.hypixel.hytale.builtin.ambience.commands | Extends: AbstractWorldCommand

public class AmbienceSetMusicCommand extends AbstractWorldCommand

Abstract base for related commands.

## Constructors

- AmbienceSetMusicCommand() | Creates a new AmbienceSetMusicCommand instance.

## Methods

- execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store) | void | protected method.

Also in this package: AmbienceClearCommand, AmbienceCommands, AmbienceEmitterAddCommand, AmbienceEmitterCommands

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<AmbienceFX> ambienceFxIdArg
