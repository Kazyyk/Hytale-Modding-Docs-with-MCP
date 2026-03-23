# LightingCalculationCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.lighting

public class LightingCalculationCommand

Command to trigger lighting recalculation.

Also in this package: LightCalculationType, LightingCommand, LightingGetCommand, LightingInfoCommand, LightingInvalidateCommand, LightingSendCommand, LightingSendGlobalCommand, LightingSendLocalCommand, LightingSendToggleCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_INVALIDATE_LIGHTING
private static final Message MESSAGE_COMMANDS_LIGHTING_CALCULATION_ALREADY_FULLBRIGHT
private final RequiredArg<LightingCalculationCommand.LightCalculationType> calculationTypeArg
private final FlagArg invalidateFlag
