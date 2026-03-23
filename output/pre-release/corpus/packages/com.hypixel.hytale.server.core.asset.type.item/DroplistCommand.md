# DroplistCommand

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item | Extends: CommandBase

public class DroplistCommand extends CommandBase

Server command extending `CommandBase`.

## Constructors

- DroplistCommand() | Creates a new DroplistCommand instance.

## Methods

- executeSync(@Nonnull CommandContext context) | void | protected method.

Also in this package: FieldcraftCategoryPacketGenerator, ItemCategoryPacketGenerator, ResourceTypePacketGenerator

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private final RequiredArg<String> itemDroplistArg
private final OptionalArg<Integer> countArg
