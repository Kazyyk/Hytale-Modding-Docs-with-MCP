# LightingSendToggleCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.lighting

public class LightingSendToggleCommand

Command to toggle automatic lighting send.

Known subclasses: LightingSendGlobalCommand, LightingSendLocalCommand

Also in this package: LightCalculationType, LightingCalculationCommand, LightingCommand, LightingGetCommand, LightingInfoCommand, LightingInvalidateCommand, LightingSendCommand, LightingSendGlobalCommand, LightingSendLocalCommand

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private final String statusTranslationKey
private final BooleanSupplier getter
private final Consumer<Boolean> setter
private final OptionalArg<Boolean> enabledArg
