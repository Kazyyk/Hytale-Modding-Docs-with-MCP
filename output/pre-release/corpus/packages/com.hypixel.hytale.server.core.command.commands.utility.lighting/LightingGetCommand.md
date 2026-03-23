# LightingGetCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.lighting

public class LightingGetCommand

Command to get light level at a position.

Also in this package: LightCalculationType, LightingCalculationCommand, LightingCommand, LightingInfoCommand, LightingInvalidateCommand, LightingSendCommand, LightingSendGlobalCommand, LightingSendLocalCommand, LightingSendToggleCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final RequiredArg<RelativeIntPosition> positionArg
private final FlagArg hexFlag
