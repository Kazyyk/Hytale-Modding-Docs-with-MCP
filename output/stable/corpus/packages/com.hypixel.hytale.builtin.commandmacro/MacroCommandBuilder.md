# MacroCommandBuilder

Type: class | Package: com.hypixel.hytale.builtin.commandmacro | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, MacroCommandBuilder>>

public class MacroCommandBuilder implements JsonAssetWithMap<String, DefaultAssetMap<String, MacroCommandBuilder>>

## Fields

- private String id
- private String name
- private String[] aliases
- private String description
- private MacroCommandParameter[] parameters
- private String[] commands
- private AssetExtraInfo.Data data

## Methods

- @Nullable public static CommandRegistration createAndRegisterCommand(@Nonnull MacroCommandBuilder builder)
- public String getName()
- public String getId()

Also in this package: ArgumentTypeEnum, EchoCommand, MacroCommandBase, MacroCommandParameter, MacroCommandPlugin, MacroCommandReplacement, ParameterRequirement, WaitCommand

Complete API:
  public static CommandRegistration createAndRegisterCommand(MacroCommandBuilder builder)
  public String getName()
  public String getId()

Fields:
public static final AssetBuilderCodec<String,MacroCommandBuilder> CODEC
private String id
private String name
private String[] aliases
private String description
private MacroCommandParameter[] parameters
private String[] commands
private AssetExtraInfo.Data data
