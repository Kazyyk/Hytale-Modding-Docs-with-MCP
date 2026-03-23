# MacroCommandPlugin

Type: class | Package: com.hypixel.hytale.builtin.commandmacro | Extends: JavaPlugin

public class MacroCommandPlugin extends JavaPlugin

## Fields

- private static MacroCommandPlugin instance
- private final Map<String, CommandRegistration> macroCommandRegistrations

## Methods

- public static MacroCommandPlugin get()
- @Override protected void setup()
- public void loadCommandMacroAsset(@Nonnull LoadedAssetsEvent<String, MacroCommandBuilder, DefaultAssetMap<String, MacroCommandBuilder>> event)

Also in this package: ArgumentTypeEnum, EchoCommand, MacroCommandBase, MacroCommandBuilder, MacroCommandParameter, MacroCommandReplacement, ParameterRequirement, WaitCommand

Complete API:
  public static MacroCommandPlugin get()
  protected void setup()
  public void loadCommandMacroAsset(LoadedAssetsEvent<String,MacroCommandBuilder,DefaultAssetMap<String,MacroCommandBuilder>> event)

Fields:
private static MacroCommandPlugin instance
private final Map<String,CommandRegistration> macroCommandRegistrations
