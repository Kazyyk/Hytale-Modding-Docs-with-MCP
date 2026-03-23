# MacroCommandParameter

Type: class | Package: com.hypixel.hytale.builtin.commandmacro

public class MacroCommandParameter

## Fields

- private String name
- private String description
- private MacroCommandParameter.ParameterRequirement requirement
- private MacroCommandParameter.ArgumentTypeEnum argumentType
- private String defaultValue
- private String defaultValueDescription
- private final ArgumentType<?> argumentType

## Methods

- public MacroCommandParameter.ParameterRequirement getRequirement()
- public String getName()
- public String getDescription()
- public MacroCommandParameter.ArgumentTypeEnum getArgumentType()
- public String getDefaultValue()
- public String getDefaultValueDescription()
- public ArgumentType<?> getArgumentType()

## Inner Types

- `MacroCommandParameter.ArgumentTypeEnum`
- `MacroCommandParameter.ParameterRequirement`

Also in this package: ArgumentTypeEnum, EchoCommand, MacroCommandBase, MacroCommandBuilder, MacroCommandPlugin, MacroCommandReplacement, ParameterRequirement, WaitCommand

Complete API:
  public MacroCommandParameter.ParameterRequirement getRequirement()
  public String getName()
  public String getDescription()
  public MacroCommandParameter.ArgumentTypeEnum getArgumentType()
  public String getDefaultValue()
  public String getDefaultValueDescription()

Fields:
public static final BuilderCodec<MacroCommandParameter> CODEC
private String name
private String description
private MacroCommandParameter.ParameterRequirement requirement
private MacroCommandParameter.ArgumentTypeEnum argumentType
private String defaultValue
private String defaultValueDescription
